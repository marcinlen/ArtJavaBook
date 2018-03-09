/** File: LineGraph.java
 * ---------------------
 * Program draws a line graph of values
 * stored in an array of doubles.
 */

package Arrays;

import acm.program.*;
import acm.graphics.*;
import java.util.*;
import java.io.*;

public class LineGraph extends GraphicsProgram {
	public void run() {
		ArrayList<Double> marketData = new ArrayList<>();
		readData(marketData);
		drawLineGraph(marketData);
	}
	
/**
 * Read market data from file
 */
	private void readData(ArrayList<Double> a) {
		try {
			BufferedReader rd = new BufferedReader(new FileReader("NASDAQ_AAPL.txt"));
			int i = 0;
			while (true) {
				String line = rd.readLine();
				if (line == null || i > 998) break;
				convertData(a, line);
				i++;
			} 
			rd.close();
		} catch (IOException ex) {
				println("error in reading file");
			}
		
	}
	
/** 
 * read close od day data into an array
 */
	private void convertData(ArrayList<Double> a, String s) {
		if (s.charAt(0) == '<') return;
		int x = 0; // represents length of string to ignore
		String eod = "";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch == ',') x += 1;
			if (x == 5 && ch != ',' && eod.length() < 6) {
				eod += ch;
			}
		}
		/* convert eod string to double */
		double d = Double.parseDouble(eod);
		a.add(d);
	}
	
/**
 * Draws line diagram of data
 * @param array
 */
	private void drawLineGraph(ArrayList<Double> array) {
		double[] arr = new double[array.size()];
		arr = resizeArray(array, arr);
		int x = 1;
		for (int i = 0; i < arr.length - 1; i++) {
			/* subtruct array numbers from application height to draw from bottom to top */
			add(new GLine(x, APPLICATION_HEIGHT - arr[i], (x + 1), APPLICATION_HEIGHT -  arr[i + 1])); 
			x += 1;
		}
	}
	
/**
 * find the biggest and lowest value in array,
 * divide application height by the difference between lowest and highest,
 * subtract lowest value (lowest will be new 0) from every value and
 * multiply by result of prior calculation (ratio)
 */
	private double[] resizeArray(ArrayList<Double> original, double[] modified) {
		double highest = 0.0;
		double lowest = 1000.0;
		for (int i = 0; i < original.size(); i++) {
			if (original.get(i) > highest) highest = original.get(i);
			if (original.get(i) < lowest) lowest = original.get(i);
		}
		double ratio = APPLICATION_HEIGHT / (highest - lowest) ;
	
		for (int i = 0; i < original.size(); i++) {
			modified[i] = (original.get(i) - lowest) * ratio;
		}
		return modified;
	}

/** 
 * size of window
 */
	public static final int APPLICATION_WIDTH = 1000;
	public static final int APPLICATION_HEIGHT = 600;
}
