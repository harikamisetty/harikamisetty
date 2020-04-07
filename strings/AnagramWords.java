package com.hari.dsal.strings;

import java.util.Arrays;

public class AnagramWords {
	public static void main(String[] args) {
		
		char str1[] = { 't', 'e', 's', 't' }; 
		char str2[] = { 't', 't', 'e', 'w' }; 
		if (areAnagram(str1, str2)) 
			System.out.println("The two strings are"	+ " anagram of each other"); 
		else
			System.out.println("The two strings are not"+ " anagram of each other"); 
		
		String s1 = "school master".toLowerCase();
		String s2 = "the classroom".toLowerCase();

		if (areAnagramString(s1, s2)) 
			System.out.println("The two strings are"	+ " anagram of each other"); 
		else
			System.out.println("The two strings are not"+ " anagram of each other");
	}
	
	private static boolean areAnagramString(String s1, String s2) {

		if(s1.length() != s2.length())
			return false;
		
		char []ch1 = s1.toCharArray();
		char []ch2 = s2.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		for(int j = 0; j< ch1.length ; j++)
			if(ch1[j] != ch2[j])
				return false;
		
		return true;
	}

	static boolean areAnagram(char[] str1, char[] str2) 
	{ 
		// Get lenghts of both strings 
		int n1 = str1.length; 
		int n2 = str2.length; 

		// If length of both strings is not same, 
		// then they cannot be anagram 
		if (n1 != n2) 
			return false; 

		// Sort both strings 
		Arrays.sort(str1); 
		Arrays.sort(str2); 

		// Compare sorted strings 
		for (int i = 0; i < n1; i++) 
			if (str1[i] != str2[i]) 
				return false; 

		return true; 
	}


}
