package com.hari.dsal.arrays;

public class IncreasingTripletSequence {
	
	public static void main(String[] args) {
		int A[] = {2,3,1,5,6,7};
		boolean res = isItTripleIncrese(A);
		System.out.println(res);
	}

	private static boolean isItTripleIncrese(int[] a) {
		
		int small =Integer.MAX_VALUE, big = Integer.MAX_VALUE;
		
		for(int val : a) {
			if(val <= small) {
				small = val;
			}else if(val <= big){
				big = val;
			}else return true;			
		}
		
		return false;
	}

}
