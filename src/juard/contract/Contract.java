package juard.contract;

import java.text.MessageFormat;

/**
 * This class offers many contact methods to ensure pre- and postconditions.
 * 
 * @author hauke
 *
 */
public class Contract
{
	/**
	 * Checks if the given value is {@code true}. When it's not, it'll throw a {@link ContractFailedException}.
	 * 
	 * @param expression
	 *            An expression to check.
	 */
	public static void Satisfy(boolean expression)
	{
		if (!expression)
		{
			throw new ContractFailedException("The contract failed. The given expression was not true.");
		}
	}
	
	/**
	 * Checks if the given variable is not null. If so, an {@link ContractFailedException} will be thrown.
	 *
	 * @param variable
	 *            The variable to check.
	 */
	public static void NotNull(Object variable)
	{
		if (variable == null)
		{
			throw new ContractFailedException("The given object is null.");
		}
	}
	
	/**
	 * Checks if the given variable is not null and if it also is not an empty string. Is one of these conditions does not apply, a {@link ContractFailedException} will be thrown.
	 *
	 * @param variable
	 *            The variable to check.
	 */
	public static void NotNullOrEmpty(String variable)
	{
		if (variable == null)
		{
			throw new ContractFailedException("The given string is null.");
		}
		else if (variable.isEmpty())
		{
			throw new ContractFailedException("The given string is empty.");
		}
	}
	
	/**
	 * Checks if the two objects are equal or not. This method uses the normal {@link #equals(Object)} method.
	 * If the two objects are unequal, a ContractFailedException will be thrown.
	 * 
	 * @param obj1
	 *            The first object to check.
	 * @param obj2
	 *            The second object to check.
	 */
	public static void AreEqual(Object obj1, Object obj2)
	{
		// Of one of them is null, they are unequal
		if (obj1 == null && obj2 != null || obj2 == null && obj1 != null)
		{
			throw new ContractFailedException(MessageFormat.format("The given objects are not equal: {0} != {1}", obj1, obj2));
		}
		
		// if they to not fulfill the equals-method, they are unequal
		if (obj1 != null && !obj1.equals(obj2))
		{
			throw new ContractFailedException(MessageFormat.format("The given objects are not equal: {0} != {1}", obj1, obj2));
		}
	}
}
