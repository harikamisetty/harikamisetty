package com.hari.dsal.arrays;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MajorityElement {

	public static int majorityElement(int[] nums) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int num : nums) {
			if (map.containsKey(num)) {
				map.put(num, map.get(num) + 1);
			} else {
				map.put(num, 1);
			}
		}

		int len = nums.length;

		Iterator it = map.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry pair = (Map.Entry) it.next();
			int key = (int) pair.getKey();
			int value = (int) pair.getValue();

			if (value > len / 2) {
				return key;
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		int[] nums = { 2, 2, 2, 2, 4, 4, 4, 4, 4, 2, 2, 4 };
		System.out.println(majorityElement(nums));
	}
}
