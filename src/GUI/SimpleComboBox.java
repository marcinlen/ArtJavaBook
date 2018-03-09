package GUI;

import java.awt.event.ActionEvent;

import acm.program.*;

import javax.swing.*;

public class SimpleComboBox extends ConsoleProgram {
	
	public void init() {
		pick = new JComboBox<String>();
		
		pick.addItem("Blue");
		pick.addItem("Green");
		pick.addItem("Red");
		
		// allows for additional entry made by user (when true)
		pick.setEditable(false);
		
		// select initial value
		pick.setSelectedItem("Green");
		
		// add label for combobox
		add(new JLabel("   Color:"), SOUTH);
		
		// add combobox to canvas
		add(pick, SOUTH);
		
		// set button for user interaction
		JButton but = new JButton("Press");
		add(but, SOUTH);
		addActionListeners();
		
	}
	
	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();
		if (cmd.equals("Press")) {
			String c = (String) pick.getSelectedItem();
			if (c.equals("Green")) {
				println("You chose green.");
				} else if (c.equals("Blue")) {
					println("You chose blue.");
				} else if (c.equals("Red")) {
					println("You chose red."); 
				} else 	{}
		}
	}
	
	private JComboBox<String> pick;

}
