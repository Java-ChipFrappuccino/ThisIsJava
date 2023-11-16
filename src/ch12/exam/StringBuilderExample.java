package ch12.exam;

public class StringBuilderExample {

	public static void main(String[] args) {
		String str = "";
		long time1 = System.nanoTime();
				for (int i = 0; i <= 100; i++) {
					str += i;
				}
		long time2 = System.nanoTime();
				System.out.println(str);
				System.out.println(time2 - time1);
				
		StringBuilder str2 = new StringBuilder();
		for (int i = 0; i <= 100; i++) {
			str2.append(i);
		}
				
		System.out.println(str2.toString());
		
	}

}
