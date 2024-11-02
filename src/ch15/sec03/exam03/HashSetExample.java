package ch15.sec03.exam03;

import java.util.*;

public class HashSetExample {
	public static void main(String[] args) {
		//HashSet 컬렉션 생성
		Set<String> set = new HashSet<String>();
		
		//객체 추가
		set.add("Java");
		set.add("JDBC");
		set.add("JSP");
		set.add("Spring");
		
		//객체를 하나씩 가져와서 처리
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			//객체를 하나 가져오기
			String element = iterator.next();
			System.out.println( element);
			if(element.equals("JSP")) {
				//가져온 객체를 컬렉션에서 제거, 이터레이터는 객체를 복사해서 직접 가져오는게 아닌 컬렉션에서 참조를 가져오는것, 그걸 지우는 행위를 하면 해당 컬렉션의 참조가 지워지므로 그 객체가 지워진다.
				iterator.remove();
			}
		}
		System.out.println();
		
		//객체 제거
		set.remove("JDBC");
		
		//객체를 하나씩 가져와서 처리
		for(String element : set) {
			if(element.equals("Spring")) {
				set.remove(element); // 이렇게 하면 ConcurrentModificationException 예외가 발생할수 있다!
			}
			System.out.println(element);
		}
	}
}