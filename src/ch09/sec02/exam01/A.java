package ch09.sec02.exam01;

public class A {
//	A() {
//		B b = new B();
//		b.methodB();
//	}
	void methodA() {
		B b = new B();
		b.methodB();
	}
	public class B {
		public void methodB() {
			System.out.println("methodB() 실행");
			
		}
	}
}
