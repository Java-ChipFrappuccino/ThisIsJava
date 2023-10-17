package ch03.sec07;

public class LogicalOperatorExample {
	public static void main(String[] args) {
		char t = 'a';
		int y = t;
		System.out.println(y);
		
		int charCode = 'a';
		
		if ( (65<=charCode) & (charCode<=90) ) {
			System.out.println("대문자");
		}
		
		if( (charCode>=97) && (charCode<=122) ) {
			System.out.println("소문자");
		}
		
		if ( (48<=charCode) && (charCode<=57) ) {
			System.out.println("0~9숫자");
		}
		
		
		int value = 7;
		
		if ( (value%2==0) | (value%3==0) ) {
			System.out.println("2 또는 3의 배수");
		}
		
		boolean result = (value%2==0) || (value%3==0);
		System.out.println(result);
		if (!result) {
			System.out.println("2 또는 3의 배수 아님");
			
		}
	}
}
