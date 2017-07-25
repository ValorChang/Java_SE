package com.valor._06_date;

import java.util.Date;

public class DateDemo {
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		
		date = new Date(System.currentTimeMillis());
		
		System.out.println(date);
		
		System.out.println(date.toLocaleString());
	}
}
