package com.hari.dsal.arrays;

public class MinimumSizeSubArray {

	public static void main(String[] args) {
		int A[] = { 2, 3, 1, 2, 4, 3 };

		System.out.println(minimumSize(A, 7));
	}

	public static int minimumSize(int[] nums, int s) {
		if (nums == null || nums.length == 0) {
			return -1;
		}

		int minLen = Integer.MAX_VALUE;
		int sum = 0;
		int left = 0;

		for (int right = 0; right < nums.length; right++) {
			sum += nums[right];

			while (sum >= s) {
				minLen = Math.min(minLen, right - left + 1);
				sum -= nums[left];
				left++;
			}
		}

		return minLen == Integer.MAX_VALUE ? -1 : minLen;
	}

	public int minSubArrayLen(int s, int[] nums) {
		if (s <= 0 || nums == null || nums.length == 0) {
			return 0;
		}

		int lo = 0;
		int hi = 0;
		int sum = 0;
		int minLen = Integer.MAX_VALUE;

		while (hi < nums.length) {
			// Moves the hi pointer
			while (hi < nums.length && sum < s) {
				sum += nums[hi];
				hi++;
			}

			// Move the lo pointer
			while (lo <= hi && sum >= s) {
				minLen = Math.min(minLen, hi - lo);
				sum -= nums[lo];
				lo++;
			}
		}
		if (minLen == Integer.MAX_VALUE) {
			return 0;
		} else {
			return minLen;
		}
	}

}
