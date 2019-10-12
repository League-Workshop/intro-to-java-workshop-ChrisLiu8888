package section2;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class FourSquare {
	
	//
	Robot hi = new Robot();

	void go() {
		// 4. Make the robot move as fast as possible
		hi.setSpeed(1000000000);
		// 5. Set the pen width to 5
		hi.setPenWidth(10000);
		// 6. Use a for loop to repeat steps #7 to #8, four times...
		for(int i = 0; i < 4; i++) {
			
		

			// 7. Set the pen color to random
		hi.setRandomPenColor();
	
			// 1. Call the drawSquare() method
	drawSquare();
	
			// 8. Turn the robot 90 degrees to the right
             hi.turn(90);
		}
	}

	
	void drawSquare() {
		JOptionPane.showMessageDialog(null, "no!");
		/* 3. Fill in the code to draw a square inside the method below. */
		hi.penDown();
		hi.move(100);
		hi.setRandomPenColor();
		hi.turn(2000000000);
		hi.turn(2000000000);
		hi.turn(2000000000);
		hi.turn(2000000000);
		hi.turn(2000000000);
		hi.turn(2000000000);
		hi.turn(2000000000);
		hi.turn(2000000000);
		hi.turn(2000000000);
		hi.turn(2000000000);
		hi.setRandomPenColor();
		hi.move(100);
		hi.turn(2000000000);
		hi.turn(2000000000);
		hi.turn(2000000000);
		hi.turn(2000000000);
		hi.turn(2000000000);
		hi.turn(2000000000);
		hi.turn(2000000000);
		hi.turn(2000000000);
		hi.turn(2000000000);
		hi.turn(2000000000);
		hi.setRandomPenColor();
		hi.move(100);
		hi.turn(2000000000);
		hi.turn(2000000000);
		hi.turn(2000000000);
		hi.turn(2000000000);
		hi.turn(2000000000);
		hi.turn(2000000000);
		hi.turn(2000000000);
		hi.turn(2000000000);
		hi.turn(2000000000);
		hi.turn(2000000000);
		hi.setRandomPenColor();
		hi.move(100);
		hi.turn(2000000000);
		hi.turn(2000000000);
		hi.turn(2000000000);
		hi.turn(2000000000);
		hi.turn(2000000000);
		hi.turn(2000000000);
		hi.turn(2000000000);
		hi.turn(2000000000);
		hi.turn(2000000000);
		hi.turn(2000000000);
	
		
	}

	public static void main(String[] args) {
		new FourSquare().go();
	}

}



