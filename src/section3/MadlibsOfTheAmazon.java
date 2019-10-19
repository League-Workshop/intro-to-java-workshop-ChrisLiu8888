package section3;

import javax.swing.JOptionPane;

public class MadlibsOfTheAmazon {
	
	public static void main(String[] args) {
		// Put this sentence in a pop up:
		// If you find yourself having to cross a piranha-infested river, here's how to do it...
		String adjective = JOptionPane.showInputDialog("ENTER A ADJECTIVE");
		// Get the user to enter an adjective
		String liquid = JOptionPane.showInputDialog("ENTER A TYPE OF LIQUID");
		// Get the user to enter a type of liquid
		String body = JOptionPane.showInputDialog("ENTER A BODY PART");
		// Get the user to enter a body part
		String verb = JOptionPane.showInputDialog("ENTER A verb");
		// Get the user to enter a verb
		String place = JOptionPane.showInputDialog("ENTER A place");
		// Get the user to enter a place

		// Fit the user's words into this sentence, and save it in a String:
		// Piranhas are more [adjective] during the day, so cross the river at
		JOptionPane.showMessageDialog(null, "Piranhas are more"+adjective+ "during the day, so cross the river at");
		// night. Piranhas are attracted to fresh [type of liquid] and will most
		JOptionPane.showMessageDialog(null, "night. Piranhas are attracted to fresh"+liquid+"and will most");
		// likely take a bite out of your [body part] if you [verb]. Whatever
		JOptionPane.showMessageDialog(null, "likely take a bite out of your"+body+"if you"+verb+"Whatever");
		// you do, if you have an open wound, try to find another way to get
		JOptionPane.showMessageDialog(null, "you do, if you have an open wound, try to find another way to get");
		// back to the [place]. Good luck!
		JOptionPane.showMessageDialog(null, "back to the "+place+"Good luck!");
		// Make a pop-up for the final story. You can use \n to go to the next line
				JOptionPane.showMessageDialog(null, "Piranhas are more"+adjective+ "during the day, so cross the river at"+"\n"+"night. Piranhas are attracted to fresh"+liquid+"and will most"+"\n"+"likely take a bite out of your"+body+"if you"+verb+"Whatever"+"\n"+"you do, if you have an open wound, try to find another way to get"+"\n"+"back to the "+place+"Good luck!");

	}
}

