/** File: UniqueNames.java
 * -----------------------
 * Program reads names from the user.
 * Prints names without repeating them.
 */

package Section5;

import acm.program.*;
import java.util.*;

public class UniqueNames extends ConsoleProgram {
	
	public void run() {
		ArrayList<String> namesList = new ArrayList<String>();
		readNames(namesList);
		printArrayList(namesList);
	}
	
	private void readNames(ArrayList<String> namesList) {
		while(true) {
			String name = readLine("Enter name: ");
			if (name.equals("")) break;
			namesList.add(name);
		}
	}
	
	private void printArrayList(ArrayList<String> namesList) {
		ArrayList<String> printedNames = new ArrayList<String>();
		for (int i = 0; i < namesList.size(); i++) {
			String name = namesList.get(i);
			if (! printedNames.contains(name)) {
				println(name);
				printedNames.add(name);
			}
		}

	}
}
