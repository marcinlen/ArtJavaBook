/** File: Histogram.java
 * ---------------------
 * 
 */

package Section5;

import acm.program.*;

import java.io.*;

public class Histogram extends ConsoleProgram {

	public void run() {
		BufferedReader rd = openFile("Enter file of numbers for histogram: ");
		readNumbers(rd);
		printHistogram();
	}
	
/**
 *  Reads lines from a file, converts to numbers and adds to Array of numbers
 * @param rd BufferedReader
 * @param numbers ArrayList<Integer>
 */
	private void readNumbers(BufferedReader rd) {
		try {
			while (true) {
				String line = rd.readLine();
				if (line == null) break;
				buildHistogram(line);
			}
			} catch (IOException ex) {
				println("error in readNumbers method");
			}
	}
	
	private void buildHistogram(String num) {
		if (num.length() == 1) {
			to10 += ast;
		} else if (num.length() == 2) {
			readTens(num);
		} else if (num.equals("100")) {
			is100 += ast;
		} else {}
	}
	
	private void readTens(String num) {
		char ch = num.charAt(0);
		switch (ch) {
		case '1':
			to20 += ast;
			break;
		case '2':
			to30 += ast;
			break;
		case '3':
			to40 += ast;
			break;
		case '4':
			to50 += ast;
			break;
		case '5':
			to60 += ast;
			break;
		case '6':
			to70 += ast;
			break;
		case '7':
			to80 += ast;
			break;
		case '8':
			to90 += ast;
			break;
		case '9':
			to100 += ast;
			break;
		default:
			println("no 2 digit number to set");
			break;		
		} 
	}
/** 
 * fills in appropiate levels of histogram based on numbers 
 * from readNumbers()	
 * @param num
 */
	
	
/**
 * print histogram spread values on the screen
 */
	private void printHistogram() {
		println("00-09:" + to10);
		println("10-19:" + to20);
		println("20-29:" + to30);
		println("30-39:" + to40);
		println("40-49:" + to50);
		println("50-59:" + to60);
		println("60-69:" + to70);
		println("70-79:" + to80);
		println("80-89:" + to90);
		println("90-99:" + to100);
		println("  100:" + is100);
	}
		
/**
 * @param prompt
 * @return BufferedReader rd
 */
		private BufferedReader openFile(String prompt) {
			BufferedReader rd = null;
			
			while (rd == null) {
				try {
					String filename = readLine(prompt);
					rd = new BufferedReader(new FileReader(filename)); 
				} catch (IOException ex) {
					println("That file won't open, gizzer!");
				}
			}
			return rd;
		}
		
/**
 * private instance variables
 */
		private String to10 = "";
		private String to20 = "";
		private String to30 = "";
		private String to40 = "";
		private String to50 = "";
		private String to60 = "";
		private String to70 = "";
		private String to80 = "";
		private String to90 = "";
		private String to100 = "";
		private String is100 = "";
		
/** 
 * private constants
 */
		private static final String ast = "*";
	
}
