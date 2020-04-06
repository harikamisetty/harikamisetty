package com.hari.dsal.arrays;

import java.util.Arrays;

public class Sum3 {

	public static void main(String[] args) {

		int A[] = { 2, 4, 6, 7, 8, 5 };

		System.out.println(sum3OfArray(A, 20));
		System.out.println(sum3OfArray1(A, 20));

	}

	private static boolean sum3OfArray(int[] a, int target) {

		if (a == null || a.length == 0)
			return false;

		if (a.length < 3)
			return false;

		for (int i = 0; i < a.length - 2; i++) {

			// when i={0...3} ; j={1...4}; k={2...5}

			for (int j = i + 1; j < a.length - 1; j++) {

				for (int k = j + 1; k < a.length; k++) {

					if (target == a[i] + a[j] + a[k]) {
						return true;

					}
				}

			}

		}
		return false;
	}

	private static boolean sum3OfArray1(int[] a, int target) {

		if (a == null || a.length == 0)
			return false;

		if (a.length < 3)
			return false;
		Arrays.sort(a);

		for (int i = 0; i < a.length; i++) {
			int firstNum = a[i];
			int low = 0, high = a.length - 1;

			if (firstNum > target)
				continue;

			while (low <= high) {
				if (firstNum + a[low] + a[high] == target) {
					return true;
				} else if (firstNum + a[high] > target) {
					high--;
				} else if (firstNum + a[low] + a[high] < target) {
					low++;
				}
			}
		}

		return false;
	}

}
