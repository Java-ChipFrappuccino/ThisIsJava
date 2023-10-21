package ch07.sec09;

public class InstanceofExample {
	public static void personInfo(Person person) {
		System.out.println("name: " + person.name);
		person.walk();
//		if (person instanceof Student) {
//			Student student = (Student) person;
//			
//			System.out.println("studentNo: " + student.studentNo);
//			student.study();
//			
//		}
		if (person instanceof Student student) {
			System.out.println("studentNo: " + student.studentNo);
			student.study();
			
		}
		
	}
	public static void main(String[] args) {
		Person p1 = new Person("홍길동");
		personInfo(p1);
		
		System.out.println();
		
		Student student = new Student("김길동", 10);
		Person p2 = student;
		personInfo(p2);
		
		boolean t = p1 == p2;
		boolean y = student == p2;
		System.out.println(t);
		System.out.println(y);
	}

}
