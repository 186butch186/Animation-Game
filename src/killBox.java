// TODO: Auto-generated Javadoc
/**
 * The Class killBox.
 */
public class killBox extends GameObject1 {

	
	/**
	 * Instantiates a new kill box.
	 *
	 * @param x the x
	 * @param y the y
	 */
	public killBox(int x, int y){
		super(); //Initialize everything in the GameObject class First
		this.setX(x); //Set the players initial x
		this.setY(y); //Set the players initial y
		this.setImage("starmach.png"); //Set Image by name directory starts in res
		this.setXVelocity(-.4f);
		this.setScale(1.2f);
	}
	
}