package ch02.sec04;

	public class FloatDoubleExample {
		public static void main(String[] args) {
			
			//정밀도 확인 
			//float는 소수 아래 7자리, double는 소수 아래 15자리
			float var1 = 0.1234567890123456789F;
			double var2 = 0.1234567890123456789;
			System.out.println("var1: " + var1);
			System.out.println("var2: " + var2);
			
			
			//10의 거듭제곱 리터럴 e는 10
			double var3 = 3e6;
			float var4 = 3e6F;
			double var5 = 2E-3;
			System.out.println("var3: " + var3);
			System.out.println("var4: " + var4);
			System.out.println("var5: " + var5);
			
		}

}
