/** File: SieveOfEratosthenes.java
 * -------------------------------
 * Program uses Eratosthenes method
 * to find prime numbers from 2 to 1000.
 */

package Arrays;

import acm.program.*;
import java.util.*;

public class SieveOfEratosthenes extends ConsoleProgram {
	public void run() {
		/* set array of integers from 2 to 1000 */
		ArrayList<Integer> array = new ArrayList<>();
		for (int i = 2; i <= 1000; i ++) {
			array.add(i);
		}
		for (int i = 0; i < array.size(); i++) {
			deleteMultiple(array, i);
		}
		/* print array */
		for (int i = 0; i < array.size(); i++) {
			print(array.get(i) + ",");
			if (i % 20 == 0) print("\n");
		}
		
	}
	
	private void deleteMultiple(ArrayList<Integer> array, int ind) {
		Integer x = array.get(ind);
		for (int i = ind + 1; i < array.size(); i++) {
			if (array.get(i) % x == 0) {
				array.remove(i);
			}
		}
		
	}

}
