package com.breeze.topcoder.srm145.div2;

public class ImageDithering {

	public int count(String dithered, String[] screen) {
		char[] colorPixels = dithered.toCharArray();

		int ditheredPixels = 0;
		for (String line : screen) {
			for (char c : line.toCharArray()) {
				if (contains(colorPixels, c)) {
					ditheredPixels++;
				}
			}
		}

		return ditheredPixels;
	}

	public static boolean contains(final char[] array, final char v) {
		if (v == '\u0000') {
			for (final char e : array) {
				if (e == '\u0000') {
					return true;
				}
			}
		} else {
			for (final char e : array) {
				if (e == v || v == e) {
					return true;
				}
			}
		}

		return false;
	}
}
