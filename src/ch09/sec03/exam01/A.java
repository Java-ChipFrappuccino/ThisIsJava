package ch09.sec03.exam01;

public class A {
	static class B {
		void methodB() {
			System.out.println("methodB() 실행");
		}
	}
	
	B field1 = new B();
	static B field2 = new B();
	
	public A() {
		B field1 = new B();
	}
	void method1() {
		B field1 = new B();
	}
	static void method2() {
		B field1 = new B();
	}

}
