package com.dateTime;

import java.time.Clock;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;

public class DateTimeApi {
	
	public static void main(String args[]) {
		
		/** local date API using NOW method **/
		
		LocalDate ld1 = LocalDate.now();
		
		System.out.println(ld1);
		
		Clock clock = Clock.systemDefaultZone();
		
		LocalDate ld2 = LocalDate.now(clock);
		System.out.println(ld2);
		
		Clock clock1 = Clock.systemUTC();
		LocalDate ld3 = LocalDate.now(clock1);
		System.out.println(ld3);
		
		Clock clock2 = Clock.system(ZoneId.of("America/Chicago"));
		LocalDate ld4 = LocalDate.now(clock2);
		System.out.println(ld4);
		
		
		LocalDate ld5 = LocalDate.now(ZoneId.of("America/Chicago"));
		System.out.println(ld5);
		
		//---------------------------------------------------------
		
		LocalDate ld6 = LocalDate.of(2017, 12, 01);
		System.out.println(ld6);
		
		
		LocalDate ld7 = LocalDate.parse("2017-05-11");
		System.out.println(ld7);
		
		//these are immutable so , you need to assign to another object
		//we can add days, months, years or minus days, months, years
		ld7.plusDays(10);
		System.out.println("-----" + ld7);
		
		LocalDate ld8 = ld7.plusDays(10);
		System.out.println("-----" + ld8);
		
		LocalDate ld9 = ld7.minus(10, ChronoUnit.DAYS);
		System.out.println("-----" + ld9);
		
		// getting the day, week and month details
		System.out.println("-----" + ld9.getDayOfWeek());
		System.out.println("-----" + ld9.getDayOfMonth());
		System.out.println("-----" + ld9.getDayOfYear());
		//check for leap year
		System.out.println("-----" + ld9.isLeapYear());
		
		//comapre the two days
		
		boolean equal = LocalDate.parse("2017-05-11").isEqual(LocalDate.parse("2017-05-11"));
		boolean isbefore = LocalDate.parse("2017-05-11").isBefore(LocalDate.parse("2017-05-11"));
		boolean isafter = LocalDate.parse("2017-05-11").isAfter(LocalDate.parse("2017-05-11"));
	}
	

}
