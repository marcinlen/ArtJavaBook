package GUI;

import acm.gui.TableLayout;
import acm.program.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class SimpleGridLayout extends Program {
	
	public void init() {
		
		setLayout(new TableLayout(2, 3)); // or BorderLayout
		
		add(new JButton("button 1"));
		
		JButton jb2 = new JButton("button 2");
		add(jb2,"gridwidth=2");
		
		JButton jb4 = new JButton("button 4");
		add(jb4,"height=50 anchor=SOUTH");
		
		JButton jb5 = new JButton("button 5");
		add(jb5, "fill=NONE anchor=NORTH");
		

		add(new JButton("button 6"));
		addActionListeners();
	}
	
	public void actionPerformed(ActionEvent e) {
		
	}

}
