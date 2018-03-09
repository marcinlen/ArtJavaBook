package Arrays;

import java.io.*;

import acm.program.*;

public class Sudoku extends ConsoleProgram {
	
	/** 
	 * grid array instance variable 
	 */
		private int[][] grid = new int[9][9];
	
	public void run() {
		try {
			BufferedReader rd = new BufferedReader(new FileReader("sudokunumbers.txt"));
			int rowNum = 0;
			while (true) {
				String line = rd.readLine();
				if (line == null) break;
				fillGridArray(line, rowNum);
				rowNum++;
			}
			rd.close();
		} catch (IOException ex) {
			println("error in reading grid values from file");
		}
		
		boolean isSolved = checkSudokuSolution(grid);
		if (isSolved) {
			println("Sudoku is solved");
		} else {
			println("Sudoku is not solved");
		}
	}
	
	private void fillGridArray(String s, int row) {
		/* fill in grid */
		for (int i = 0; i < s.length(); i++) {
			grid[row][i] = Character.getNumericValue(s.charAt(i));
		}
		
	}
	
	private boolean checkSudokuSolution(int[][] grid) {
		/* check column */
		int x; int x1;
		int y; int y1;
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				x = grid[i][j]; 
				x1 = grid[j][i];
				for (int k = 0; k < grid[0].length; k++) {
					y = grid[i][k];
					y1 = grid[k][i];
					if (x == y && j != k) {
						return false;
					}
					if (x1 == y1 && j != k) {
						return false;
					}
				}
			}
		}
		/* check square of nine elements */
		for (int i = 0; i < 9; i += 3) {
			for (int j = 0; j < 9; j+= 3) {
				for (int k = i; k < (i + 3); k++) {
					for (int l = j; l < (j + 3); l++) {
					x = grid[k][l];
					for (int m = i; m < (i + 3); m++) {
						for (int n = j; n < (j + 3); n++) {
							y = grid[m][n];
							if (x == y && k != m && l != n) {
								return false;
							}
						}
					}
					}
				}
			}
		}
		return true;
	}
	

	
}
