package com.hari.dsal.arrays;

public class MergeSortedArray {

	public static void main(String[] args) {

		int[] a = new int[5];
		int b[] = { 1, 2, 3, 4 };
		a[1] = 5;
		a[2] = 6;
		a[3] = 7;
		a[4] = 8;
		a[5] = 9;
		int m = 5, n = 4;
		merge(a, m, b, n);
	}

	private static void mergeArrays(int[] a, int m, int[] b, int n) {
		int i = 0;
		for (int k = m + 1; k <= n + m; k++) {
			a[k] = b[i];
			i++;
		}

		// Display Array Values
		for (int val : a) {
			System.out.println(val);
		}

		for (int p = 0; p < m + n; p++) {
			for (int q = p + 1; q <= m + n; q++) {
				if (a[p] > a[q]) {
					int temp = a[q];
					a[q] = a[p];
					a[p] = temp;
				}
			}
		}
		System.out.println(" Here are ");
		// Display Array Values
		for (int val : a) {
			System.out.println(val);
		}
	}

	public static void merge(int A[], int m, int B[], int n) { // No sorting only merging
		if (A == null || B == null || n == 0) {
			return;
		}

		int i = m - 1;
		int j = n - 1;
		int k = m + n - 1;

		while (i >= 0 && j >= 0) {
			if (A[i] >= B[j]) {
				A[k--] = A[i--];
			} else {
				A[k--] = B[j--];
			}
		}

		while (j >= 0) {
			A[k--] = B[j--];
		}
		
		for (int val : A) {
			System.out.println(val);
		}
	}
}
