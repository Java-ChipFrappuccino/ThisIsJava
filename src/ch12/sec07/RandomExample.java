package ch12.sec07;

import java.util.Arrays;
import java.util.Random;

public class RandomExample {

	public static void main(String[] args) {
		int[] selectNumber = new int[6];
		Random random = new Random(3);
		System.out.print("선택번호: ");
		for (int i = 0; i < selectNumber.length; i++) {
			selectNumber[i] = random.nextInt(45)+1;
			System.out.print(selectNumber[i] + " ");
		}
		System.out.println();
		int[] winnerNumber = new int[6];
		Random random2 = new Random();
		System.out.print("당첨번호: ");
		for (int i = 0; i < winnerNumber.length; i++) {
			winnerNumber[i] = random2.nextInt(45)+1;
				System.out.print(winnerNumber[i] + " ");
		}
		System.out.println();
		
		Arrays.sort(selectNumber);
		Arrays.sort(winnerNumber);
		boolean result = Arrays.equals(selectNumber, winnerNumber);
		System.out.print("\n당첨여부: ");
		if (result) {
			System.out.println("당첨 되었습니다!");
		} else {
			System.out.println("꽝");	
		}
	}

}
