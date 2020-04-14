package com.hari.dsal.strings;

/*
 * Str = adcdabcdabcd
 *
 *
 */

public class RepeatedSubStringPattern {

	public static void main(String[] args) {
		String str = "abcdabcdabcd";
		System.out.println(isRepeatedString(str));

	}

	private static boolean isRepeatedString(String str) {

		int length = str.length();

		for (int i = length / 2; i >= 1; i--) {

			if (length % i == 0) {

				int m = length / i;
				String subs = str.substring(0, i);
				StringBuilder sb = new StringBuilder();

				for (int j = 0; j < m; j++) {
					sb.append(subs);
				}

				if (sb.toString().equals(str))
					return true;
			}
		}
		return false;
	}
}
