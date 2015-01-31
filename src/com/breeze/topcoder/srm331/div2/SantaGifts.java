package com.breeze.topcoder.srm331.div2;

public class SantaGifts {

	public String[] distribute(String[] presents, int kids) {
		String[] distributedGifts = new String[kids];

		int distributedCount = 0;
		for (String present : presents) {
			distributedGifts[distributedCount] = appendToString(distributedGifts[distributedCount], present);
			distributedCount++;
			if (distributedCount == kids) {
				distributedCount = 0;
			}
		}
		for (int i = 0; i < distributedGifts.length; i++) {
			if (distributedGifts[i] == null) {
				distributedGifts[i] = "";
			}
		}

		return distributedGifts;
	}

	private String appendToString(String entry, String newPresent) {
		String existing = entry;
		if (entry == null) {
			existing = newPresent;
		} else {
			String[] splitString = entry.split("\\s");
			if (splitString.length < 4) {
				existing += " " + newPresent;
			}
		}
		return existing;
	}
}
