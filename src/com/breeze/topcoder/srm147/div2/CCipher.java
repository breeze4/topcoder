package com.breeze.topcoder.srm147.div2;

public class CCipher {

	private static final int A = "A".charAt(0);
	private static final int Z = "Z".charAt(0);

	public String decode(String cipherText, int shift) {
		String decoded = "";
		for (char ch : cipherText.toCharArray()) {
			char characterShiftedBy = getCharacterShiftedBy(ch, shift);
			decoded += characterShiftedBy;
		}
		return decoded;
	}

	private char getCharacterShiftedBy(char preShift, int shiftBy) {
		int newPosition = preShift - shiftBy;
		if (newPosition < A) {
			int offset = A - newPosition;
			newPosition = Z + 1 - offset;
		}
		return (char) newPosition;
	}
}
