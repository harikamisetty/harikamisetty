package com.hari.test.matrix;

public class RotateImage {
	public static void main(String[] args) {

	}

	public void rotateImage(int[][] matrix) {

		int n = matrix.length; // 3

		for (int layer = 0; layer < n / 2; layer++) { // 0 - 1
			int first = layer; // 0 - 1
			int last = n - layer - 1; // 3 - 0 - 1 = 2

			for (int i = first; i < last; i++) {

				int offset = i - first;
				int top = matrix[first][i];
				// left -> top
				matrix[first][i] = matrix[last - offset][first];

				// bottom -> left
				matrix[last - offset][first] = matrix[last][last - offset];

				// Right -> bottom
				matrix[last][last - offset] = matrix[i][last];

				// top -> right     
				matrix[i][last] = top;

			}
		}

	}


	public static void rotateImage1(int [][]matrix, int size) {

		for(int i =0; i < size /2; i++) {

			for(int j = i; j < size-1; j++) {
				// Swap the elements in a clockwise direction

				int temp = matrix[i][j];
				matrix[i][j] = matrix[size-1][i];
				matrix[size-1][i]  = matrix[size -i - 1][size - j -1];
				matrix[size -i - 1][size - j -1] = matrix[j][size - i - 1];
				matrix[j][size-i-1] = temp;
			}
		}

	}

}
