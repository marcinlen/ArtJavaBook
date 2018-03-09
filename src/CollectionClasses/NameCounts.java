package CollectionClasses;

import acm.program.*;
import java.util.*;

public class NameCounts extends ConsoleProgram {
	public void run() {
		
		//Ask the user for names
		while (true) {
			String keyName = readLine("Enter name:");
			if (keyName.equals("")) break;
			if (names.containsKey(keyName)) {
				Integer x = names.get(keyName); // read value associated with key - integer 
				names.put(keyName, ++x); // increment value
			} else {
				names.put(keyName, 1);
			}
		}
		
		// Print Results using Iterator
		for (String name: names.keySet()) {
			println("Entry [" + name + "] has count " + names.get(name));
		}
	}
	
	private Map<String, Integer> names = new HashMap<String, Integer>();

}
