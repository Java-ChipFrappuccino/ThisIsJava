package ch12.sec08;

import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeOperationExample {

	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy.MM.dd a HH:mm:ss");
		System.out.println(now.format(dtf));
		
		LocalDateTime result1 = now.plusYears(1);
		System.out.println(result1.format(dtf));
		
		DecimalFormat df = new DecimalFormat("0.0");
		String result = df.format(1234567.75);
		System.out.println(result);
	}

}
