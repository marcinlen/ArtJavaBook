package GUI;

import acm.graphics.*;

 abstract class DrawLineClass extends GObject {
	
	public DrawLineClass(double x, double y) {
		line = new GLine(x, y, x, y);
	}
	
	private GLine line;


}
