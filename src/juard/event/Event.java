package juard.event;

/**
 * Provides a general class for C#-like events.
 * 
 * @author hauke
 *
 */
public class Event extends AbstractEvent<EventHandler>
{
	/**
	 * Notified all registered event handler.
	 */
	public void fireEvent()
	{
		for (EventHandler eventHandler : _handlerList)
		{
			eventHandler.handleEvent();
		}
	}
}
