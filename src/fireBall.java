// TODO: Auto-generated Javadoc
/**
 * The Class fireBall.
 */
public class fireBall extends GameObject1 {
    
    /** The start. */
    private float start;
	
	/** The distance. */
	private int distance;
	
	/** The is on screen. */
	private boolean isOnScreen=false;
	
	/**
	 * Checks if is on screen.
	 *
	 * @return true, if is on screen
	 */
	public boolean isOnScreen()
	{
	  return isOnScreen;	
	}
	
	/**
	 * Sets the checks if is on screen.
	 *
	 * @param set the new checks if is on screen
	 */
	public void setIsOnScreen(boolean set)
	{
	  isOnScreen = set;
	}
	
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
	public void setStart(float set)
	{
		start = set;
	}
	 
	/**
	 * Gets the start.
	 *
	 * @return the start
	 */
	public float getStart()
	{
		return start;
	}
	
	/**
	 * Instantiates a new fire ball.
	 *
	 * @param x the x
	 * @param y the y
	 * @param distance the distance
	 */
	public fireBall(int x,int y,int distance){
		super(); //Initialize everything in the GameObject class First
		this.setX(x);
		this.setY(y);
		this.setDistance(distance);
		this.setImage("fireBall.png"); //Set Image by name directory starts in res
		this.setXVelocity(-.6f);

	}
	
}