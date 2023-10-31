package ch11.sec03.exam01;

public class ExceptionHandlingExample {
	public static void main(String[] args) {
		
		String[] array = {"100", "1oo"};
		
		for (int i = 0; i <= array.length; i++) {
			try {
				System.out.println(array[i]);
			int value = Integer.parseInt(array[i]);
			System.out.println(value);
			} catch (NumberFormatException e) {
				System.out.println("숫자로 변환할수 없습니다.");
			} catch (Exception e) {
				System.out.println("항목수가 부족합니다.");
				
			}
			
		}
	}

}
