package com.hari.test.matrix;

import java.util.ArrayList;
import java.util.List;

public class BasicMatrix {

	public static void main(String[] args) {

		int A[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		System.out.println(A.length);

		System.out.println(A[0][0]);
		System.out.println(A[0][1]);
		System.out.println(A[0][2]);
		System.out.println(A[1][0]);
		System.out.println(A[1][1]);
		System.out.println(A[1][2]);
		System.out.println(A[2][0]);

		System.out.println(A.length * A[0].length);

		int res[] = new int[A.length * A[0].length];
		int k = 0;
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A[0].length; j++) {
				res[k] = A[i][j];
				k++;
			}
		}

		for (int d : res) {
			System.out.print(d + "-> ");
		}

		System.out.println(" --------- Diagnol --------------");
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A[0].length; j++) {
				if (i == j)
					System.out.print(A[i][j] + " ->");
			}
		}

		// ************* Max Sequence Number ****************

		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A[0].length; j++) {

			}
		}

		int[][] matrix = { { 1, 1, 1, 0 }, { 1, 1, 1, 0 }, { 1, 1, 0, 0 }, { 1, 0, 0, 0 } };

		SetMatrixZeros(matrix);
		int[][] spiralMatrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9}};
		SpirlOfTheMatrix(spiralMatrix );

	}

	private static List<Integer> SpirlOfTheMatrix(int[][] matrix) {
		
		ArrayList<Integer> result = new ArrayList<Integer>();
		 
        if(matrix == null || matrix.length == 0) return result;
 
        int m = matrix.length;
        int n = matrix[0].length;
 
        int x=0; 
        int y=0;
 
        while(m>0 && n>0){
 
            //if one row/column left, no circle can be formed
            if(m==1){
                for(int i=0; i<n; i++){
                    result.add(matrix[x][y++]);
                }
                break;
            }else if(n==1){
                for(int i=0; i<m; i++){
                    result.add(matrix[x++][y]);
                }
                break;
            }
 
            //below, process a circle
 
            //top - move right
            for(int i=0;i<n-1;i++){
                result.add(matrix[x][y++]);
            }
            result.forEach(e->System.out.println(e));
            
            //right - move down
            for(int i=0;i<m-1;i++){
                result.add(matrix[x++][y]);
            }
 
            //bottom - move left
            for(int i=0;i<n-1;i++){
                result.add(matrix[x][y--]);
            }
 
            //left - move up
            for(int i=0;i<m-1;i++){
                result.add(matrix[x--][y]);
            }
 
            x++;
            y++;
            m=m-2;
            n=n-2;
        }
 
        return result;
	}

	private static void SetMatrixZeros(int[][] matrix) {

		boolean firstRowZero = false;
		boolean firstColumnZero = false;

		// set first row and column zero or not
		for (int i = 0; i < matrix.length; i++) {
			if (matrix[i][0] == 0) {
				firstColumnZero = true;
				break;
			}
		}

		for (int i = 0; i < matrix[0].length; i++) {
			if (matrix[0][i] == 0) {
				firstRowZero = true;
				break;
			}
		}

		// mark zeros on first row and column
		for (int i = 1; i < matrix.length; i++) {
			for (int j = 1; j < matrix[0].length; j++) {
				if (matrix[i][j] == 0) {
					matrix[i][0] = 0;
					matrix[0][j] = 0;
				}
			}
		}
		
		for (int i = 1; i < matrix.length; i++) {
			for (int j = 1; j < matrix[0].length; j++) {
				System.out.println(matrix[i][j]);
			}
			}

		// use mark to set elements
		for (int i = 1; i < matrix.length; i++) {
			for (int j = 1; j < matrix[0].length; j++) {
				if (matrix[i][0] == 0 || matrix[0][j] == 0) {
					matrix[i][j] = 0;
				}
			}
		}

		// set first column and row
		if (firstColumnZero) {
			for (int i = 0; i < matrix.length; i++)
				matrix[i][0] = 0;
		}

		if (firstRowZero) {
			for (int i = 0; i < matrix[0].length; i++)
				matrix[0][i] = 0;
		}

	}
}
