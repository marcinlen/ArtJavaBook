package SearchAndSort;

import acm.program.*;


public class SimpleLinearSearch extends ConsoleProgram {
	
	public void run() {
	
// Create array of integers, initialize and shwo on screen
		int[] a = new int[10];
		
		println("Elements in the array: ");
		
		for (int i = 0; i < 10; i++) {
			a[i] = (int) Math.pow(i, 2); // initialize array
			print( a[i] + " " );         // print on screen
		}
		println();
		
		int searchFor = readInt("Enter element to focus on (linear search in array): ");  // user element to be searched in the array
		
		int subscript = linearSearch(searchFor, a); // return index of element(that we look for) in the array
		
		// print desired outcome
		int i = 0;
		while (i < 10) {
			print(a[subscript] + " ");
			i++;
		}
		
		
	}
	
// 
// Linear serach with O(N) complexity
//
	private int linearSearch(int key, int[] array) {
		for (int i = 0; i < array.length; i++) {
			if (key == array[i]) return i;
		}
		return -1;
	}
	


}
