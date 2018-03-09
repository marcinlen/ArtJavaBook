/*
 * File: OlympicRings.java
 * 
 * Draws olympic rings on the screen
 * 
 */

import java.awt.Color;

import acm.graphics.*;
import acm.program.*;

public class OlympicRings extends GraphicsProgram{
	public void run() {
		GOval TopLeft = new GOval(100,100,100,100); 
		TopLeft.setColor(Color.BLUE);
		add(TopLeft);
		GOval TopLeft1 = new GOval(101,101,98,98);	// move one pixel (x,y) and subtract 2 pixels from (x,y)
		TopLeft1.setColor(Color.BLUE);              // to make 3 pixels fat
		add(TopLeft1);
		GOval TopLeft2 = new GOval(99,99,102,102); 
		TopLeft2.setColor(Color.BLUE);
		add(TopLeft2);								
		
		GOval TopMiddle = new GOval(220,100,100,100); 
		TopMiddle.setColor(Color.BLACK);
		add(TopMiddle);
		
		GOval TopRight = new GOval(340,100,100,100); 
		TopRight.setColor(Color.RED);
		add(TopRight);
		
		GOval BottomLeft = new GOval(160,160,100,100); 
		BottomLeft.setColor(Color.YELLOW);
		add(BottomLeft);
		GOval BottomLeft1 = new GOval(161,161,98,98); 
		BottomLeft1.setColor(Color.YELLOW);
		add(BottomLeft1);
		GOval BottomLeft2 = new GOval(159,159,102,102); 
		BottomLeft2.setColor(Color.YELLOW);
		add(BottomLeft2);
		
		GOval BottomRight = new GOval(290,160,100,100); 
		BottomRight.setColor(Color.GREEN);
		add(BottomRight);
		
	}

}
