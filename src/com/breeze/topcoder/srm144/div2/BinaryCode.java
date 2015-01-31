package com.breeze.topcoder.srm144.div2;

public class BinaryCode {

	// 80 minutes 1/21-22/2015, mostly spent figuring going from:
	// String -> int[] -> char[] -> String

	public String[] decode(String string) {
		// each input character is 0, 1, 2 or 3
		String[] decoded = new String[2];
		// first element contains decoded string assuming the first character is
		// '0'
		int[] p_res = new int[string.length()];
		p_res[0] = 0;
		char[] formatted_result = decodeString(string, p_res);
		decoded[0] = new String(formatted_result);

		p_res = new int[string.length()];
		p_res[0] = 1;
		char[] formatted_result_1 = decodeString(string, p_res);
		decoded[1] = new String(formatted_result_1);

		// second element should assume the first character is '1'
		// if one fails, return "NONE" in its place
		return decoded;
	}

	private char[] decodeString(String string, int[] p_res) {
		char[] formatted_result = new char[string.length()];
		int current = 0;
		for (int i = 1; i < string.length(); i++) {
			char q_i_char = string.charAt(i - 1);
			String s = new String(new char[] { q_i_char });
			int q_i_minus_1 = Integer.parseInt(s);
			int p_i_minus_1 = p_res[i - 1];
			int p_i = q_i_minus_1 - p_i_minus_1;
			if (i > 1) {
				int p_i_minus_2 = p_res[i - 2];
				p_i -= p_i_minus_2;
			}
			if (p_i != 0 && p_i != 1) {
				return "NONE".toCharArray();
			}
			p_res[i] = p_i;
			current = p_i;

			formatted_result[i - 1] = String.valueOf(p_i_minus_1).charAt(0);
			if (i == string.length() - 2) {
				formatted_result[i + 1] = String.valueOf(p_i).charAt(0);
			}
		}
		// consistency check
		char q_last_char = string.charAt(string.length() - 1);
		String s = new String(new char[] { q_last_char });
		int q_last = Integer.parseInt(s);
		if (!consistencyCheck(p_res, q_last)) {
			return "NONE".toCharArray();
		}
		formatted_result[string.length() - 1] = String.valueOf(current).charAt(0);
		return formatted_result;
	}

	private boolean consistencyCheck(int[] p, int q_last) {
		if (p.length < 2) {
			return false;
		}
		int sum = p[p.length - 1] + p[p.length - 2];
		if (q_last == sum) {
			return true;
		}

		return false;
	}
}