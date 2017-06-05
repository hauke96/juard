package juard.contract;

/**
 * This exception is thrown when a postcondition failed (was not true) in a contract.
 * 
 * @author hauke
 *
 */
public class PostconditionFailedException extends RuntimeException
{
	private static final long serialVersionUID = 1L;
	
	@SuppressWarnings ("javadoc")
	public PostconditionFailedException(String message)
	{
		super(message);
	}
}
