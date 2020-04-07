package com.hari.dsal.arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class IntersectionTwoArrays {

	public static int[] intersection(int[] nums1, int[] nums2) {
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < nums1.length; i++) {
			if (i == 0 || (i > 0 && nums1[i] != nums1[i - 1])) {
				if (Arrays.binarySearch(nums2, nums1[i]) > -1) { // Binary search
					list.add(nums1[i]);
				}
			}
		}
		int[] result = new int[list.size()];
		int k = 0;
		for (int i : list) {
			result[k++] = i;
		}
		return result;
	}

	public static void main(String[] args) {
		
		int a[] = {2,3,4,5,6};
		int b[] = {3,4,7,8};
		
		int []c = intersection(a, b);
		
		for(int k: c) {
			System.out.println(k);
		}
	}

}
