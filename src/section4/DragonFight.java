package section4;

import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class DragonFight {
	// 1. Put all of the game code inside the main method (below) 
	public static void main(String[] args) {
		
		ImageIcon dragon = new ImageIcon("src/section4/dragonPicture.jpg");		
		
		JOptionPane.showMessageDialog(null, "Defeat the dragon to take its treasure!", "Dragon Fighter", 0, dragon);
		// 2. Create a variable called "playerHealth" to store your health (set it equal to 100)
		int playerHealth=10000;
	
		// 3. Create a variable called "dragonHealth" to store the dragon's health (set it equal to 100)
		int dragonHealth=100;
		
		// 4. Create a variable to hold the damage the player's attack does each round
		
		int damageCausedByPlayer= 0;
		// 5. Create a variable to hold the damage the dragon's attack does each round
		int damageCausedByDragon= 0;
		
		// 6.  Delete the slashes at the beginning of the next line.  
		while(playerHealth>0 && dragonHealth>0) {    //this line of code keeps the battle going until someone's health reaches 0 
		
		// 7. Add a closing mustache at the very bottom of this program (since we just added an opening mustache on the previous step).
			
		// 8. Ask the player in a pop-up if they want to attack the dragon with a yell or a kick
		String playerAction = JOptionPane.showInputDialog("KICK OR KICK");
		// 9. If they typed in "yell":
		
		if(playerAction.equals("kick")) {
			int randome=(new Random().nextInt(99));
			dragonHealth= dragonHealth - randome;
			JOptionPane.showMessageDialog(null, "You did "+ randome +" damage" );
			

		}
			//-- Find a random number between 0 and 10 and store it in dragonDamage
		
			//-- Subtract that number from the dragon's health variable 
		
		// 10. If they typed in "kick":
		
			//-- Find a random number between 0 and 25 and store it in dragonDamage
			
			//-- Subtract that number from the dragon's health variable
			
			
		
		// 11.  Find a random number between 0 and 35 and store it in playerDamage
		int dragonDamage=(new Random().nextInt(3));
		// 12. Subtract this number from the player's health
		playerHealth = playerHealth - dragonDamage;
		
		
		// 13. If the user's health is less than or equal to 0
		
			//-- Tell the user that they lost
			if( playerHealth==0) {
					JOptionPane.showMessageDialog(null, "you die");
			}
		// 14. Else if the dragon's health is less than or equal to 0
		
			//-- Tell the user that the dragon is dead and they took a ton of gold!
			if( dragonHealth==0) {
					JOptionPane.showMessageDialog(null, "you ");
	   //  15.  Else
			}
			//-- Pop up a message that tells the their current health and the dragon's currently health (Bonus: Also display the amount of health that was lost for each player this round)
			
		}
	}
}
