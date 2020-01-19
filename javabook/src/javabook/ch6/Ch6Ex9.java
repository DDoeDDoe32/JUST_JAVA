package javabook.ch6;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ch6Ex9 {
	public static void main(String[] args) {
		Date date = new Date();
		
		DateFormat df1 = DateFormat.getInstance();
		DateFormat df2 = DateFormat.getDateInstance(DateFormat.LONG);
		System.out.println("DateFormat 기본: " + df1.format(date));
		System.out.println("DateFormat LONG: " + df2.format(date));
		System.out.println("DateFormat TimeZone: " + df1.getTimeZone().getID());
		
		SimpleDateFormat sdf1 = new SimpleDateFormat();
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy.MM.dd, hh:mm:a");
		System.out.println("SimpleDateFormat 기본: " + sdf1.format(date));
		System.out.println("SimpleDateFormat 지정: " + sdf2.format(date));
		sdf1.applyPattern("yyyy년 MM/dd");
		System.out.println("SimpleDateFormat 변경: " + sdf1.format(date));
		
	}
}
