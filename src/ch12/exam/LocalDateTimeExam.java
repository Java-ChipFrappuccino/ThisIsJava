package ch12.exam;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class LocalDateTimeExam {

	public static void main(String[] args) {
		LocalDateTime today = LocalDateTime.now();
		LocalDateTime endyear = LocalDateTime.of(2023, 12, 31, 0 ,0,0);
		System.out.println(today.until(endyear, ChronoUnit.DAYS));
		
	}

}
