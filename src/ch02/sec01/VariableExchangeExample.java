package ch02.sec01;

public class VariableExchangeExample {
	public static void main(String[] args) {
		int x = 5;
		int y = 7;
		System.out.println("x:" + x + ", y:" + y);
		
		int temp = x;
		x = 13;
		y = temp;
		System.out.println("x:" + x + ", y:" + y);
	}
}