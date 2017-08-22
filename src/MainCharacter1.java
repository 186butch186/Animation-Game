// TODO: Auto-generated Javadoc
/**
 * The Class MainCharacter1.
 */
public class MainCharacter1 extends GameObject1 {
	
	/** The max jump height. */
	public final int MAX_JUMP_HEIGHT=250;
	
	/** The is jumping. */
	private boolean isJumping=false; 
	
	/** The is falling. */
	private boolean isFalling=true;
	
	/** The last ground y. */
	private float lastGroundY;
	
	/** The Constant MAXHEALTH. */
	private static final int MAXHEALTH = 2000; 
	
	/** The health. */
	private int health = MAXHEALTH;
	
	/** The alive. */
	private boolean alive = true;
	
	/** The left. */
	private boolean left = false;
	
	/** The crouching. */
	private boolean crouching = false;
	
	/** The blocking. */
	private boolean blocking = false;
	
	/** The speed power. */
	private boolean speedPower = true;
	
	/** The using speed power. */
	private boolean usingSpeedPower = false;
	
	/** The teleport power. */
	private boolean teleportPower = true;
	
	/** The using teleport power. */
	private boolean usingTeleportPower = false;
	
	/** The attack. */
	private boolean attack = false;
	
	/** The Max number of sprints. */
	private int MaxNumberOfSprints = 10;
	
	/** The sprint count. */
	private int sprintCount = 10;
	
	/** The death count. */
	private int deathCount = 0;
	
	/**
	 * Sets the death count.
	 *
	 * @param set the new death count
	 */
	public void setDeathCount(int set)
	{
		deathCount += set;
	}
	
	/**
	 * Gets the death count.
	 *
	 * @return the death count
	 */
	public int getDeathCount()
	{
		return deathCount;
	}
	
	/**
	 * Gets the blocking.
	 *
	 * @return the blocking
	 */
	public boolean getBlocking()
	{
		return blocking;
	}
	
	/**
	 * Sets the blocking.
	 *
	 * @param set the new blocking
	 */
	public void setBlocking(boolean set)
	{
		blocking=set;
	}
	
	/**
	 * Gets the crouching.
	 *
	 * @return the crouching
	 */
	public boolean getCrouching()
	{
		return crouching;
	}
	
	/**
	 * Sets the crouching.
	 *
	 * @param set the new crouching
	 */
	public void setCrouching(boolean set)
	{
		crouching=set;
	}
	
	/**
	 * Gets the attack.
	 *
	 * @return the attack
	 */
	public boolean getAttack()
	{
		return attack;
	}
	
	/**
	 * Sets the attack.
	 *
	 * @param set the new attack
	 */
	public void setAttack(boolean set)
	{
		attack = set;
	}
	
	/**
	 * Gets the teleport power.
	 *
	 * @return the teleport power
	 */
	public boolean getTeleportPower()
	{
		return teleportPower;
	}
	
	/**
	 * Sets the teleport power.
	 *
	 * @param set the new teleport power
	 */
	public void setTeleportPower(boolean set)
	{
		teleportPower = set;
	}
	
	/**
	 * Using teleport power.
	 *
	 * @return true, if successful
	 */
	public boolean UsingTeleportPower()
	{
		return usingTeleportPower;
	}
	
	/**
	 * Sets the using teleport power.
	 *
	 * @param set the new using teleport power
	 */
	public void setUsingTeleportPower(boolean set)
	{
		usingTeleportPower = set;
	}
	
	
	/////////////////
	/**
	 * Gets the speed power.
	 *
	 * @return the speed power
	 */
	public boolean getSpeedPower()
	{
		return speedPower;
	}
	
	/**
	 * Sets the speed power.
	 *
	 * @param set the new speed power
	 */
	public void setSpeedPower(boolean set)
	{
		speedPower = set;
	}
	
	/**
	 * Using speed power.
	 *
	 * @return true, if successful
	 */
	public boolean UsingSpeedPower()
	{
		return usingSpeedPower;
	}
	
	/**
	 * Sets the using speed power.
	 *
	 * @param set the new using speed power
	 */
	public void setUsingSpeedPower(boolean set)
	{
		usingSpeedPower = set;
	}
	
	/**
	 * Gets the max number of sprints.
	 *
	 * @return the max number of sprints
	 */
	public int getMaxNumberOfSprints()
	{
		return MaxNumberOfSprints;
	}
	
	/**
	 * Gets the sprint count.
	 *
	 * @return the sprint count
	 */
	public int getSprintCount()
	{
		return sprintCount;
	}
	
	/**
	 * Increment sprint count.
	 */
	public void IncrementSprintCount()
	{
		sprintCount++;
	}
	
	/**
	 * Decrement sprint count.
	 */
	public void DecrementSprintCount()
	{
		sprintCount--;
	}
	
	/**
	 * Sets the left.
	 *
	 * @param set the new left
	 */
	public void setLeft(boolean set)
	{
		left = set;
	}
	
	/**
	 * Gets the left.
	 *
	 * @return the left
	 */
	public boolean getLeft()
	{
		return left;
	}
	
	/**
	 * Checks if is jumping.
	 *
	 * @return true, if is jumping
	 */
	public boolean isJumping(){
		return isJumping;
	}
	
	/**
	 * Checks if is falling.
	 *
	 * @return true, if is falling
	 */
	public boolean isFalling(){
		return isFalling;
	}
	
	/**
	 * Gets the last ground y.
	 *
	 * @return the last ground y
	 */
	public float getLastGroundY(){
		return lastGroundY;
		
	}
	
	/**
	 * Sets the checks if is jumping.
	 *
	 * @param jumping the new checks if is jumping
	 */
	public void setIsJumping(boolean jumping){
		isJumping=jumping;
	}
	
	/**
	 * Sets the checks if is falling.
	 *
	 * @param falling the new checks if is falling
	 */
	public void setIsFalling(boolean falling){
		isFalling=falling;
	}
	
	/**
	 * Sets the last ground y.
	 *
	 * @param lastGround the new last ground y
	 */
	public void setLastGroundY(float lastGround){
		lastGroundY=lastGround;
	}
	
	/**
	 * Damage.
	 */
	public void damage(){
		health--;
	}
	
	/**
	 * Damage.
	 *
	 * @param count the count
	 */
	public void damage(int count){
		health+=count;
	}
	
	/**
	 * Gets the health.
	 *
	 * @return the health
	 */
	public int getHealth(){
		return health;
	}
	
	/**
	 * Heal.
	 */
	public void heal(){
		health++;
	}
	
	/**
	 * Reset health.
	 */
	public void resetHealth()
	{
		health = MAXHEALTH;
	}
	
	/**
	 * Gets the alive.
	 *
	 * @return the alive
	 */
	public boolean getAlive(){ 
		return alive;
	}
	
	/**
	 * Sets the alive.
	 *
	 * @param set the new alive
	 */
	public void setAlive(boolean set){
		alive = set;
	}
	
	/**
	 * Gets the max health.
	 *
	 * @return the max health
	 */
	public int getMaxHealth(){
		return MAXHEALTH;
	}
	
	
	/**
	 * Instantiates a new main character1.
	 *
	 * @param x the x
	 * @param y the y
	 */
	public MainCharacter1(int x, int y){
		super(); //Initialize everything in the GameObject class First
		this.setX(x); //Set the players initial x
		this.setY(y); //Set the players initial y
		this.setImage("ninjaStandingRight.png"); //Set Image by name directory starts in res
        
     
		
	}
	
}