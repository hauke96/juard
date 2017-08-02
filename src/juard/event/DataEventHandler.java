package juard.event;

/**
 * Provides a method that will be fired a certain events this handler is registered to.
 * 
 * @author hauke
 * @param <T>
 *            The type of the data object being passed
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
	public void handleEvent(T data);
}
