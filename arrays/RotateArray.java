package com.hari.dsal.arrays;

public class RotateArray {

	public static void main(String[] args) {
		int[] A = { 1, 2, 3, 4, 5, 6, 7 };
		rotate(A, 3);
	}

	private static void rotate(int[] a, int k) {
		k = k % a.length;
		reverse(a, 0, a.length - 1);
		reverse(a, 0, k - 1);
		reverse(a, k, a.length - 1);
		
		for(int val :a) {
			System.out.println(val);
		}

	}

	private static void reverse(int[] a, int start, int end) {

		while (start < end) {
			int temp = a[start];
			a[start] = a[end];
			a[end] = temp;
			start++;
			end--;
		}
	}
}
