/** File: ClipImage.java
 * --------------------
 * Program for cuting smaller part from larger image.
 * -------------------------------------------------------
 * IMPORTANT: relationship between x,y canvas coordinates
 * and an array row, column coordinates
 * -----------------------------------------------------
 */

package Arrays;

import acm.program.*;
import acm.graphics.*;

import java.awt.Color;
import java.awt.event.*;

public class ClipImage extends GraphicsProgram {
	
	/* application size */
	public static final int APPLICATION_WIDTH = 1100;
	public static final int APPLICATION_HEIGHT = 600;

/**
 * instance variable for an image to clip
 */
	private static final GImage image = new GImage("last_supper.jpg");
	
/**
 * add image to canvas
 */
	public void run() {
		add(image);
		addMouseListeners();
		
	}
	
/**
 * Draw border around a selection.
 * Store starting point of selection.
 */
	public void mousePressed(MouseEvent e) {
		colBegin = e.getX();
		rowBegin = e.getY();
		clipBorder = new GRect(colBegin, rowBegin, 0, 0);
		clipBorder.setColor(Color.YELLOW);
		add(clipBorder);
		
	}

/**
 * Increase the border while mouse is dragged.
 */
	public void mouseDragged(MouseEvent e) {
			clipBorder.setSize(e.getX() - colBegin, e.getY() - rowBegin);
	}
	
/**
 * Store end point of selection.
 * Make original image invisible.
 */
	public void mouseReleased(MouseEvent e) {
		colEnd = e.getX();
		rowEnd = e.getY();
		image.setVisible(false);
		clipImage();
	}
	
/**
 * Perform clipping.
 * Add clip to the canvas.
 */
	private void clipImage() {
		int[][] clipArray = null;
		if (colBegin < colEnd && rowBegin < rowEnd) {
			clipArray = new int[rowEnd - rowBegin][colEnd - colBegin];
			for (int i = rowBegin; i < rowEnd; i++) {
				for (int j = colBegin; j < colEnd; j++) {
					clipArray[i - rowBegin][j - colBegin] = array[i][j];
				}
			}
		} 
		
		GImage idn = new GImage(clipArray);
		add(idn, 100, 100);
	}
	
/**
 * Instance variables.
 */
	private int[][] array = image.getPixelArray();
	private GRect clipBorder;
	private int colBegin;
	private int rowBegin;
	private int colEnd;
	private int rowEnd;
	
}
