package ch12.exam;

import java.util.Iterator;

public class NanoTime {

	public static void main(String[] args) {
		long time1 = System.nanoTime();
		
		int[] scores = new int [1000];
		for (int i = 0; i < scores.length; i++) {
			scores[i] = i;
		}
		int sum= 0;
		for (int score : scores) {
			sum += score;
		}
		
		double avg = (double)sum / scores.length;
		System.out.println(avg);
		
		long time2 = System.nanoTime();
		System.out.println("총 연산시간: " + (time2 - time1)+"nano/sec");
	} 

}
