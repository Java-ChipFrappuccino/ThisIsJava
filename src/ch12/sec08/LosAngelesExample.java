package ch12.sec08;

import java.util.Calendar;
import java.util.TimeZone;

public class LosAngelesExample {

	public static void main(String[] args) {
		TimeZone timezone = TimeZone.getTimeZone("Asia/Tokyo");
		Calendar now = Calendar.getInstance(timezone);
		
		int amPm = now.get(Calendar.AM_PM);
		String strAmPm = null;
		if (amPm == Calendar.AM) {
			strAmPm = "오전";
			
		} else {
			strAmPm = "오후";
		}
		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		
		System.out.println(strAmPm);
		System.out.println(hour);
		System.out.println(minute);
		System.out.println(second);
		
//		String[] allIds = TimeZone.getAvailableIDs();
//		for (String ids : allIds) {
//			System.out.println(ids);
//		}

	}

}
