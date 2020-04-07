package com.hari.dsal.arrays;

import java.util.ArrayList;
import java.util.List;

public class CombinatationSum_III {
	
	public static void main(String[] args) {
		List<List<Integer>> results = getListOfCombinations(3,9);
	}

	private static List<List<Integer>> getListOfCombinations(int k, int n) {
		List<List<Integer>> ans = new ArrayList<List<Integer>>();
		combination(ans, new ArrayList<Integer>(),k ,1 , n);
		
		return ans;
	}

	private static void combination(List<List<Integer>> ans, ArrayList<Integer> comb, int k, int start, int n) {
		
		if(comb.size() == k && n == 0) {
			List<Integer> li = new ArrayList<Integer>(comb);
			ans.add(li);
			return;
		}
		
		for(int i = start; i <= 9; i++) {
			comb.add(i);
			combination(ans, comb, k, i+1,	n-i);
			comb.remove(comb.size() - 1);
		}
	}
}
