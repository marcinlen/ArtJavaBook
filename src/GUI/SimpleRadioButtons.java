package GUI;

import acm.program.*;
import acm.graphics.*;

import java.awt.event.*;

import javax.swing.*;

public class SimpleRadioButtons extends ConsoleProgram {
 
	public void init() {
		// create buttons
		// create group
		// add buttons to group
		// pick which one is selected
		// add buttons to control bars
		sm = new JRadioButton("small");
		med = new JRadioButton("medium");
		lrg = new JRadioButton("large");
		ButtonGroup size = new ButtonGroup();
		size.add(sm);
		size.add(med);
		size.add(lrg);
		med.setSelected(true);
		add(sm, SOUTH);
		add(med, SOUTH);
		add(lrg, SOUTH);
		
		//----------
		JButton but = new JButton("Hi!");
		add(but, SOUTH);
		addActionListeners();
	}
	
	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();
		if (cmd.equals("Hi!")) {
			//-----------------
			if (sm.isSelected()) {
				println("You selected small");
			} else if (med.isSelected()) {
				println("You selected medium");
			} else if (lrg.isSelected()) {
				println("You selected large");
			} else {
				
			}
		}
	}
	
	
	private JRadioButton sm;
	private JRadioButton med;
	private JRadioButton lrg;
}
