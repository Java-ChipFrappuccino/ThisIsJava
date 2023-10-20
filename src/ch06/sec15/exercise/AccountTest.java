package ch06.sec15.exercise;

public class AccountTest {
	public static void main(String[] args) {
		Account account = new Account();
		System.out.println("현재 잔고는 "+ account.getBalance() + "원 입니다.\n");
		account.setBalance(5760);
		System.out.println("현재 잔고는 "+ account.getBalance() + "원 입니다.\n");
		account.setBalance(-50);
		System.out.println("현재 잔고는 "+ account.getBalance() + "원 입니다.\n");
		account.setBalance(2000000);
		System.out.println("현재 잔고는 "+ account.getBalance() + "원 입니다.\n");
		account.setBalance(976500);
		System.out.println("현재 잔고는 "+ account.getBalance() + "원 입니다.\n");
		
	}

}
