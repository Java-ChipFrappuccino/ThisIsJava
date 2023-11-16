package ch12.sec10;

import java.util.regex.Pattern;

public class PatternExample {

	public static void main(String[] args) {
		String regExp = "(02|010|032|011)-\\d{3,4}-\\d{4}";
		String data = "011-538-4759";
		boolean result = Pattern.matches(regExp, data);
		if (result) {
			System.out.println("올바른 형식입니다.");
		} else {
			System.out.println("잘못된 입력입니다.");
		}
		
		regExp = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
		data = "coco@naver.com.cool23";
		result = Pattern.matches(regExp, data);
		if (result) {
			System.out.println("올바른 형식입니다.");
		} else {
			System.out.println("잘못된 입력입니다.");
		}
	}

}
