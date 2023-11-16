package ch12.exam;

import java.util.regex.Pattern;

public class PatternMatcherExample {

	public static void main(String[] args) {
		String id = "Angel104rwr";
		String regExp = "[a~z,A~Z]\\w{7,11}";
		boolean isMatch = Pattern.matches(regExp, id);
		if (isMatch) {
			System.out.println("올바른 아이디입니다.");
		} else {
			System.out.println("잘못된 아이디입니다.");
		}
	}
}
