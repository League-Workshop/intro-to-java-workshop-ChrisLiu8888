package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		int score=0;
	
		
		String question  = JOptionPane.showInputDialog("what is youre age");
		
		if(question.equals("999")) {
			JOptionPane.showMessageDialog(null, "correct");
			score++;

			}else{
				JOptionPane.showMessageDialog(null, "wrong");
			}
		String question1  = JOptionPane.showInputDialog("what is 1+1");
		
		if(question1.equals("2")) {
			JOptionPane.showMessageDialog(null, "correct");
			score++;

			}else{
				JOptionPane.showMessageDialog(null, "wrong");
			}
		String question2  = JOptionPane.showInputDialog("what is 2+2");
		
		if(question2.equals("4")) {
			JOptionPane.showMessageDialog(null, "correct");
			score++;

			}else{
				JOptionPane.showMessageDialog(null, "wrong");
			}
		String question3  = JOptionPane.showInputDialog("what is 5+5");
		
		if(question3.equals("10")) {
			JOptionPane.showMessageDialog(null, "correct");
			score++;

			}else{
				JOptionPane.showMessageDialog(null, "wrong");
			}
		
		
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
		
		 System.out.println(score);
	}
}
