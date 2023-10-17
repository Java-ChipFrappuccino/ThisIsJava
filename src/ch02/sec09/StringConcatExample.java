package ch02.sec09;

	public class StringConcatExample {
		public static void main(String[] args) {
			//숫자 연산
			int result1 = 10 + 2 + 8;
			System.out.println("result1: " + result1);
			
			//결합 연산
			String result2 = 10 + 2 + "8";
			System.out.println("result2: " + result2);
			
			String reslult3 = 10 + "2" + 8;
			System.out.println("result3: " + reslult3);
			
			String reslult4 = "10" + 2 + 8;
			System.out.println("result4: " + reslult4);
			
			String reslult5 = "10" + (2 + 8);
			System.out.println("result5: " + reslult5);
			
		}

}
