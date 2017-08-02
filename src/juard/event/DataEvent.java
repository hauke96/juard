package juard.event;

/**
 * The EventArgs is a simple event but can handle arguments passed through to the handler.
 * 
 * @author hauke
 * @param <T>
 *            The type of the argument being passed
 *
 */
public class DataEvent<T> extends AbstractEvent<DataEventHandler<T>>
{
	/**
	 * Notified all registered event handler.
	 * 
	 * @param data
	 *            Some data that should be passed to the handler.
	 */
	public void fireEvent(T data)
	{
		for (DataEventHandler<T> eventHandler : _handlerList)
		{
			eventHandler.handleEvent(data);
		}
	}
}
