package ≥£”√¿‡._06_date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
	public static final String DEFAULT_DATE_PATTERN = "yyyy-MM-dd HH:mm";
	public static void main(String[] args) throws Exception{
		System.out.println(date2string(new Date(), "yy/MM/dd"));
		System.out.println(date2string(new Date(), "yyyy-MM-dd HH:mm:ss E"));
		System.out.println(date2string(new Date(), "yyyy/MM/dd"));
		System.out.println(date2string(new Date()));
		System.out.println(stirng2date(date2string(new Date())));
	}
	
	public static String date2string(Date date){
		return date2string(date,null);
	}
	
	public static String date2string(Date date,String pattern){
		SimpleDateFormat sdf = new SimpleDateFormat();
		if (StringUtil.isBlank(pattern)) {
			pattern = DEFAULT_DATE_PATTERN;
		}
		sdf.applyPattern(pattern);
		return sdf.format(date);
	}
	
	public static Date stirng2date (String date) throws Exception{
		return stirng2date(date, null);
	}
	
	public static Date stirng2date (String date, String pattern) throws Exception{
		SimpleDateFormat sdf = new SimpleDateFormat();
		if (StringUtil.isBlank(pattern)) {
			pattern = DEFAULT_DATE_PATTERN;
		}
		sdf.applyPattern(pattern);
		return sdf.parse(date);
		
		
	}
}
