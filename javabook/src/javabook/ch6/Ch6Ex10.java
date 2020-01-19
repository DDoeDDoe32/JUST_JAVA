package javabook.ch6;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class Ch6Ex10 {
	public static void main(String[] args) {
		double num1 = 35.829283;
		int num2 = 340000000;
		NumberFormat nf1 = NumberFormat.getInstance();
		NumberFormat nf2 = NumberFormat.getIntegerInstance();
		NumberFormat nf3 = NumberFormat.getCurrencyInstance(Locale.KOREA);
		
		System.out.println(nf1.format(num1));
		System.out.println(nf2.format(num1));
		System.out.println(nf3.format(num1));
		nf3.setMinimumIntegerDigits(3);
		System.out.println(nf3.format(num1));
		
		DecimalFormat df1 = new DecimalFormat();
		DecimalFormat df2 = new DecimalFormat("00.####");
		System.out.println(df1.format(num2));
		System.out.println(df2.format(num1));
		df2.applyPattern("00.##");
		System.out.println(df2.format(num1));
	}
}
