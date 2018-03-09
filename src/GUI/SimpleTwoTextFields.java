package GUI;

import acm.program.*;
import java.awt.event.*;
import javax.swing.*;

public class SimpleTwoTextFields extends ConsoleProgram {
	
	public void init() {
		
		add(new JLabel("First Name"), SOUTH);
		
		nameField = new JTextField(10);
		nameField.setActionCommand("name");
		add(nameField, SOUTH);
		
		add(new JLabel("   Surname"), SOUTH);
		
		surenameField = new JTextField(10);
		surenameField.setActionCommand("surename");
		add(surenameField, SOUTH);
		
		surenameField.addActionListener(this); // respond only on ENTER from surename
	}
	
	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();
		if (cmd.equals("surename")) {
			println("Hi, " + nameField.getText() + " " + surenameField.getText());
		}
	}
	
	private JTextField nameField;
	private JTextField surenameField;
	

}
