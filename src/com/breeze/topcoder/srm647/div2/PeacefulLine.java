package com.breeze.topcoder.srm647.div2;

import java.util.LinkedHashMap;
import java.util.Map;

public class PeacefulLine {

	private static final Integer ONE = new Integer(1);

	// x of the same value cannot touch each other
	// if thats possible, return "possible"
	// else if its impossible, return "impossible"
	public String makeLine(int[] x) {
		// sum up counts for each age
		// if any count for a single age is greater than the total other counts
		// it is impossible
		Map<Integer, Integer> counts = new LinkedHashMap<Integer, Integer>();

		Integer maxCount = 0;
		for (int k : x) {
			Integer kid = new Integer(k);
			if (counts.get(kid) == null) {
				counts.put(kid, ONE);
				if (ONE > maxCount) {
					maxCount = ONE;
				}
			} else {
				Integer newCount = counts.get(kid) + 1;
				counts.put(kid, newCount);
				if (newCount > maxCount) {
					maxCount = newCount;
				}
			}
		}
		int size = x.length;
		if (maxCount > (size - maxCount + 1)) {
			return "impossible";
		} else {
			return "possible";
		}
	}
}
