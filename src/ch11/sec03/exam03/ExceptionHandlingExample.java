package ch11.sec03.exam03;

public class ExceptionHandlingExample {
	public static void main(String[] args) {
		
		String[] array = {"10", "1oo" , null , "2000"};
		
		for (int i = 0; i <= 4; i++) {
			try {
				System.out.println(array[i].length());
			int value = Integer.parseInt(array[i]);
//			} catch (NumberFormatException e) {
//				System.out.println("숫자로 변환할수 없습니다.");
//				System.out.println(e.toString());
//			} catch (NullPointerException | ArrayIndexOutOfBoundsException e) {
//				System.out.println("문자열이 없거나 항목수를 초과했습니다.");
//				System.out.println(e.getMessage());
			} catch (Exception e) {
				System.out.println("예상치 못한 예외발생.");
				e.printStackTrace();
			}
			
		}
	}

}
