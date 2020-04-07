package com.hari.dsal.arrays;

public class FibonacciNumber {
	
	public static void printFibonacciNumber(int n) {
		
		int a[] = new int[20];
		 a[0] =0; a[1] = 1;
		
		for(int i = 2; i < n; i++) {
			a[i] = a[i-1] + a[i-2];
		}
		
		for(int l=0; l < n; l++) {
			System.out.println(a[l]);
		}
	}
	
	
	public static void main(String[] args) {
		printFibonacciNumber(10);
	}

}
