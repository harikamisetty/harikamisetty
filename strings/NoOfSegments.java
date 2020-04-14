package com.hari.dsal.strings;

public class NoOfSegments {

	private static int getNoOfSegments(String str) {

		String[] strArray = str.split("\\s");
		return strArray.length;
	}


	public static void main(String[] args) {
		String str = "Hello darling how are you?";
		System.out.println(getNoOfSegments(str));

	}
}
