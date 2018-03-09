package GUI;

import java.awt.event.ActionEvent;

import acm.program.*;
import acm.graphics.*;

import javax.swing.*;

public class SimpleCheckbox extends ConsoleProgram {
	
	public void init() {
		check = new JCheckBox("Add 1");
		check.setSelected(true);
		add(check, SOUTH);
		
		JButton but = new JButton("Press Me!");
		add(but, SOUTH);
		addActionListeners();
	}
	
	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();
		if (cmd.equals("Press Me!")) {
				if (check.isSelected()) {
					x += 1;
					println(x);
				} else {
					x -= 1;
					println(x);
				}
		}
	}
	
	private JCheckBox check;
	int x = 0;
}
