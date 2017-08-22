 import javax.swing.JOptionPane;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.SlickException;


/**
 * The Class NinjaDriver.
 */
public class NinjaDriver {
	
	/** The Constant GAME_HEIGHT. */
	private static final int GAME_HEIGHT = 1000;
	
	/** The Constant GAME_WIDTH. */
	private static final int GAME_WIDTH = 1280;
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[]args){
		LevelOne game = new LevelOne("THE ART DEPARTMENT STRIKES BACK");
		AppGameContainer container;
		JOptionPane.showMessageDialog(null,"The Art department at Radford University has hired ninjas that have "
				+ "stolen Doctor Chases Bear! Defeat them and locate the bear to bring back to Doctor Chase.","Prepare for battle",
		          JOptionPane.PLAIN_MESSAGE);
		JOptionPane.showMessageDialog(null,"(Basic Controls)\n Up Key = Jump\n W = attack\n S = block \n"
				+ "(Powers)\nA = sprint left\n D = sprint right\n X = teleport through objects (walls).","Controls",
		          JOptionPane.PLAIN_MESSAGE);
		JOptionPane.showMessageDialog(null,"(1) Sprinting into objects will kill you instantly (except smash blocks - which only do damage going down)\n"
				+ "(2) Dont run through enemys, this will do more damage than their attacks, so its better to fight them head on!\n"
				+ "(3) Can only block ninja fireBalls. Ninja stars, spikes, boulders, and smash blocks will all damage or kill you.\n"
	            + "(4) Keep your eyes open for oppurtunities to use the teleport feature.\n"
				+ "(5) Your final score is dependent upon how many deaths you have!"
	            ,"GamePlay",
		          JOptionPane.PLAIN_MESSAGE);
		
		
		try{
			container = new AppGameContainer(game,GAME_WIDTH,GAME_HEIGHT,false);
			container.setShowFPS(false);
			container.start();
		}
		catch(SlickException e){
			
		}
	}
	

}
