package ch05.sec05;

public class EqualsExample {
	public static void main(String[] args) {
		String s1 = "홍길동";
		String s2 = "홍길동";
		
		if (s1 == s2) {
			System.out.println("s1과 s2는 참조가 같음");
		} else {
			System.out.println("s1과 s2는 참조가 다름");
		}
		
		if (s1.equals(s2)) {
			System.out.println("s1과 s2는 문자열이 같음");
		}
		
		String s3 = new String("홍길동");
		String s4 = new String("홍길동");
		
		if (s3 == s4) {
			System.out.println("s3과 s4는 참조가 같음");
		} else {
			System.out.println("s3과 s4는 참조가 다름");
		}
		
		if (s3.equals(s4)) {
			System.out.println("s3과 s4는 문자열이 같음");
		}
		
		
	}

}
