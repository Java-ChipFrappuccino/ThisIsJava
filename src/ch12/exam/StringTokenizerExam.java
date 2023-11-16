package ch12.exam;

import java.util.StringTokenizer;

public class StringTokenizerExam {

	public static void main(String[] args) {
		String data = "아이디,이름,패스워드";
		StringTokenizer st = new StringTokenizer(data, ",");
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
			
		}
		
	}

}
