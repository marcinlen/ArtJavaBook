/*File: ColorRobotFace.java
 * 
 * Draws a face of a robot in colour
 * 
 */

import java.awt.Color;

import acm.graphics.*;
import acm.program.*;

public class ColorRobotFace extends GraphicsProgram {
	public void run() {
		
		GRect head = new GRect(250,100,200,300);  // head
		head.setFilled(true);
		head.setFillColor(Color.GRAY);
		add(head);
		
		GRect mouth = new GRect(280,300,140, 50);  // mouth
		mouth.setFilled(true);
		mouth.setFillColor(Color.WHITE);
		add(mouth);
		
		GRect nose = new GRect(345,240, 10, 20);  // nose
		nose.setFilled(true);
		nose.setFillColor(Color.BLACK);
		add(nose);
		
		GOval left_eye = new GOval(280,150, 30, 30);  // left eye
		left_eye.setFilled(true);
		left_eye.setFillColor(Color.YELLOW);
		add(left_eye);
		
		GOval right_eye = new GOval(390,150, 30, 30);  // right eye
		right_eye.setFilled(true);
		right_eye.setFillColor(Color.YELLOW);
		add(right_eye);
		
	}

}
