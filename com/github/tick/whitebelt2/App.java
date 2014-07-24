package com.github.tick.whitebelt2;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class App {

	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		System.out.println("It is now: " + now);
		
		LocalDateTime tenMinutesFromNow = now.plus(10, ChronoUnit.MINUTES);
		
		System.out.println("Now did not change, it is immutable (will never change): " + now);
		System.out.println("Ten minutes from now is: " + tenMinutesFromNow);
		
		LocalDateTime tenDaysFromNow = now.plus(10, ChronoUnit.DAYS);
		System.out.println("Ten days from now is: " + tenDaysFromNow);
	}

}