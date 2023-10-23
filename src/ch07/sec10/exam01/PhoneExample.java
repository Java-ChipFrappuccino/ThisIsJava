package ch07.sec10.exam01;

public class PhoneExample {
	public static void main(String[] args) {
		SmartPhone smartphone = new SmartPhone("김자바");
		smartphone.turnOn();
		smartphone.turnOff();
		smartphone.internetSearch();
		System.out.println(smartphone.owner);
		smartphone.owner = "박자바"; 
		System.out.println(smartphone.owner);
			
	}

}
