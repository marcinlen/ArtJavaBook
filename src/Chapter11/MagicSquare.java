/** File: MagicSquare.java
 * -----------------------
 * This program contains a method that 
 * checks if an array of NxN elements
 * is a magic square.
 * Magic Square is a two-dimensional array
 * in which rows, collumns and diagonals
 * all add up to the same value.
 */

package Chapter11;

import java.util.ArrayList;

import acm.program.*;

public class MagicSquare extends ConsoleProgram {
	public void run() {
		
		int[][] arr = new int[3][3];
		arr[0][0] = 8; arr[0][1] = 1; arr[0][2] = 6;
		arr[1][0] = 3; arr[1][1] = 5; arr[1][2] = 7;
		arr[2][0] = 4; arr[2][1] = 9; arr[2][2] = 2;
		boolean MagSq = isMagicSquare(arr);
		
	}
	
	private boolean isMagicSquare(int[][] arr) {
		if (arr[0].length != arr.length) {
			return false;
		}
	
		ArrayList<Integer> sums = new ArrayList<Integer>();
		/* count rows and collumns */
		for (int i = 0; i < arr.length; i++) {
			int rowSum = 0;
			int columnSum = 0;
			for (int j = 0; j < arr.length; j ++) {
			}
			sums.add(rowSum);
			sums.add(columnSum);
		}
		return true;
	}



}
