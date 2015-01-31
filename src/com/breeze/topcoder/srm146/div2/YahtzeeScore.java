package com.breeze.topcoder.srm146.div2;

import java.util.LinkedHashMap;
import java.util.Map;

public class YahtzeeScore {

	public int maxPoints(int[] elements) {
		if (elements == null || elements.length == 0) {
			return 0;
		}

		Map<Integer, Integer> diceCounts = new LinkedHashMap<Integer, Integer>(5);
		int maxPoints = 0;
		for (int i : elements) {
			Integer roll = new Integer(i);
			// put i into map and add existing score if already in there
			// or if existing score is null put i as the score
			Integer existingScore = diceCounts.get(roll);
			if (existingScore != null && existingScore != 0) {
				if ((existingScore + roll) > maxPoints) {
					maxPoints = existingScore + roll;
				}
				diceCounts.put(roll, existingScore + roll);
			} else {
				if (roll > maxPoints) {
					maxPoints = roll;
				}
				diceCounts.put(roll, roll);
			}
		}

		return maxPoints;
	}
}
