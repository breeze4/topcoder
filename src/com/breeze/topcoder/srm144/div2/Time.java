package com.breeze.topcoder.srm144.div2;

public class Time {

	public String whatTime(int totalSeconds) {
		int hours = totalSeconds / 3600;
		int remainingSeconds = totalSeconds - 3600 * hours;
		int minutes = remainingSeconds / 60;
		remainingSeconds = remainingSeconds - 60 * minutes;
		int seconds = remainingSeconds % 60;

		return String.format("%s:%s:%s", hours, minutes, seconds);
	}
}
