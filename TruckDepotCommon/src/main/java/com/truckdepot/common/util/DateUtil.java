package com.truckdepot.common.util;

import java.sql.Time;
import java.text.ParseException;
import java.util.Date;

import org.apache.commons.lang.time.DateUtils;

public class DateUtil {
	public static Date parseDate(String dateString) {
		try {
			return DateUtils.parseDate(dateString,
					new String[] { "dd-MM-yyyy"});
		} catch (ParseException e1) {
			System.err
					.println("Exception while parsing date String for deault format: "
							+ dateString);
			return null;
		}

	}
	
	public static Time parseTime(String timeString) {
		try {
			Date date = DateUtils.parseDate(timeString,
					new String[] { "hh:mm"});
			return new Time(date.getTime());
		} catch (ParseException e1) {
			System.err
					.println("Exception while parsing date String for deault format: "
							+ timeString);
			return null;
		}

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(parseDate("24-09-9878"));
		System.out.println(parseTime("10:21"));
		
	}
}
