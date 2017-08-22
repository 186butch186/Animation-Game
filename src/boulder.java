// TODO: Auto-generated Javadoc
/**
 * The Class boulder.
 */
public class boulder extends GameObject1 {

/** The start. */
private int start;
	
	/**
	 * Sets the start.
	 *
	 * @param set the new start
	 */
	public void setStart(int set)
	{
		start = set;
	}
	 
	/**
	 * Gets the start.
	 *
	 * @return the start
	 */
	public int getStart()
	{
		return start;
	}
	
	/**
	 * Instantiates a new boulder.
	 *
	 * @param x the x
	 * @param y the y
	 */
	public boulder(int x, int y){
		super(); //Initialize everything in the GameObject class First
		this.setX(x); //Set the players initial x
		this.setY(y); //Set the players initial y
		this.setImage("boulder.png"); //Set Image by name directory starts in res
		this.setYVelocity(.6f);
	}
	
}
