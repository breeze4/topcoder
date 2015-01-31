package com.breeze.topcoder.srm145.div2;

public class ExerciseMachine {

	// 34 minutes 1/22/2015

	// find all the whole percentages that can be shown
	public int getPercentages(String time) {
		// convert time to seconds as base unit
		double workout = 3600 * getHours(time) + 60 * getMins(time) + getSecs(time);

		int pct_count = 0;
		for (double pct = 1; pct < 100; pct++) {
			double pct_of_wkt = workout * pct / 100.0;
			// divide workout by percentage
			// if quotient is a whole number

			// alternate method:
			// if ((pct_of_wkt == Math.floor(pct_of_wkt)) &&
			// !Double.isInfinite(pct_of_wkt)) {
			if (pct_of_wkt % 1 == 0) {
				pct_count++;
			}
		}
		return pct_count;
	}

	private static double getHours(String time) {
		return Double.parseDouble(time.split(":")[0]);
	}

	private static double getMins(String time) {
		return Double.parseDouble(time.split(":")[1]);
	}

	private static double getSecs(String time) {
		return Double.parseDouble(time.split(":")[2]);
	}
}
