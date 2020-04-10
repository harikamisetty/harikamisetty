package com.hari.dsal.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetArray {

	public static void main(String[] args) {
		int A[] = {1,2,2};
		List<List<Integer>> results = getSubsetWithDuplicate(A);
		results.forEach(e -> {
			System.out.println(e);
		});
	}

	private static List<List<Integer>> getSubsetWithDuplicate(int[] a) {

		List<List<Integer>> list = new ArrayList<>();
		Arrays.sort(a);
		backTrack(list, new ArrayList<>(),a, 0);
		return list;
	}

	private static void backTrack(List<List<Integer>> list, ArrayList<Integer> tempList, int[] a, int start) {

		list.add(new ArrayList<>(tempList));
		for(int i=start; i<a.length; i++) {
			if(i > start && a[i] == a[i-1]) {
				continue;
			}else {
				tempList.add(a[i]);
				backTrack(list, tempList, a, i+1);
				tempList.remove(tempList.size() - 1);
			}
		}
	}

}
