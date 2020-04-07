package com.hari.test.matrix;

import java.util.LinkedList;
import java.util.Queue;

public class WolksVegan1 {

	public static void main(String[] args) {

		int[][] grid = new int[][] { { 2, 2, 2, 2 },
									 { 2, 2, 4, 4 },
									 { 5, 5, 4, 4 },
									 { 5, 5, 7, 7 } };

		System.out.println(noOfColorPosibilities(grid));

	}

	private static int noOfColorPosibilities(int[][] grid) {

		int h = grid.length;
		if (h == 0)
			return 0;
		int l = grid[0].length;

		boolean[][] visited = new boolean[h][l];

		Queue<String> queue = new LinkedList<>();
		queue.add(0 + "," + 0);

		int color = 0;

		while (!queue.isEmpty()) {

			String x = queue.remove();
			int row = Integer.parseInt(x.split(",")[0]);
			int col = Integer.parseInt(x.split(",")[1]);

			visited[row][col] = true;

			int tempRow = row;
			int tempCol = col;
			int value = grid[row][col];
			Queue<String> queue1 = new LinkedList<>();
			queue1.add(row + "," + col);

			while (!queue1.isEmpty()) {
				String x1 = queue1.remove();
				int row2 = Integer.parseInt(x1.split(",")[0]);
				int col2 = Integer.parseInt(x1.split(",")[1]);
				value = grid[row2][col2];

				while (tempRow < h - 1) {
					if (grid[tempRow + 1][col] != value) {
						if (!queue.contains((tempRow + 1) + "," + col)) {
							queue.add((tempRow + 1) + "," + col);
						}
						break;
					} else {
						queue1.add((tempRow + 1) + "," + col);
						visited[tempRow + 1][col] = true;
						tempRow++;
					}
				}

				while (tempCol < l - 1) {
					if (grid[row][tempCol + 1] != value) {
						if (!queue.contains((row) + "," + (tempCol + 1))) {
							queue.add((row) + "," + (tempCol + 1));
						}
						break;
					} else {
						queue1.add((row) + "," + (tempCol + 1));
						visited[row][tempCol + 1] = true;
						tempCol++;
					}
				}

			}
			color++;
		}
		return color;
	}
}
