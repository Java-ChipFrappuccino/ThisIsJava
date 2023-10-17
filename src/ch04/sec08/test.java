package ch04.sec08;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		End : while (true) {
			String inputWord = scanner.nextLine();
			//			System.out.println("입력값: " + inputWord);

			switch (inputWord) {
			case "안녕":
				System.out.println("안녕하세요?");
				break;
			case "조용":
				System.out.println("조용히해 조용필!");
				break;
			case "나가기":
//				System.out.println("채팅을 종료합니다");
				break End;
			default:
				System.out.println("응답불가");
				break;
			}
		}
		System.out.println("종료되었습니다 , 감사합니다");
	}

}
