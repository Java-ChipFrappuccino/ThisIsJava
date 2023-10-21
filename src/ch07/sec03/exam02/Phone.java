package ch07.sec03.exam02;

public class Phone {
	public String model;
	public String color;
	
	public Phone() {
		System.out.println("Phone() 기본생성자 실행");
		
	}
	public Phone(String model, String color) {
		this.model = model;
		this.color = color;
		System.out.println("Phone() 매개변수생성자 실행");
	}

}
