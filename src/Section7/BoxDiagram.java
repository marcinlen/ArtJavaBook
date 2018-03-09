package Section7;

import acm.program.*;
import java.awt.event.*;
import javax.swing.*;

public class BoxDiagram extends GraphicsProgram { 
	
	public void init() {
		add(new JLabel("Name"), SOUTH);
		
		nameField = new JTextField(20);
		nameField.addActionListener(this);
		add(nameField, SOUTH);
		
		addBut = new JButton("Add");
		removeBut = new JButton("Remove");
		clearBut = new JButton("Clear");
		add(addBut, SOUTH);
		add(removeBut, SOUTH);
		add(clearBut, SOUTH);
		
		addActionListeners();
	}
	
	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();
		if (cmd.equals("Add")) {
			add (new Boxed(nameField.getText()), 100, 100);
		}
				
	}
	
	

	private JTextField nameField;
	private JButton addBut;
	private JButton removeBut;
	private JButton clearBut;
	
	/* box class object */
	private Boxed box;
	

}
