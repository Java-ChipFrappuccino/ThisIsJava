package ch06.sec15.exercise.retest;

import java.util.Scanner;

public class BankApplication {
static Account[] accountArray = new Account[100];
static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		
		bank : while (true) {
			System.out.println("------------------------------------------");
			System.out.println("1.계좌생성|2.계좌목록|3.입금|4.출금|5.종료");
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

			}
		}
		System.out.println("프로그램 종료");
	}
	private static void withdraw() {
		System.out.println("-------------");
		System.out.println("출금");
		System.out.println("-------------");	
		System.out.print("계좌번호: ");
		String ano = scanner.nextLine();
		Account find = findAccount(ano);
		if (find == null) {
			System.out.println("잘못된 계좌번호 입니다.");

		} else {
			System.out.print("출금액: ");
			int money = Integer.parseInt(scanner.nextLine());
			find.setMoney(find.getMoney() - money);	
		}
	}
	private static void deposit() {
		System.out.println("-------------");
		System.out.println("입금");
		System.out.println("-------------");	
		System.out.print("계좌번호: ");
		String ano = scanner.nextLine();
		Account find = findAccount(ano);
		if (find == null) {
			System.out.println("잘못된 계좌번호 입니다.");
			
		} else {
			System.out.print("입금액: ");
			int money = Integer.parseInt(scanner.nextLine());
			find.setMoney(find.getMoney() + money);
		}
	}
	private static Account findAccount(String ano) {
		Account account = null;
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] != null) {
				String dbAno = accountArray[i].getAno();
				if (dbAno.equals(ano)) {
					account = accountArray[i];
				}
			}
		}
		return account;
	}
	private static void accountList() {
		System.out.println("-------------");
		System.out.println("계좌목록");
		System.out.println("-------------");	
		
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] != null) {
				System.out.print(accountArray[i].getAno() + "     ");
				System.out.print(accountArray[i].getName() + "     ");
				System.out.println(accountArray[i].getMoney());
				
			}
			
		}
	}
	private static void accountCreate() {
		System.out.println("-------------");
		System.out.println("계좌생성");
		System.out.println("-------------");
		
		System.out.print("계좌번호: ");
		String ano = scanner.nextLine();
		System.out.print("계좌주: ");
		String name = scanner.nextLine();
		System.out.print("초기 입금액: ");
		int seedMoney = Integer.parseInt(scanner.nextLine());
		
		Account newAccount = new Account(ano, name, seedMoney);
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] == null) {
				accountArray[i] = newAccount;
				System.out.println("계좌가 생성되었습니다.");
				break;
			}
		}		
	}
}
