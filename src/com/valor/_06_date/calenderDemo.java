package com.valor._06_date;

import java.util.Calendar;

public class calenderDemo {
	public static void main(String[] args) {
		Calendar ca = Calendar.getInstance();
		int year = ca.get(Calendar.YEAR);
		int month = ca.get(Calendar.MONTH)+1;
		int day = ca.get(Calendar.DAY_OF_MONTH);
		String time = year+" "+month+" "+day; 
		System.out.println(time);
	}
}
