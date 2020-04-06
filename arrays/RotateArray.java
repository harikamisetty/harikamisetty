package com.hari.dsal.arrays;

public class RotateArray {
	
	public static void main(String[] args) {
		int a[] = {1,2,3,4,5,6,7};
		int k = 3; // K th position to reverse the array.
		rotateArray(a, k);
		for(int val : a) {
			System.out.println(val);
		}
	}

	private static void rotateArray(int[] a, int k) {
		
		k = k % a.length;
		
		reverse(a,0,a.length-1);
		reverse(a,0, k-1);
		reverse(a, k, a.length -1);
		
	}
	// Two Pointer Solution
	private static void reverse(int[] a, int start, int end) {
		while(start < end) {
			int temp = a[start];
			a[start] = a[end];
			a[end] = temp;
			start++;
			end--;
		}	
		
	}
}
