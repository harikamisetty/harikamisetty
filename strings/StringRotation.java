package com.hari.dsal.strings;

public class StringRotation {
	public static void main(String[] args) {

		System.out.println(isStringRotated("anagram", "nagrama"));
	}

	private static boolean isStringRotated(String s1, String s2) {
		return (s1+s1).contains(s2);
	}
}
