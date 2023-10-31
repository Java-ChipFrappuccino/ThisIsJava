package ch12.sec03.exam02;

import java.util.HashSet;

public class HashSetExample {

	public static void main(String[] args) {
		HashSet hashSet = new HashSet();
		
		Student s1 = new Student(1, "홍길동");
		hashSet.add(s1);
		System.out.println(hashSet.size());
		System.out.println(s1);
		
		Student s2 = new Student(1, "홍길동");
		hashSet.add(s2);
		System.out.println(hashSet.size());
		System.out.println(s2);
		
		Student s3 = new Student(2, "홍길동");
		hashSet.add(s3);
		System.out.println(hashSet.size());
		System.out.println(s3);
		
		Student s4 = new Student(2, "박길동");
		hashSet.add(s4);
		System.out.println(hashSet.size());
		System.out.println(s4);
	}

}
