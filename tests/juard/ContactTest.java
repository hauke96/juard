package juard;

import org.junit.Test;

import juard.contract.Contract;
import juard.contract.ContractFailedException;

public class ContactTest
{
	/**
	 * Test if an exception occurs when null has been passed.
	 */
	@Test (expected = ContractFailedException.class)
	public void testContractNotNullExpectedFail()
	{
		Object obj = null;
		
		Contract.NotNull(obj);
	}
	
	/**
	 * Test if no exception occurs when an object has been passed.
	 */
	@Test
	public void testContractNotNullExpectedCorrect()
	{
		Object obj = new Object();
		
		Contract.NotNull(obj);
	}
	
	/**
	 * Test if an exception occurs when an empty string has been passed.
	 */
	@Test (expected = ContractFailedException.class)
	public void testContractNotEmptyExpectedFail()
	{
		String s = "";
		
		Contract.NotNullOrEmpty(s);
	}
	
	/**
	 * Test if an exception occurs when null has been passed.
	 */
	@Test (expected = ContractFailedException.class)
	public void testContractNotEmptyNotNullExpectedFail()
	{
		String s = null;
		
		Contract.NotNullOrEmpty(s);
	}
	
	/**
	 * Test if no exception occurs when a valid string (! null && !empty) has been passed.
	 */
	@Test
	public void testContractNotEmptyExpectedCorrect()
	{
		String s = "foo";
		
		Contract.NotNullOrEmpty(s);
	}
}
