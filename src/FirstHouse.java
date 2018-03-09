/*File: FirstHouse.java
 * 
 * Draw a house on the screen based on approximate coordinates
 * 
 */

import acm.graphics.*;
import acm.program.*;

public class FirstHouse extends GraphicsProgram {
	public void run() {
		add(new GRect(300,300,500,300)); // main walls
		add(new GRect(350,350,100,100)); // left window
		add(new GRect(650,350,100,100)); // right window
		add(new GRect(500,400,100,200)); // door
		add(new GOval(580,500,10,10));   // klamka
		add(new GLine(300,300,550,150)); // left part of roof
		add(new GLine(800,300,550,150)); // right part of roof
	}

}
