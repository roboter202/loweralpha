package view.ActionListeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



import javax.swing.JOptionPane;

import view.JAlphaNotationGUI;

public class JMenuItemAboutViewActionListener implements ActionListener {

	private JAlphaNotationGUI gui;	
	public JMenuItemAboutViewActionListener(JAlphaNotationGUI gui) {
		this.gui = gui;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {		
		
		String display = "Developed by Jan Mueller, Sirko Höer & Ashley Stirling.";
		display += "\n\nBackend developers: Jan Mueller & Sirko Höer";
		display += "\nFrontend developer: Ashley Stirling";
		display += "\n\nTrnslation German: Ashley Stirling";
		display += "\nTranslation English: Ashley Stirling";
		display += "\nTranslation Russian: Ashley Stirling, Евгения У. :)";
		display += "\nTranslation Japanese: Ashley Stirling, Julia H. :)";
		
		JOptionPane.showMessageDialog(null, display);		
	}
}
