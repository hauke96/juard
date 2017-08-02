package juard.injection;

import java.text.MessageFormat;

/**
 * This exception will be fired if the Locator cannot resolve a type. This usually happens when this type hasn't been registered.
 * 
 * @author hauke
 *
 */
public class ResolutionFailedException extends RuntimeException
{
	private static final long serialVersionUID = 1L;
	
	/**
	 * Creates a resolution failed exception for the given class.
	 * 
	 * @param clazz
	 *            The class that couldn't be resolved.
	 */
	public ResolutionFailedException(Class<?> clazz)
	{
		super(MessageFormat.format("Failed to resolve class {0} ({1}). The type may not be registered in the Locator.", clazz.getSimpleName(), clazz.getName()));
	}
}
