/* File: FlipHorizontal.java
 * -------------------------
 * Program changes image in a horizontal plane.
 */

package Arrays;

import acm.program.*;
import acm.graphics.*;

public class FlipHorizontal extends GraphicsProgram {
	public void run() {
	GImage image = new GImage("milkmaid.jpg");
	add(image);
	GImage flipImage = flipHorizontal(image);
	add(flipImage, 200, 0);
	}
	
	private GImage flipHorizontal(GImage image) {
		int[][] array = image.getPixelArray();
		int width = array[0].length;
		int length = array.length;
		for (int row = 0; row < length; row++) {
			for (int p1 = 0; p1 < width / 2; p1++) {
				int p2 = width - p1 - 1;
				int temp = array[row][p1];
				array[row][p1] = array[row][p2];
				array[row][p2] = temp;
			}
		}
		return new GImage(array);
	}
}


