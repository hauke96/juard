package juard.event;

/**
 * Provides a method that will be fired a certain events this handler is registered to.
 * 
 * @author hauke
 *
 */
public interface EventHandler
{
	/**
	 * This method will be called when event is fired.
	 */
	public void handleEvent();
}
