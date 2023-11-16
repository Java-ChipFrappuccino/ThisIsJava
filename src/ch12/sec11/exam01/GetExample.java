package ch12.sec11.exam01;

public class GetExample {

	public static void main(String[] args) {
//		Class clazz = Car.class;
//		Class clazz = Class.forName("ch12.sec11.exam01.Car");
		Car car = new Car();
		Class clazz = car.getClass();
				
		System.out.println(clazz.getPackage());
		System.out.println(clazz.getSimpleName());
		System.out.println(clazz.getName());

	}

}
