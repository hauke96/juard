package juard.injection;

import java.util.HashMap;
import java.util.Map;

import juard.contract.Contract;

/**
 * This class is used to implement dependency injection. All services are created here.
 * 
 * @author hauke
 *
 */
public class Locator
{
	/**
	 * This interface is used to create instances of a specific type.
	 * 
	 * @author hauke
	 *
	 * @param <T>
	 *            The type which instance should be created.
	 */
	public interface ServiceInstanceCreator<T>
	{
		/**
		 * @return An instance of Type {@code T}.
		 */
		T resolve();
	}
	
	private static Map<Class<?>, ServiceInstanceCreator<?>>	_registeredServices;
	private static Map<Class<?>, Object>					_initializedServices;
	private static boolean									_serviceLocatorInitialized;
	
	/**
	 * Initializes the service locator. This is needed to resolve the services.
	 */
	static
	{
		_registeredServices = new HashMap<>();
		_initializedServices = new HashMap<>();
		_serviceLocatorInitialized = true;
	}
	
	/**
	 * Registers an instance creator for the given type.
	 * Multiple registrations will replace the older one (there's only one at a time).
	 * 
	 * @param clazz
	 *            The class type
	 * @param t
	 *            The instance creator
	 */
	public static <T> void register(Class<T> clazz, ServiceInstanceCreator<T> t)
	{
		Contract.Satisfy(_serviceLocatorInitialized);
		
		_registeredServices.put(clazz, t);
	}
	
	/**
	 * Will resolve an object of the desired type.
	 * 
	 * @param clazz
	 *            The type of the objects as class-object.
	 * @return The desired object.
	 */
	public static <T> T get(Class<T> clazz)
	{
		Contract.Satisfy(_serviceLocatorInitialized);
		Contract.NotNull(clazz);
		
		if (_initializedServices.containsKey(clazz))
		{
			@SuppressWarnings ("unchecked") // we will either get null or the correct type
			T service = (T) _initializedServices.get(clazz);
			return service;
		}
		
		ServiceInstanceCreator<?> serviceCreator = _registeredServices.get(clazz);
		if (serviceCreator == null)
		{
			throw new ResolutionFailedException(clazz);
		}
		
		@SuppressWarnings ("unchecked") // we will either get null or the correct type
		T resolvedService = (T) serviceCreator.resolve();
		_initializedServices.put(clazz, resolvedService);
		
		return resolvedService;
	}
}
