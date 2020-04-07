package com.hari.dsal.arrays;

public class MaxSubArray { // There are many in BUttercola.blockspot

	public static int maxSubArray(int[] nums) {
		int result = nums[0];
		int temp = nums[0];
		for (int i = 1; i < nums.length; i++) {
			temp = Math.max(nums[i], nums[i - 1] + nums[i]);
			result = Math.max(result, temp);
		}
		return result;
	}

	public static int maxSubArray1(int[] A) {
		if (A == null || A.length == 0)
			return 0;

		int max = Integer.MIN_VALUE;
		int sum = 0;

		for (int i = 0; i < A.length; i++) {
			if (sum < 0) {
				sum = A[i];
			} else {
				sum += A[i];
			}
			max = Math.max(max, sum);
		}
		return max;
	}

	public static void main(String[] args) {
		int a[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };

		System.out.println(maxSubArray(a));
		System.out.println(maxSubArray1(a));
	}
}
