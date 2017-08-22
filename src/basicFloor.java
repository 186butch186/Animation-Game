// TODO: Auto-generated Javadoc
/**
 * The Class basicFloor.
 */
public class basicFloor extends GameObject1 {

	
	/**
	 * Instantiates a new basic floor.
	 *
	 * @param x the x
	 * @param y the y
	 */
	public basicFloor(int x, int y){
		super(); //Initialize everything in the GameObject class First
		this.setX(x); //Set the players initial x
		this.setY(y); //Set the players initial y
		this.setImage("basicfloor.png"); //Set Image by name directory starts in res
	}
	
}
