package ch06.sec15.exercise;

public class Account {
	private int balance;
	static final int MIN_BALANCE = 0;
	static final int MAX_BALANCE = 1000000;
	
	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		if (balance < MIN_BALANCE || MAX_BALANCE < balance) {
			System.out.println("음수 혹은 백만원을 초과해서 입력할수 없습니다.\n");
		} else {
		this.balance = balance;
		System.out.println(balance + "원이 입금되었습니다.");
		}	
	}
}

