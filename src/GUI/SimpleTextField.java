package GUI;

import acm.program.*;
import java.awt.event.*;
import javax.swing.*;

public class SimpleTextField extends ConsoleProgram {
	
	public void init() {
		add(new JLabel("Name"), SOUTH);
		
		nameField = new JTextField(10);
		nameField.addActionListener(this);
		add(nameField, SOUTH);
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == nameField) {
			println("Hello " + nameField.getText());
		}
	}
	
	private JTextField nameField;
	

}
