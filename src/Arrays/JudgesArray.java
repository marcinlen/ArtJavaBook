/** File: JudgesArray.java
 * -----------------------
 * Program reads scores from 7 judges.
 * Calculates average score from 5 judges 
 * ignoring smallest and highest score.
 * 
 * This program uses index fro the loop that is equal to array input.
 * Array[] is never used and loop starts from index one.
 */

package Arrays;

import acm.program.*;

public class JudgesArray extends ConsoleProgram {
	public void run() {
		double[] scores = new double[8]; // ignore array[0]
		for (int i = 1; i <= 7; i++) { // judge number and loop index are the same
			scores[i] = readDouble("enter score for judge " + i + ":");
		}
		double average = getAverage(scores);
		println("average score is: " + average);
		
	}
	
	private double getAverage(double[] sco) {
		double smallestScore = 10.0;
		double highestScore = 0.0;
		int smallIndex = 0;
		int highIndex = 0;
		for (int i = 1; i <= 7; i++) {
			if (sco[i] < smallestScore) {
				smallestScore = sco[i];
				smallIndex = i;
			}
			if (sco[i] > highestScore) {
				highestScore = sco[i];
				highIndex = i;
			}
		}
		return getAvgFive(sco, smallIndex, highIndex);
	}
	
/**
 * gets average from 5 middle scores by
 * ignoring in calculation highest and lowest elements
 * @param array
 * @param smallest element subscript
 * @param highest element subscript
 * @return average as double
 */
	private double getAvgFive(double[] sco, int small, int large) {
		double sum = 0.0;
		for (int i = 1; i <= 7; i++) {
			if (i != small && i != large) sum += sco[i];
		}
		return sum / 5.0;
	}

}
