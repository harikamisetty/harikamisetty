package com.hari.dsal.arrays;

import java.util.ArrayList;
import java.util.List;

public class MIssingNumbersInAmArray {
	
	public static void main(String[] args) {
		int A[] = {4,3,2,7,8,2,3,1};
		for(int res :findMissingNumbers(A)) {
			System.out.println(res);
		}
	}

	private static List<Integer> findMissingNumbers(int[] a) {
		
		List<Integer> ret = new ArrayList<>();
		
		for(int i=0; i < a.length; i++) {
			int val = Math.abs(a[i]) - 1;
			if(a[val] > 0) {
				a[val] = -a[val];
			}
		}
		
		for(int i =0; i<a.length; i++) {
			if(a[i] > 0) {
				ret.add(i + 1);
			}
		}		
		return ret;
	}
}
