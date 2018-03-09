/** File: WordCount.java
 * ---------------------
 * This program reads a file and reports how many 
 * lines, words and characters appear in it.
 * Hard version, could be better.
 */

package Section5;

import acm.program.*;

import java.io.*;
import java.util.*;


 public class WordCount extends ConsoleProgram {
	
	public void run() {
		BufferedReader rd = openFile("File: ");
		lines(rd);
		println("Lines = " + numLines);
		println("Words = "+ numWords);
		println("Chars = " + numCharacters);
		
	}
	
/**
 * Opens text file for calculation.
 * @param String prompt
 * @return BufferedReader
 */
	private BufferedReader openFile(String prompt) {
		BufferedReader rd = null;
		
		while (rd == null) {
			try {
				String filename = readLine(prompt);
				rd = new BufferedReader(new FileReader(filename));
			} catch (IOException ex) {
				println("Cannot open that file, Chief!");
			}
		}
		return rd;
	}
	
/**
 *  calculate number of lines 
 *  calling methods to calculate words and characters
 */
	private void lines(BufferedReader text) {
		try {
			while (true) {
				String s = text.readLine();
				if (s == null) break;
				countWords(s);
				countCharacters(s);
				numLines++;
			}
			text.close();
		} catch (IOException ex) {
			println("error in lines methdod");
		}
	}
	
/**
 * calculates number of words
 */
	private void countWords(String line) {
		StringTokenizer tokenizer = new StringTokenizer(line);
		numWords += tokenizer.countTokens();
	}
	
/**
 * calculates number of characters
 */
	private void countCharacters(String line) {
		for (int i = 0; i < line.length(); i++) {
			if (Character.isLetterOrDigit(line.charAt(i))) numCharacters++;
		}
	}
		
/**
 *  private instance variables 
 */
	private int numLines;
	private int numWords;
	private int numCharacters;	
}

