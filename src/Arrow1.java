// TODO: Auto-generated Javadoc
/**
 * The Class Arrow1.
 */
public class Arrow1 extends GameObject1 {

	/** The distance. */
	private int start,distance;
	
	/**
	 * Sets the distance.
	 *
	 * @param set the new distance
	 */
	public void setDistance(int set)
	{
		distance = set;
	}
	 
	/**
	 * Gets the distance.
	 *
	 * @return the distance
	 */
	public int getDistance()
	{
		return distance;
	}
	
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
	 * Instantiates a new arrow1.
	 *
	 * @param x the x
	 * @param y the y
	 */
	public Arrow1(int x, int y){
		super(); //Initialize everything in the GameObject class First
		this.setX(x); //Set the players initial x
		this.setY(y); //Set the players initial y
		this.setImage("star.png"); //Set Image by name directory starts in res
		this.setXVelocity(-.5f);

	}
	
}