package ch12.sec05;

import java.util.Random;
import java.util.StringTokenizer;

public class StringTokenizerExample {
	public static void main(String[] args) {
		String data1 = "홍길동_이세돌,빅연수,강서준";
		String[] arr = data1.split("_|,");
		for (String token : arr) {
			System.out.println(token);
			
		}
		System.out.println();
		
		String data2 = "홍길동,이세돌,빅연수,강서준";
		StringTokenizer st  = new StringTokenizer(data2, ",");
	    while (st.hasMoreTokens()) {
	    	String token = st.nextToken();
	    	System.out.println(token);
		}
	    Integer t = 300;
	    Integer t2 = 300;
	    System.out.println(t.hashCode());
	    System.out.println(t2.hashCode());
	    System.out.println(t == t2);
	    System.out.println(t.equals(t2));
	}

}
