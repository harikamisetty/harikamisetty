package com.hari.test.matrix;

import java.util.LinkedList;
import java.util.Queue;

public class WolksVegan {

	public static void main(String[] args) {

		int[][] grid = new int[][] { { 2, 2, 3, 3 }, { 2, 2, 4, 4 }, { 5, 6, 4, 4 }, { 5, 6, 7, 7 } };

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


		int color =0;

		while (!queue.isEmpty()) {

			String x = queue.remove();
			int row = Integer.parseInt(x.split(",")[0]);
			int col = Integer.parseInt(x.split(",")[1]);

			while (row< h-1 && col < l-1 ) {
				boolean sameRow = false;
				boolean sameCol = false;

				visited[row][col] = true;
				//System.out.print(grid[row][col] + " ");

				// go down if allowed
				if (row + 1 < h && !visited[row + 1][col] && grid[row][col]!= grid[row+1][col]) {
					queue.add((row + 1) + "," + col); // go down
				} else {
					sameRow =true;
					visited[row+1][col] = true;
					int tempRow = row+1;
					int tempCol = col;
					int value = grid[row+1][col];
					Queue<String> queue1 = new LinkedList<>();

					while(tempRow < h) {
						if(grid[tempRow+1][col] != value) {
							queue.add((tempRow+1) + "," + col);
							break;
						} else {
							queue1.add((tempRow+1) + "," + col);
							visited[tempRow+1][col] = true;
							tempRow++;
						}
					}
					tempRow = row+1;
					while(tempCol < l) {
						if(grid[tempRow][col+1] != value) {
							queue.add((tempRow) + "," + col+1);
							break;
						} else {
							queue1.add((tempRow) + "," + col+1);
							visited[tempRow][col+1] = true;
							tempRow++;
						}
					}

					while(!queue1.isEmpty()) {

					}

					row = row+1;
				}
				// go right if allowed
				if (col + 1 < l && !visited[row][col + 1] && grid[row][col]!= grid[row][col+1]) {
					queue.add(row + "," + (col + 1)); // go right
				} else {
					sameCol = true;
					visited[row][col+1] = true;
					col++;
				}

				if(!sameRow || !sameCol) {
					color ++;
				}
			}
		}
		return color;
	}
}
