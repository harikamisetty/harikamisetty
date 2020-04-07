package com.hari.dsal.arrays;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

	public static boolean containsDuplicate(int[] nums) {
		if (nums == null || nums.length <= 1) {
			return false;
		}

		Set<Integer> set = new HashSet<Integer>();

		for (int num : nums) {
			if (set.contains(num)) {
				return true;
			} else {
				set.add(num);
			}
		}

		return false;
	}

	public static void main(String[] args) {
		int stocks[] = new int[6];
		stocks[0] = 10;
		stocks[1] = 20;
		stocks[2] = 30;
		stocks[3] = 15;
		stocks[4] = 25;
		stocks[5] = 50;

		System.out.println(containsDuplicate(stocks));
	}

}
