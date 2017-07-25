package ≥£”√¿‡._06_date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo {
	public static void main(String[] args) throws Exception {
		String pattern = "yyyy.MM.dd HH:mm E";
		SimpleDateFormat sdf = new SimpleDateFormat();
		sdf.applyPattern(pattern);
		String time = sdf.format(System.currentTimeMillis());
		System.out.println(time);
		Date d = sdf.parse(time);
		System.out.println(d);
		
	}
}
