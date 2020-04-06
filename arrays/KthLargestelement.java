package com.hari.dsal.arrays;

import java.util.PriorityQueue;

public class KthLargestelement {

	public static int findKthLargest(int[] nums, int k) {
		if (nums == null || nums.length == 0) {
			return 0;
		}

		PriorityQueue<Integer> maxHeap = new PriorityQueue<>(k);

		for (int num : nums) {
			if (maxHeap.size() < k) {
				maxHeap.offer(num);
			} else {
				if (num > maxHeap.peek()) {
					maxHeap.poll();
					maxHeap.offer(num);
				}
			}
		}

		return maxHeap.peek();
	}

	public static void main(String[] args) {
		int A[] = { 3, 2, 1, 5, 6, 4 };

		System.out.println(findKthLargest(A, 3));
	}

}
