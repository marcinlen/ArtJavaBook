package GUI;

import acm.program.*;
import acm.graphics.*;
import java.awt.event.*;

public class DrawOval extends GraphicsProgram {
	
	public void init() {
		addMouseListeners();
	}
	
	public void mousePressed(MouseEvent e) {
		o = new GOval(0, 0);
		add(o, e.getX(), e.getY());
		leftTopX = e.getX();
		leftTopY = e.getY();
	}
	
	public void mouseDragged(MouseEvent e) {
		if (e.getX() > leftTopX && e.getY() > leftTopY) {
			o.setSize(e.getX() - leftTopX, e.getY() - leftTopY);
		} else if (e.getX() < leftTopX && e.getY() > leftTopY) {
			o.setLocation(e.getX(), leftTopY);
			o.setSize(leftTopX - e.getX(), e.getY() - leftTopY);
		} else if (e.getX() < leftTopX && e.getY() < leftTopY) {
			o.setLocation(e.getX(), e.getY());
			o.setSize(leftTopX - e.getX(), leftTopY - e.getY());
		} else if (e.getX() > leftTopX && e.getY() < leftTopY) {
			o.setLocation(leftTopX, e.getY());
			o.setSize(e.getX() - leftTopX, leftTopY - e.getY());
		} 
	}

	private GOval o;
	private int leftTopX;
	private int leftTopY;
}
