package logic;

import java.util.ArrayList;
import java.util.List;

public class TransactionsManager {
	
	private List<Transaction> transactionList;
	private double balance;
	
	public TransactionsManager() {
		transactionList = new ArrayList<>();
		balance = 0.0;
	}

	public boolean registerTransaction(Transaction t) {
		boolean result = true;
				
		if(!containsTransaction(t)) {
			transactionList.add(t);
			balance += t.getValue() / 10;
			
			System.out.println("New transaction is: " + t.getValue() + " (" + t.getDate() + ")");
			System.out.println("Balance is: " + balance);
		}
		else {
			result = false;
		}
		
		return result;
	}
	
	private boolean containsTransaction(Transaction t) {
		boolean result = false;
		
		for(Transaction transaction : transactionList) {
			if(transaction.getDate().equals(t.getDate())) {
				result = true;
				break;
			}
		}
		
		return result;
	}
}
