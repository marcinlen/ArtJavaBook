/** File: JudgesArray.java
 * -----------------------
 * Program reads scores from 7 judges.
 * Calculates average score from 5 judges 
 * ignoring smallest and highest score.
 * Extends exercise number 2.
 * 
 * This program uses array[0] in an input and changes prompt to
 * the user (i + 1) so that index 0 is display as one.
 */

package Arrays;

import acm.program.*;

public class GymnasticsJudge extends ConsoleProgram {
	public void run() {
		double[] scores = new double[7]; 
		for (int i = 0; i < 7; i++) { 
			scores[i] = readDouble("enter score for judge " + (i + 1) + ":"); // prompt array[0] as judge one by (i + 1)
		}
		double average = getAverage(scores);
		println("average score is: " + average);
		
	}
	
/**
 * reads judges scores into an array of 7 elements.
 * makes new array of 5 middle elements.
 * calls method to get an average.
 * @param array
 * @return average of middle 5 scores
 */
	private double getAverage(double[] sco) {
		double smallestScore = 10.0;
		double highestScore = 0.0;
		int smallIndex = 0;
		int highIndex = 0;
		for (int i = 0; i < 7; i++) {
			if (sco[i] < smallestScore) {
				smallestScore = sco[i];
				smallIndex = i;
			}
			if (sco[i] > highestScore) {
				highestScore = sco[i];
				highIndex = i;
			}
		}
		double[] newArray = new double[5];
		for (int i = 0; i < newArray.length; i++) {
			if (i != smallIndex && i != highIndex) {
				newArray[i] = sco[i]; 
			}
		}
		return mean(newArray);
	}
	
/**
 * method inplementation from exercise 2
 */
	private double mean(double[] array) {
		double sum = 0.0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		return sum / array.length;
	}

}

