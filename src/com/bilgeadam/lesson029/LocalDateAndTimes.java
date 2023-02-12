package com.bilgeadam.lesson029;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class LocalDateAndTimes {

	public static void main(String[] args) {
		System.out.println(findDay(10,4,22));
	}
	public static String findDay(int month, int day, int year) {
        LocalDate date = LocalDate.of(year,month,day);
        return date.getDayOfWeek().toString();
}
}