package ch05.sec12;

import java.util.Iterator;
import java.util.Scanner;

public class Example09 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] scores;
		scores = null;
		int totalScore = 0;
		int max = 0;
		double totalAvg = 0;
		
		Run : while (true) {
			System.out.println("------------------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("------------------------------------------------------");
			System.out.print("선택> ");
			String Num = scanner.nextLine();
			
			switch (Num) {
			case "1": System.out.print("학생수를 입력하세요.\n입력> ");
					  scores = new int[Integer.parseInt(scanner.nextLine())];
					  System.out.println("학생수: " + scores.length +"명\n");
				break;
				
			case "2": System.out.println("점수를 입력하세요.");
				      for (int i = 0; i < scores.length; i++) {
					  System.out.print( (i+1) + "번 학생> ");
					  scores[i] = Integer.parseInt(scanner.nextLine());
					  }
				break;
				
			case "3": for (int i = 0; i < scores.length; i++) {
					  System.out.println( (i+1) + "번 학생> " + scores[i]);
				      }
				break;
				
			case "4": for (int i = 0; i < scores.length; i++) {
				  	  	if (max<scores[i]) {
				  		  max = scores[i];
				  	  	}
					  }
					  System.out.println("최고점수: " + max + "점");
					  
					  for (int i : scores) {
					  totalScore += i;
					  }
					  totalAvg = (double)totalScore / scores.length;
					  System.out.printf("평균점수: %3.1f점\n", totalAvg);
				break;
				
			case "5":
				break Run;
				
			default:
					System.out.println("잘못된 입력입니다.\n");
			break;
			}
		}
			System.out.println("프로그램 종료");
	}

}
