/*File: TargetSymbol.java
 * 
 * Draws target symbol on screen
 * 
 */

import java.awt.Color;

import acm.graphics.*;
import acm.program.*;

public class TargetSymbol extends GraphicsProgram {
	public void run() {
		
		GOval outerCircleOut = new GOval(200,100,200,200); // outer red ring outside edge
		outerCircleOut.setFilled(true);
		outerCircleOut.setColor(Color.RED);
		outerCircleOut.setFillColor(Color.RED);
		add(outerCircleOut);
		
		GOval innerCircle = new GOval(240,140,120,120);  // outer red ring inside edge
		innerCircle.setFilled(true);
		innerCircle.setColor(Color.WHITE);
		innerCircle.setFillColor(Color.WHITE);
		add(innerCircle);
		
		GOval outerCircleIn = new GOval(280,180,40,40);  // inner ring
		outerCircleIn.setFilled(true);
		outerCircleIn.setColor(Color.RED);
		outerCircleIn.setFillColor(Color.RED);
		add(outerCircleIn);
		
		
		
	}

}
