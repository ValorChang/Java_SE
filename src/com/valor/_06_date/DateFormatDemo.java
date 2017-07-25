package com.valor._06_date;

import java.text.DateFormat;
import java.util.Date;

public class DateFormatDemo {
	public static void main(String[] args) throws Exception {
		Date d = new Date();
		DateFormat df = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.SHORT);
		String time = df.format(d);
		System.out.println(time);

		System.out.println("----------------------------");
		//½âÎö
		df = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.SHORT);
		time = df.format(d);
		
		Date d2 = df.parse(time);
		System.out.println();
		
	}
}
