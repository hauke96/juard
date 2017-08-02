package juard.event;

import java.util.ArrayList;
import java.util.List;

import juard.contract.Contract;

/**
 * The AbstractEvent is the basic shape of an event class.
 * 
 * @author hauke
 *
 * @param <T>
 *            The type of notifier that this event will be able to handle.
 */
public abstract class AbstractEvent<T>
{
	protected List<T> _handlerList;
	
	public AbstractEvent()
	{
		_handlerList = new ArrayList<>();
	}
	
	/**
	 * Registers the given event handler which must not be null.
	 * 
	 * Duplicates are allowed.
	 * 
	 * @param eventHandler
	 *            The handler to register.
	 */
	public void add(T eventHandler)
	{
		Contract.NotNull(eventHandler);
		
		_handlerList.add(eventHandler);
	}
	
	/**
	 * Removes all registered listeners from this event.
	 */
	public void clean()
	{
		_handlerList.clear();
	}
	
	/**
	 * @return The amount of registered observers. Note that duplicates are allowed.
	 */
	public int countObservers()
	{
		return _handlerList.size();
	}
}
