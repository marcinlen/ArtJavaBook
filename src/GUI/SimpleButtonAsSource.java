package GUI;

import acm.program.*;
import java.awt.event.*;
import javax.swing.*;

public class SimpleButtonAsSource extends ConsoleProgram {

	public void init() {
		hiButton = new JButton("Hi");
		add(hiButton, SOUTH);
		addActionListeners();
		
	}
	
	public void actionPerformed(ActionEvent e) {
		if (hiButton == e.getSource()) {
			println("Hello There");
		}
	}
	
	private JButton hiButton;
}
