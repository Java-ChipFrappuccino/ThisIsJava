package ch04.sec08;

import java.util.Iterator;
import java.util.Scanner;

public class PracticeProblem {

	public static void main(String[] args) {
		//3번 문제
//		int num = 0;
//		for (int i = 0; i <= 100; i++) {
//			if (i%3 == 0) {
//				num += i;
//				System.out.println(i);
//			}
//		}
//		System.out.println("---------------");
//		System.out.println(num);
	
		//4번 문제
//		while (true) {
//
//			int dice1 = (int)(Math.random() * 6) + 1;
//			int dice2 = (int)(Math.random() * 6) + 1;
//			System.out.println("(" + dice1 + " , " + dice2 + ")");
//			if (dice1+dice2 == 5) {
//				break;
//			}
//		}
		
//		while (true) {
//			
//			int dice1 = (int)(Math.random() * 6) + 1;
//			int dice2 = (int)(Math.random() * 6) + 1;
//			int result = dice1 + dice2;
//			System.out.println("주사위1: " + dice1 + "\n주사위2: " + 
//					dice2 + "\n주사위의 합은: " + result + "\n");
//			if (result != 5) {
//				System.out.println("주사위의 합이 " + result + "입니다, 실패!\n");
//			} else {
//				System.out.println("주사위의 합이 " + result + "입니다, 통과!");
//				break;
//			}
//		}
//		System.out.println("---------------");
//		System.out.println("주사위 게임이 종료되었습니다");
//		System.out.println("---------------");
		
		//5번 문제
//		for (int x = 1; x < 11; x++) {
//			for (int y = 1; y < 11; y++) {
//				if ( (4*x) + (5*y) == 60 ) {
//					System.out.println("x:" + x + " y:" + y);
//					System.out.println();
//				}
//			}
//		}
		
		//6번 문제
		for(int i=1; i<= 5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
				}
			System.out.println();
			}
		

		//7번 문제
//		Scanner scanner = new Scanner(System.in);
//		
//		int money = 0;
//		
//		bank : while (true) {
//			System.out.println("---------------------------------");
//			System.out.println("1.입금 | 2.출금 | 3.잔고 | 4.종료");
//			System.out.println("---------------------------------");
//			System.out.print("선택>");
//			int choice = Integer.parseInt(scanner.nextLine());
//			switch (choice) {
//			case 1:
//				System.out.println("입금액>");
//				int a = Integer.parseInt(scanner.nextLine());
//				money += a;
//				System.out.println("입금액: "+ a + "\n잔액: " + money);
//				break;
//			case 2:
//				System.out.println("출금액>");
//				int b = Integer.parseInt(scanner.nextLine());
//				money -= b;
//				System.out.println("출금액: "+ b + "\n잔액: " + money);
//				break;
//			case 3:
//				System.out.println("잔고>" + money);
//				break;
//			case 4:
//				System.out.println("종료>");
//				break bank;
//			default :
//				System.out.println("잘못된 입력입니다.");
//			}
//		}
//		System.out.println("프로그램 종료");
	}

}
