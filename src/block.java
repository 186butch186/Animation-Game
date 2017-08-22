// TODO: Auto-generated Javadoc
/**
 * The Class block.
 */
public class block extends GameObject1 {

/** The count. */
private int start,count = 1000;

/** The smash. */
private boolean smash = true;

/**
 * Sets the smash.
 *
 * @param set the new smash
 */
public void setSmash(boolean set)
{
	smash = set;
}
 
/**
 * Gets the smash.
 *
 * @return the smash
 */
public boolean getSmash()
{
	return smash;
}
	
/**
 * Sets the count.
 *
 * @param set the new count
 */
public void setCount(int set)
{
	count = set;
}
 
/**
 * Gets the count.
 *
 * @return the count
 */
public int getCount()
{
	return count;
}

/**
 * Decrement count.
 */
public void decrementCount()
{
	count--;
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
	 * Instantiates a new block.
	 *
	 * @param x the x
	 * @param y the y
	 */
	public block(int x, int y){
		super(); //Initialize everything in the GameObject class First
		this.setX(x); //Set the players initial x
		this.setY(y); //Set the players initial y
		this.setImage("block.png"); //Set Image by name directory starts in res
		this.setYVelocity(1f);
		
	}
	
}
