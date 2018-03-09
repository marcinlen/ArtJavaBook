/** File: MagicSquare.java
 * -----------------------
 * This program contains a method that 
 * checks if an array of NxN elements
 * is a magic square.
 * Magic Square is a two-dimensional array
 * in which rows, collumns and diagonals
 * all add up to the same value.
 */

package Arrays;

import java.util.ArrayList;

import acm.program.*;

public class MagicSquare extends ConsoleProgram {
	public void run() {
		
		int[][] arr = new int[4][4];
		arr[0][0] = 16; arr[0][1] = 3; arr[0][2] = 2; arr[0][3] = 13;
		arr[1][0] = 5; arr[1][1] = 10; arr[1][2] = 11; arr[1][3] = 8;
		arr[2][0] = 9; arr[2][1] = 6; arr[2][2] = 7; arr[2][3] = 12;
		arr[3][0] = 4; arr[3][1] = 15; arr[3][2] = 14; arr[3][3] = 1;
		
		boolean MagSq = isMagicSquare(arr);
		if (MagSq) {
			println("square is magic");
		} else {
			println("square is not magic");
		}
		
	}
	
/**
 * Predicative method isMagicSquare checks if a square of values
 * is a Magic Square.
 * @param array
 * @return boolean value true or false
 */
	private boolean isMagicSquare(int[][] array) {
		if (array[0].length != array.length) {
			return false;
		}
		ArrayList<Integer> sums = new ArrayList<Integer>();
		/* count rows and collumns */
		for (int i = 0; i < array.length; i++) {
			int rowSum = 0;
			int columnSum = 0;
			for (int j = 0; j < array.length; j ++) {
				rowSum += array[i][j];
				columnSum += array[j][i];
			}
			sums.add(rowSum);
			sums.add(columnSum);
		}
	
		/* count columns */
		int diagonalLeft = 0;
		for (int i = 0; i < array.length; i++) diagonalLeft += array[i][i];
		sums.add(diagonalLeft);
		int diagonalRight = 0;
		for (int i = array.length - 1; i >= 0; i--) diagonalRight += array[i][i];
		sums.add(diagonalRight);
		
		/* check if all the values are equal */
		for (int i = 0; i < sums.size() - 1; i++) {
			if (sums.get(i) != sums.get(i + 1)) {
				return false;
			}
		}
		return true;
	}



}
