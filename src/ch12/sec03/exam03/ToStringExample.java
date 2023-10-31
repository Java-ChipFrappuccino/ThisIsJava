package ch12.sec03.exam03;

public class ToStringExample {

	public static void main(String[] args) {
		SmartPhone smartPhone = new SmartPhone("APPLE", "iOS");
		
		String strObj = smartPhone.toString();
		System.out.println(strObj);
		
		System.out.println(smartPhone.toString());
		
		System.out.println(smartPhone);
	}

}
