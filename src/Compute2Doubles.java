/*
 * File: Compute2Doubles.java
 * 
 * Takes two real numbers from the user 
 * and performs following calculation:
 *         (a*b)/2
 *    Prints result on the screen.
 */


import acm.program.*;

public class Compute2Doubles extends ConsoleProgram {
	public void run() {
		double a = readDouble("Enter first real number: ");
		double b = readDouble("Enter second real number: ");
		double result = (a * b) / 2;
		println(" ( " + a + " * " + b + " ) / 2 = " + result);
	}

}
