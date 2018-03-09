/* File: MorseCode.java
 * --------------------
 * Prgogram translate writen words by the user
 * into a Morse Code.
 */

package Arrays;

import java.util.StringTokenizer;

import acm.program.*;

public class MorseCode extends ConsoleProgram {
	
	String[] morseCode = {"empty", ".-","-...","-.-.","-..",".",
						  "..-.","--.","....","..",".---",
						  "-.-",".-..","--","-.","---",
						  ".--.","--.-",".-.","...","-",
						  "..-","...-",".--","-..-","-.--",
						  "--.."};
	
	public void run() {
		println("This program translate a line into a Morse code");
		String line = readLine("Enter English text: ");
		StringTokenizer tokenizer = new StringTokenizer(line);
		while (tokenizer.hasMoreTokens()) {
			String s = getMorseWord(tokenizer.nextToken());
			println(s);
		}
	}
	
/**
 * Translates single word into a morse code.
 * @param word to be translated
 * @return morse code version
 */
	private String getMorseWord(String word) {
		String morse = "";
		for (int i = 0; i < word.length(); i++) {
			int x = getIndex(word.charAt(i));
			morse += morseCode[x];
			morse += " ";
		}
		return morse;
	}
	
/**
 * Find numberic index of a letter.
 * @param char letter
 * @return int index
 */
	private int getIndex(char letter) {
		letter = Character.toLowerCase(letter);
		int i = 0;
		for (char ch = 'a'; ch < 'z'; ch++) {
			i++;
			if (letter == ch) break;
		}
		return i;
	}
}
