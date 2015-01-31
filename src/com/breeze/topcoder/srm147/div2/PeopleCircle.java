package com.breeze.topcoder.srm147.div2;

import java.util.Arrays;

public class PeopleCircle {

	private static final char F = 70;
	private static final char M = 77;
	private static final char NULL = '\u0000';

	public static void main(String[] args) {
		// want: 2, 5, 8, 1, 6
		int f = 5;
		int size = 10;
		int k = 3;
		char[] result = new char[size];
		for (int i = 1; i <= f; i++) {
			int num = wrapPosition(size, i * k) - 1;
			// tryInsert(result, num);
			System.out.println(num);
			System.out.println(Arrays.toString(result));
		}

	}

	public String order(int numMales, int numFemales, int K) {

		int size = numMales + numFemales;
		char[] result = new char[size];
		for (int i = 1; i <= numFemales; i++) {
			int num = wrapPosition(size, i * K) - 1;
			tryInsert(result, num, num);
			System.out.println(num);
			System.out.println(Arrays.toString(result));
		}
		for (int i = 0; i < size; i++) {
			if (result[i] == NULL && result[i] != 70) {
				result[i] = M;
			}
		}

		return new String(result);
	}

	private static int wrapPosition(int totalSize, int absolutePosition) {
		if (totalSize > absolutePosition) {
			return absolutePosition;
		}

		int pos = absolutePosition % totalSize;
		return pos;
	}

	private static void tryInsert(char[] result, int currentPosition, int insertPosition) {
		if (insertPosition > currentPosition) {
			for (int i = currentPosition; i <= insertPosition; i++) {
				if (result[i] == F) {
					insertPosition++;
				}
			}
			result[insertPosition] = F;
		} else {

		}

	}
}
