package logic;

public class Transaction {

	private double value;
	private String date;
	
	public Transaction(double value, String date) {
		this.value = value;
		this.date = date;
	}

	public double getValue() {
		return value;
	}

	public String getDate() {
		return date;
	}
	
}
