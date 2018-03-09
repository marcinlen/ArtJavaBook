/*
 * File: DrawStarMap.java
 * ----------------------
 * This program creates a five-pointed star every time the
 * user clicks the mouse on the canvas.
 */

package GUI;

import acm.program.*;
import acm.graphics.*;
import java.awt.event.*;
import javax.swing.*;

public class DrawStarMap extends GraphicsProgram {

/* Initialize the mouse listeners */
	public void init() {
		add(new JLabel("Star Name"), SOUTH);
		
		starName = new JTextField(10);
		starName.addActionListener(this);
		add(starName, SOUTH);
		
		addMouseListeners();
		addKeyListeners();
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == starName) {
			add(new GLabel(starName.getText()), starPosition_X + 20, starPosition_Y);
		}
	}

/* Called whenever the user clicks the mouse */
	public void mouseClicked(MouseEvent e) {
		star = new GStar(STAR_SIZE);
		star.setFilled(true);
		add(star, e.getX(), e.getY());
		starPosition_X = e.getX();
		starPosition_Y = e.getY();
	}
	
	public void mousePressed(MouseEvent e) {
		gobj = getElementAt(e.getX(), e.getY());
		last = new GPoint(e.getPoint());
	}
	
	public void mouseDragged(MouseEvent e) {
		if (gobj != null) {
			gobj.move(e.getX() - last.getX(), e.getY() - last.getY());
			last = new GPoint(e.getPoint());
		}
	}
	
	public void keyPressed(KeyEvent e) {
		if (gobj != null) {
			switch (e.getKeyCode()) {
				case KeyEvent.VK_UP:	  gobj.move(0, -1); break;
				case KeyEvent.VK_DOWN:	  gobj.move(0, +1); break;
				case KeyEvent.VK_LEFT:    gobj.move(-1, 0); break;
				case KeyEvent.VK_RIGHT:   gobj.move(+1, 0); break;
				case KeyEvent.VK_DELETE:  remove(gobj);
			}
		}
	}

/* Private constants */
	private static final double STAR_SIZE = 20;
	private GStar star;
	
	private GObject gobj;
	private GPoint last;
	
	private JTextField starName;
	private int starPosition_X;
	private int starPosition_Y;
}
