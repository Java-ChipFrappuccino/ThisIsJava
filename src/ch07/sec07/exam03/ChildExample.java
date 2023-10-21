package ch07.sec07.exam03;

public class ChildExample {
	public static void main(String[] args) {
		
		Parent parent = new Child();
		
		parent.field1 = "부모필드";
		System.out.println(parent.field1);
		parent.method1();
		parent.method2();
		
//		parent.field2 = "data2";
//		parent.method3();
		
		
		Child child = (Child)parent;
		
		child.field2 = "자식 필드";
		System.out.println(child.field1);
		System.out.println(child.field2);
		parent.field1 = "자식에서 부모필드";
		System.out.println(parent.field1);
		System.out.println(parent.field1);
		child.method3();
	}

}
