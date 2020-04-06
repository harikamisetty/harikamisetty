package com.hari.dsal.arrays;

import java.util.HashSet;
import java.util.Set;

public class DuplicateNumberDetection {
	private static Integer[] removeDuplicates(Integer[] input) {
		if (input == null || input.length <= 0) {
			return input;
		}
		Set<Integer> aSet = new HashSet<>(input.length); // set will reject all duplicates
		for (int i : input) {
			aSet.add(i);
		}
		return aSet.toArray(new Integer[aSet.size()]);
	}

	public static void main(String args[]) {
		Integer[] input = { 2, 8, 1, 3, 4, 3, 6, 7, };
		 System.out.println(removeDuplicates(input));

		 for(int val : input) {
			 System.out.println(val);
		 }
	}

}
