package com.hari.dsal.arrays;

public class JumpGame {
	public static boolean canJump(int[] A) {
		if (A.length <= 1)
			return true;
		int max = A[0]; // max stands for the largest index that can be reached.
		for (int i = 0; i < A.length; i++) {
			// if not enough to go to next
			if (max <= i && A[i] == 0)
				return false;
			// update max
			if (i + A[i] > max) {
				max = i + A[i];
			}
			// max is enough to reach the end
			if (max >= A.length - 1)
				return true;
		}
		return false;
	}

	public boolean canJump1(int[] A) {
		if (A == null || A.length == 0) {
			return false;
		}

		if (A[0] == 0 && A.length > 1) {
			return false;
		}

		int max = 0;
		for (int i = 0; i < A.length; i++) {
			if (i <= max && i + A[i] > max) {
				max = i + A[i];
			} else if (i > max) {
				return false;
			}
		}

		return max >= A.length - 1;
	}

	public boolean canJump2(int[] A) {
		if (A == null || A.length == 0) {
			return true;
		}

		return canJumpHelper(0, A);
	}

	private boolean canJumpHelper(int index, int[] A) {
		if (index >= A.length) {
			return true;
		}

		for (int i = 1; i <= A[index]; i++) {
			if (canJumpHelper(index + i, A) == true) {
				return true;
			}
		}

		return false;
	}

	public boolean canJump_DP(int[] A) {
		if (A == null || A.length == 0) {
			return true;
		}

		if (A[0] == 0 && A.length > 1) {
			return false;
		}

		boolean[] dp = new boolean[A.length];
		dp[0] = true;

		for (int i = 1; i < A.length; i++) {
			for (int j = 0; j < i; j++) {
				if (dp[j] == true && j + A[j] >= i) {
					dp[i] = true;
					break;
				}
			}
		}

		return dp[A.length - 1];

	}

	public boolean canJump_greedy(int[] nums) {
		if (nums == null || nums.length == 0) {
			return true;
		}

		int maxReach = 0;
		for (int i = 0; i <= maxReach && i < nums.length - 1; i++) {
			if (i + nums[i] > maxReach) {
				maxReach = i + nums[i];
			}
		}

		return maxReach >= nums.length - 1;
	}

	public boolean canJump4(int[] nums) {
		if (nums == null || nums.length == 0) {
			return true;
		}

		int maxReach = 0;
		for (int i = 0; i < nums.length; i++) {
			if (i > maxReach) {
				return false;
			}

			if (i + nums[i] > maxReach) {
				maxReach = i + nums[i];
			}
		}

		return maxReach >= nums.length - 1;
	}

	public static void main(String[] args) {
		int a[] = { 2, 3, 1, 1, 4 };
		int b[] = { 3, 2, 1, 0, 4 };

		System.out.println(canJump(a));
		System.out.println(canJump(b));
	}
}
