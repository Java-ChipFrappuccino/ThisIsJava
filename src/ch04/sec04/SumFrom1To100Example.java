package ch04.sec04;

public class SumFrom1To100Example {
	public static void main(String[] args) {
		int sum = 0;
		int i;
		
		for (i = 1;  i <= 5; ++i) {
			sum += i;
		}
		System.out.println(sum);
		System.out.println("1~ + " + (i-1) + " 합 : " + sum);
	}

}
