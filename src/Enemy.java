// TODO: Auto-generated Javadoc
/**
 * The Class Enemy.
 */
public class Enemy extends GameObject1 {
	
	/** The max jump height. */
	public final int MAX_JUMP_HEIGHT=150;

	/** The Constant MAXHEALTH. */
	private static final int MAXHEALTH = 600; 
	
	/** The health. */
	private int health = MAXHEALTH;
	
	/** The alive. */
	private boolean alive = true;
	
	/** The left. */
	private boolean left = true;
	
	/** The attack. */
	private boolean attack = false;
	
	/** The prepare attack. */
	private boolean prepareAttack = false;
	
	/** The attack count. */
	private int attackCount = 200;
	
	/** The generate attack. */
	private int generateAttack;
	
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
	 * Gets the generate attack.
	 *
	 * @return the generate attack
	 */
	public int getGenerateAttack()
	{
		return generateAttack;
	}
	
	/**
	 * Sets the generate attack.
	 *
	 * @param set the new generate attack
	 */
	public void setGenerateAttack(int set)
	{
		generateAttack = set;
	}

	/**
	 * Gets the attack count.
	 *
	 * @return the attack count
	 */
	public int getAttackCount()
	{
		return attackCount;
	}
	
	/**
	 * Decrement attack count.
	 */
	public void decrementAttackCount()
	{
		attackCount--;
	}
	
	/**
	 * Sets the attack count.
	 *
	 * @param set the new attack count
	 */
	public void setAttackCount(int set)
	{
		attackCount = set;
	}


	/**
	 * Gets the pre attack.
	 *
	 * @return the pre attack
	 */
	public boolean getPreAttack()
	{
		return prepareAttack;
	}
	
	/**
	 * Sets the pre attack.
	 *
	 * @param set the new pre attack
	 */
	public void setPreAttack(boolean set)
	{
		prepareAttack = set;
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
	 * Gets the left.
	 *
	 * @return the left
	 */
	public boolean getLeft()
	{
		return left;
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
	 * Damage.
	 */
	public void damage()
	{
		health--;
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
	 * Sets the max health.
	 *
	 * @param set the new max health
	 */
	public void setMaxHealth(int set)
	{
		health = set;
	}
	
	
	/**
	 * Instantiates a new enemy.
	 *
	 * @param x the x
	 * @param y the y
	 * @param set the set
	 */
	public Enemy(int x, int y,int set){
		super(); //Initialize everything in the GameObject class First
		this.setX(x); //Set the players initial x
		this.setY(y); //Set the players initial y
		this.setStart(set);
		this.setImage("badGuyLeft.png"); //Set Image by name directory starts in res
		this.setXVelocity(-.4f);
	}
	
	/**
	 * Instantiates a new enemy.
	 *
	 * @param x the x
	 * @param y the y
	 * @param set the set
	 * @param set2 the set2
	 */
	public Enemy(int x, int y,int set, int set2){
		super(); //Initialize everything in the GameObject class First
		this.setX(x); //Set the players initial x
		this.setY(y); //Set the players initial y
		this.setStart(set);
		this.setMaxHealth(set2);
		this.setImage("badGuyLeft.png"); //Set Image by name directory starts in res
		this.setXVelocity(-.4f);
	}
	
}