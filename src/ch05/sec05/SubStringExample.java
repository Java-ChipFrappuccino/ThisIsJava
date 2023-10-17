package ch05.sec05;

public class SubStringExample {
	public static void main(String[] args) {
		String id = "950622-1132398";
		
		String firstNum = id.substring(0,6);
		String secondNum = id.substring(7);
		
		System.out.println("앞자리: " + firstNum);
		System.out.println("뒷자리: " + secondNum);
	}
}