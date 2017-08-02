package juard.event;

import java.util.ArrayList;
import java.util.List;

/**
 * The EventArgs is a simple event but can handle arguments passed through to the handler.
 * 
 * @author hauke
 * @param <T>
 *            The type of the argument being passed
 *
 */
public class DataEvent<T>
{
	/**
	 * Provides a method that will be fired a certain events this handler is registered to.
	 * 
	 * @author hauke
	 *
	 */
	public interface DataEventHandler<T>
	{
		/**
		 * This method will be called when event is fired.
		 * 
		 * @param data
		 *            Some data that should be send from sender to receiver.
		 */
		public void handleEvent(T... data);
	}
	
	private List<DataEventHandler<T>> _handlerList;
	
	/**
	 * Creates a new Event.
	 */
	public DataEvent()
	{
		_handlerList = new ArrayList<>();
	}
	
	/**
	 * Registers the given event handler.
	 * 
	 * Duplicates are allowed.
	 * 
	 * @param eventHandler
	 *            The handler to register.
	 */
	public void add(DataEventHandler<T> eventHandler)
	{
		_handlerList.add(eventHandler);
	}
	
	/**
	 * Notified all registered event handler.
	 * 
	 * @param data
	 *            Some data that should be passed to the handler.
	 */
	public void fireEvent(T... data)
	{
		for (DataEventHandler<T> eventHandler : _handlerList)
		{
			eventHandler.handleEvent(data);
		}
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
