package ch12.sec05;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class BytesToStringExample {
	public static void main(String[] args) {
		String data = "a자바";
		
		String co = "1990";
		System.out.println(co);
		System.out.println(co.hashCode());
		
		co = "1990625";
		System.out.println(co);
		System.out.println(co.hashCode());
//		try {
//			byte[] arr1 = data.getBytes("EUC-KR");
//			System.out.println(arr1.length);
//			System.out.println(Arrays.toString(arr1));
//			
//			String data2 = new String(arr1, "EUC-KR");
//			System.out.println(data2);
//			
//		} catch (UnsupportedEncodingException e) {
//			e.printStackTrace();
//		}
		String name = "김자바,박자바-자르박!홍박사@용박사";
				String[] names = name.split(",|-|!|@");
				for (int i = 0; i < names.length; i++) {
					String string = names[i];
					System.out.println(string);
					
				}
	}

}
