package com.hari.test.matrix;

public class MaximalSquare {

	public static int maximalSquare(char[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return 0;
        }

        int rows = matrix.length;
        int cols = matrix[0].length;

        int[][] dp = new int[rows][cols];

        // Step 1: Copy First row into new array
        for (int i = 0; i < cols; i++) {
            dp[0][i] = matrix[0][i] - '0';
        }
        //Step 2: copy the first column into new array
        for (int i = 0; i < rows; i++) {
            dp[i][0] = matrix[i][0] - '0';
        }

        // Step 3: find min((i-1, j),(i, j-1), (i -1, j-1)) + 1 and update into new Array;
        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                if (matrix[i][j] == '1') {
                    dp[i][j] = Math.min(Math.min(dp[i - 1][j],
                               dp[i][j - 1]), dp[i - 1][j - 1]) + 1;
                }
            }
        }
        // Step 4 : calculate (i, j) * (i, j) and find the MAX maxArea.
        int maxArea = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                maxArea = Math.max(maxArea, dp[i][j] * dp[i][j]);
            }
        }

        return maxArea;
    }

	public static void main(String[] args) {
		char[][] grid =
				{ { '1', '1', '1', '1', '0' },
				  { '1', '1', '0', '1', '0' },
				  { '1', '1', '0', '0', '0' },
				  { '0', '0', '0', '0', '0' } };
System.out.println(maximalSquare(grid));
	}

}
