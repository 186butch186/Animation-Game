// TODO: Auto-generated Javadoc
/**
 * The Class spikes.
 */
public class bear extends GameObject1 {

	
	/**
	 * Instantiates a new spikes.
	 *
	 * @param x the x
	 * @param y the y
	 */
	public bear(int x, int y){
		super(); //Initialize everything in the GameObject class First
		this.setX(x); //Set the players initial x
		this.setY(y); //Set the players initial y
		this.setImage("bear.png"); //Set Image by name directory starts in res
		this.setScale(.50f);
	}
	
}
