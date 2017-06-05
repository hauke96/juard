package juard.contract;

/**
 * This exception is thrown when a postcondition failed (was not true) in a contract.
 * 
 * @author hauke
 *
 */
public class ContractFailedException extends RuntimeException
{
	private static final long serialVersionUID = 1L;
	
	@SuppressWarnings ("javadoc")
	public ContractFailedException(String message)
	{
		super(message);
	}
}
