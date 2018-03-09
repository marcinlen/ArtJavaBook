package GUI;

import acm.program.*;
import java.awt.event.*;
import javax.swing.*;

public class SimpleButton extends ConsoleProgram {

	public void init() {
		JButton but = new JButton("Hi!");
		add(but, SOUTH);
		addActionListeners();
	}
	
	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();
		if (cmd.equals("Hi!")) {
				println("Hi!");
				print("Hi!");
		}
	}
	
	
}
