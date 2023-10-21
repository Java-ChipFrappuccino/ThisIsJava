package ch07.sec06.pakage2;

import ch07.sec06.pakage1.A;

public class D extends A{

	public D() {
		super();
	}
	
	public void method1() {
		this.field = "value";
		this.method1();
		
	}
	public void method2() {
//		A a = new A();
//		a.field = "value";
//		a.method1();
		
	}
}
