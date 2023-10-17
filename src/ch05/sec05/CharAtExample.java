package ch05.sec05;

public class CharAtExample {
	public static void main(String[] args) {
		String id = "950624231994";
		char sex = id.charAt(6);
		switch (sex) {
		case '1' , '3':
			System.out.println("남자입니다.");
			break;
		case '2' , '4':
			System.out.println("여자입니다.");
		break;
		default:
			System.out.println("외계인입니다.");
			break;
			
		}
	}

}
