package com.hari.dsal.arrays;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplictaeFromArray { // Sorted array

	public static int removeDuplicates1(int[] A) {
		if (A == null || A.length == 0)
			return 0;

		if (A.length < 2)
			return A.length;

		List<Integer> resultList = new ArrayList<>();
		for (int k = 0; k < A.length; k++) {
			if (!resultList.contains(A[k])) {
				resultList.add(A[k]);
			}
		}

		Object[] resObj = resultList.toArray();
		for (Object h : resObj) {
			System.out.println(h);
		}
		return resObj.length;
	}

	public static void main(String[] args) {
		int stocks[] = new int[6];
		stocks[0] = 10;
		stocks[1] = 20;
		stocks[2] = 20;
		stocks[3] = 20;
		stocks[4] = 25;
		stocks[5] = 50;

		System.out.println(removeDuplicates1(stocks));

	}

}
