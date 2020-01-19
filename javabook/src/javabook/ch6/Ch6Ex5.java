package javabook.ch6;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Ch6Ex5 {
	public static void main(String[] args) {
		Date date1 = new Date();
		Date date2 = new Date(123141245);
		System.out.println("date1: " + date1);
		System.out.println("date2: " + date2);
		
		System.out.println("date1, date2 비교: " + date1.compareTo(date2));
		
		Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT + 2")); 
		
		System.out.println("시간: " + cal.get(Calendar.HOUR_OF_DAY) + ":" + cal.get(Calendar.MINUTE));
	}
}
