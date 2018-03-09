/** File: RotateLeft.java 
 * -------------------------
 * Program changes image in a horizontal plane.
 */

package Arrays;

import acm.program.*;
import acm.graphics.*;

public class RotateLeft extends GraphicsProgram {
	public void run() {
		GImage image = new GImage("candle.jpg");
		add(image);
		GImage rotateImage = rotateLeft(image);
		add(rotateImage, 200, 0);
	}
	
	private GImage rotateLeft(GImage image) {
		int[][] array = image.getPixelArray();
		int width = array[0].length;
		int height = array.length;
		int[][] rotate = new int[width][height];
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				int temp = array[i][j];
				rotate[width - j - 1][i] = temp;
			}
		}
		return new GImage(rotate);
	}

}