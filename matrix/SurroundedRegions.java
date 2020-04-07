package com.hari.test.matrix;

import java.util.LinkedList;
import java.util.Queue;

public class SurroundedRegions {

	 public static void solve(char[][] board) {
	        if (board == null || board.length == 0) {
	            return;
	        }

	        int m = board.length;
	        int n = board[0].length;

	        // check the first and last rows
	        for (int i = 0; i < n; i++) {
	            solveHelper(0, i, m, n, board);
	            solveHelper(m - 1, i, m, n, board);
	        }

	        for (int i = 1; i < m - 1; i++) {
	            solveHelper(i, 0, m, n, board);
	            solveHelper(i, n - 1, m, n, board);
	        }

	        // fill
	        for (int i = 0; i < m; i++) {
	            for (int j = 0; j < n; j++) {
	                if (board[i][j] == 'O') {
	                    board[i][j] = 'X';
	                } else if (board[i][j] == 'D') {
	                    board[i][j] = 'O';
	                }
	            }
	        }
	    }

	    private static void solveHelper(int row, int col, int m, int n, char[][] board) {
	        if (row < 0 || row >= m || col < 0 || col >= n || board[row][col] != 'O') {
	            return;
	        }

	        board[row][col] = 'D';

	        solveHelper(row - 1, col, m, n, board);
	        solveHelper(row + 1, col, m, n, board);
	        solveHelper(row, col - 1, m, n, board);
	        solveHelper(row, col + 1, m, n, board);

	    }

	    Queue<Integer> queue = new LinkedList<Integer>();
	    public void solve1(char[][] board) {
	        if (board == null || board.length == 0) {
	            return;
	        }

	        int m = board.length;
	        int n = board[0].length;

	        for (int i = 0; i < n; i++) {
	            solveHelper1(0, i, m, n, board);
	            solveHelper1(m - 1, i, m, n, board);
	        }

	        for (int i = 1; i < m - 1; i++) {
	            solveHelper1(i, 0, m, n, board);
	            solveHelper1(i, n - 1, m, n, board);
	        }

	        for (int i = 0; i < m; i++) {
	            for (int j = 0; j < n; j++) {
	                if (board[i][j] == 'O') {
	                    board[i][j] = 'X';
	                } else if (board[i][j] == 'D') {
	                    board[i][j] = 'O';
	                }
	            }
	        }
	    }

	    private void solveHelper1(int row, int col, int m, int n, char[][] board) {
	        fill(row, col, m, n, board);

	        while (!queue.isEmpty()) {
	            int cord = queue.poll();
	            int x = cord / n;
	            int y = cord % n;

	            fill(x - 1, y, m, n, board);
	            fill(x + 1, y, m, n, board);
	            fill(x, y - 1, m, n, board);
	            fill(x, y + 1, m, n, board);
	        }
	    }

	    private void fill(int row, int col, int m, int n, char[][] board) {
	        if (row < 0 || row >= m || col < 0 || col >= n || board[row][col] != 'O') {
	            return;
	        }

	        board[row][col] = 'D';

	        queue.offer(row * n + col);
	    }

	public static void main(String[] args) {

		char [][] grid = {{'X','X', 'X', 'X'},{'X', 'O', 'O', 'X'},{'X', 'X', 'O', 'X'},{'X', 'O', 'X', 'X'}};
		solve(grid);
		int m = grid.length;
		int n = grid[0].length;

		for(int i=0;i<m;i++) {
			System.out.println("\n");
			for(int j=0;j<n;j++) {
				System.out.print(grid[i][j] + " ");
			}
		}
	}
}
