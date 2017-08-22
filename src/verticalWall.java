// TODO: Auto-generated Javadoc
/**
 * The Class verticalWall.
 */
public class verticalWall extends GameObject1 {

	
	/**
	 * Instantiates a new vertical wall.
	 *
	 * @param x the x
	 * @param y the y
	 */
	public verticalWall(int x, int y){
		super(); //Initialize everything in the GameObject class First
		this.setX(x); //Set the players initial x
		this.setY(y); //Set the players initial y
		this.setImage("smallWall-7X251.png"); //Set Image by name directory starts in res
	}
	
}
