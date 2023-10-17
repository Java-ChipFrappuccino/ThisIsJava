package ch05.sec12;

import java.time.DayOfWeek;
import java.util.Calendar;

public class WeekExample {
	public static void main(String[] args) {
		Week today = null;
		
		today = Week.THURSDAY;
		
		if (today == Week.FRIDAY) {
			System.out.println("오늘은 불금입니다!!!");
		} else {
			System.out.println("오늘은 불금이 아닙니다");
		}
		
		Calendar now = Calendar.getInstance();
		int day = now.get(Calendar.DAY_OF_WEEK);
		
		switch (day) {
			case 1: {today = Week.SUNDAY; 
			System.out.println("월요일"); break;} 
			case 2: {today = Week.MONDAY; 
			System.out.println("일요일"); break;}
			case 3: {today = Week.TUESDAY; 
			System.out.println("화요일"); break;}
			case 4: {today = Week.WEDNEDAY; 
			System.out.println("수요일"); break;}
			case 5: {today = Week.THURSDAY; 
			System.out.println("목요일"); break;}
			case 6: {today = Week.FRIDAY;
			System.out.println("금요일"); break;}
			case 7: {today = Week.SATURDAY;
			System.out.println("토요일"); break;}
		}
		
		if (today == Week.MONDAY) {
			System.out.println("오늘은 월요병입니다!!!");
		} else {
			System.out.println("오늘은 불금이 아닙니다");
		}
	}

}
