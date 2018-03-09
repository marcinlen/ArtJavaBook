package GUI;

import acm.program.*;
import acm.graphics.*;
import java.awt.event.*;

public class MouseTracker extends GraphicsProgram {

	public void init() {
		mousePosition = new GLabel("");
		add(mousePosition, 0, 0);
		addMouseListeners();
	}
	
	public void mouseMoved(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();
		mousePosition.setLabel("(" + x + ", " + y + ")");
		mousePosition.setLocation(x, y);
	}
	
	private GLabel mousePosition = new GLabel("");
}
