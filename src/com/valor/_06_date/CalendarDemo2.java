package com.valor._06_date;

import java.util.Calendar;
import java.util.Date;

public class CalendarDemo2 {
	public static void main(String[] args) {
		//计算最近一周....的信息 如何表示最近一周
		Date current = new Date();
		Calendar c = Calendar.getInstance();
		c.setTime(current);

		//日增加1天 时分秒归零
		c.add(Calendar.DAY_OF_MONTH, 1);
		c.set(Calendar.HOUR, 0);
		c.set(Calendar.MINUTE, 0);
		c.set(Calendar.SECOND, 0);
		System.out.println(c.getTime().toLocaleString());
		Date endTime = c.getTime();
		c.add(Calendar.DAY_OF_MONTH, -7);
		Date benginTime = c.getTime();
		System.out.println(benginTime.toLocaleString());
		System.out.println(endTime.toLocaleString());
		
	}
}
