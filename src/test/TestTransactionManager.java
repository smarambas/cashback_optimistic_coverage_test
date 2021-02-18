package test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import logic.Transaction;
import logic.TransactionsManager;

public class TestTransactionManager {
	
	@Test
	public void testRegisterTransactionSuccess() {
		Transaction transaction = new Transaction(15, "18/02/2021 18:00");
		
		TransactionsManager transactionsManager = new TransactionsManager();
		
		boolean result = transactionsManager.registerTransaction(transaction);
		
		assertTrue(result);
	}
	
	@Test
	public void testRegisterTransactionFailure() {
		Transaction transaction = new Transaction(15, "18/02/2021 18:00");
		
		TransactionsManager transactionsManager = new TransactionsManager();
		
		//we add the same transaction twice
		transactionsManager.registerTransaction(transaction);
		boolean result = transactionsManager.registerTransaction(transaction);
		
		assertFalse(result);
	}
}
