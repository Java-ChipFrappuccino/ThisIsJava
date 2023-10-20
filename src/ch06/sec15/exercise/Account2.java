package ch06.sec15.exercise;

public class Account2 {

	private String a_no;
	private String owner;
	private int balance;
	
	public Account2(String a_no, String owner, int balance) {
		this.a_no = a_no;
		this.owner = owner;
		this.balance = balance;
	}

	public String getA_no() {
		return a_no;
	}

	public void setA_no(String a_no) {
		this.a_no = a_no;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
}
