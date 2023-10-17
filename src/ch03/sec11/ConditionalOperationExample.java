package ch03.sec11;

import java.lang.reflect.InvocationTargetException;

public class ConditionalOperationExample {
	public static void main(String[] args) {
//		int score = 89;
//		char grade = (score > 90) ? 'A' : ( (score > 80) ? 'B' : 'C' );
//		System.out.println(score + "점은 " + grade + "등급입니다.");
//		
//		int top =5;
//		int bottom =10;
//		int height = 7;
//		double area = (top+bottom) * height / 2.0;
//		double area1 = (top+bottom) * height *1.0 / 2;
//		double area2 = (double)(top+bottom) * height / 2;
//		double area3 = (double)((top+bottom) * height / 2);
//		System.out.println(area);
//		System.out.println(area1);
//		System.out.println(area2);
//		System.out.println(area3);
//		int val = 356;
//		System.out.println(val/100*100);
		
		int x = 10;
		int y = 20;
		int z = (++x) + (y--);
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println("------------");
		
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println("------------");
		
		System.out.println(x); 
		System.out.println(y);
		System.out.println(z);
	}

}
