/** File: negativeColors.java
 * --------------------------
 * test program that changes array of single color into its negative
 */

package Arrays;

import acm.program.*;
import acm.graphics.*;

public class negativecolors extends GraphicsProgram {
	public void run() {
		GImage image = new GImage("starry_night.jpg");
		add(image);
		int[][] array = image.getPixelArray();
		int[][] negative = new int[array.length][array[0].length];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				int x = array[i][j];
				/* 
				 * separate individual color values (first 24 bits are 0's)
				 * */
				int alpha = (x >> 24) & 0xFF;
				int red = (x >> 16) & 0xFF;
				int green = (x >> 8) & 0xFF;
				int blue = x & 0xFF;
				/*
				 * change individual bits into their opposites 
				 * (integers become negative integers and first 24 bits are 1's)
				 */
				red = ~red; green = ~green; blue = ~blue;
				/* 
				 * turn negative integers into positive integers 
				 */
				red = red & 0xFF; green = green & 0xFF; blue = blue & 0xFF; 
				/* 
				 * construct single color integer pixel
				 */
				int pixel = (alpha << 24) | (red << 16) | (green << 8) | (blue);
				negative[i][j] = pixel;
			}
		}
		GImage neg = new GImage(negative);
		add(neg, neg.getWidth(), 0);
	}
}
