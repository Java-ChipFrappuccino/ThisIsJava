package ch06.sec10.exam01;

public class CarculatorExample {
	public static void main(String[] args) {
		Calculator myCarcu = new Calculator();
		
		double result1 = 10 * 10 * Calculator.pi;
		int result2 = Calculator.plus(10, 5);
		int result3 = Calculator.minus(10, 5);
		double result5 = 10 * 10 * myCarcu.pi;
		int result6 = myCarcu.minus(10, 5);
		
		System.out.println("result1: " + result1);
		System.out.println("result2: " + result2);
		System.out.println("result3: " + result3);
		System.out.println("result5: " + result5);
		System.out.println("result6: " + result6);
	}
}
