/* File: GCTest.java
 * -----------------
 * Program shows garbage collection 
 * and object memory allocation
 */

package ObjectsAndMemory;

import acm.program.*;
import ObjectsAndClasses.Rational;

public class GCTest extends ConsoleProgram {
		
	public void run() {
		Runtime myRuntime = Runtime.getRuntime();
		long x = myRuntime.freeMemory();
		println("Free memory before allocation: " + x);
		println("Allocating 20 mln Rational objects");
		for (int i = 0; i < 20000000; i++) {
			 new Rational();
		}
		x = myRuntime.freeMemory();
		println("Free memory after allocation: " + x);
		
		myRuntime.gc();
		x = myRuntime.freeMemory();
		println("Free memory after garbage collection: " + x);
		
		
	
	}

}
