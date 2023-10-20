package ch06.sec15.exercise;

import java.util.Scanner;

public class BankApplication {
	private static Scanner scanner = new Scanner(System.in);
	private static Account2[] accountArray = new Account2[100];
	
	public static void main(String[] args) {
		
		bank : while(true) {
				System.out.println("------------------------------------------");
				System.out.println("1.계좌생성|2.계좌목록|3.예금|4.출금|5.종료");
				System.out.println("------------------------------------------");
				System.out.print("선택> ");
				String choice = scanner.nextLine();
			
			
			
			switch (choice) {
			case "1": accountCreate();
				
				break;
			case "2": accountList();
				
				break;
			case "3": deposit();
				
				break;
			case "4": withdraw();
				
				break;
			case "5":	
				break bank;
			default: System.out.println("잘못된 입력입니다.");
				break;
			}
		}
		System.out.println("프로그램 종료");
	}

	private static void withdraw() {
		System.out.println("-----------");
		System.out.println("출금");
		System.out.println("-----------");
		System.out.print("계좌번호: ");
		String a_no = scanner.nextLine();
		System.out.print("출금액: ");
		int money = Integer.parseInt(scanner.nextLine());
		
		Account2 account = findAccount(a_no);
		if (account == null) {
			System.out.println("결과: 계좌가 없습니다.");
			return;
		}
		account.setBalance(account.getBalance() - money);
		System.out.println("결과: 출금되었습니다.");
		
	}

	private static void deposit() {
		System.out.println("-----------");
		System.out.println("예금");
		System.out.println("-----------");
		System.out.print("계좌번호: ");
		String a_no = scanner.nextLine();
		System.out.print("예금액: ");
		int money = Integer.parseInt(scanner.nextLine());
		
		Account2 account = findAccount(a_no);
		if (account == null) {
			System.out.println("결과: 계좌가 없습니다.");
			return;
		}
		account.setBalance(account.getBalance() + money);
		System.out.println("결과: 입금되었습니다.");
	}

	private static Account2 findAccount(String a_no) {
		Account2 account = null;
		for (int i = 0; i < accountArray.length; i++) {
				if (accountArray[i] != null) {
					String dbA_no = accountArray[i].getA_no();	
					if (dbA_no.equals(a_no)) {
						account = accountArray[i];
						break;
					}
				}
		}
		return account;
	}

	private static void accountList() {
		System.out.println("-----------");
		System.out.println("계좌목록");
		System.out.println("-----------");
		
		for (int i = 0; i < accountArray.length; i++) {
		Account2 account = accountArray[i];
		if (account != null) {
			System.out.print(account.getA_no());
			System.out.print("    ");
			System.out.print(account.getOwner());
			System.out.print("    ");
			System.out.print(account.getBalance());
			System.out.println();
		}
		}
	}

	private static void accountCreate() {
		System.out.println("-----------");
		System.out.println("계좌생성");
		System.out.println("-----------");
		
		System.out.print("계좌번호: "); 
		String a_no = scanner.nextLine();		
		
		System.out.print("계좌주: ");
		String owner = scanner.nextLine();
		
		System.out.print("초기입금액: ");
		int balance = Integer.parseInt(scanner.nextLine());
		
		Account2 newAccount = new Account2(a_no, owner, balance);
		
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] == null) {
				accountArray[i] = newAccount;
				System.out.println("결과: 계좌가 생성되었습니다. ");
				break;
			}
		}
		
		
	}
}
