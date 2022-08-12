package com.example;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class LocalDateTimeDemo {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		System.out.println("____________Date Information__________");
		LocalDate today = LocalDate.now();
		System.out.println("Today: "+today);
		LocalDate birthday = LocalDate.parse("1995-05-25");
		System.out.println("Birthday: "+birthday);
		System.out.println("Year: "+birthday.getYear());
		System.out.println("____________Time Information__________");
		LocalTime time = LocalTime.now();
		System.out.println("Time: "+time);
		System.out.println("Hour: "+time.getHour());
		System.out.println("Minute: "+time.getMinute());
		System.out.println("________Date Formatter___________");
		String formattedDate = today.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		System.out.println("Formatted Date: "+formattedDate);
		System.out.println("____________ Older Date class________________");
		Date date = new Date();
		System.out.println("Date: "+date);
		System.out.println("Year: "+date.getYear()); 
	}
}
