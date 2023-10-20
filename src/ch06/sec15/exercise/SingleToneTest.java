package ch06.sec15.exercise;

public class SingleToneTest {
	public static void main(String[] args) {
		Singletone obj1 = Singletone.only();
		Singletone obj2 = Singletone.only();
//		Singletone obj3 = new Singletone();
		
		if (obj1 ==obj2) {
			System.out.println("같은 객체입니다.");
		} else {
			System.out.println("다른 객체입니다.");
		}
	}

}
