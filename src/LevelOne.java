

import java.awt.Graphics;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import org.newdawn.slick.Animation;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Input;
import org.newdawn.slick.Music;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.SpriteSheet;


/**
 * The Class LevelOne.
 */
public class LevelOne extends BasicGame {
	//Objects for main character
	//Starting Spawn -999
	//Boss fightX 35500
	//Start level
	/** The spawnx. */
	private int SPAWNX = -999;
	
	/** The spawny. */
	private int SPAWNY = 100;
	
	/** The Constant PLAYERSPEED. */
	private static final float PLAYERSPEED = .5f;
	
	/** The Constant SPEED. */
	private static final float SPEED = 1f;
	
	/** The stick man. */
	private MainCharacter1 stickMan;
	
	/** The teleport count. */
	private int teleportCount = 1000;
    
    /** The sprint count. */
    private int sprintCount = 150;
    
    /** The attacking count. */
    private int attackingCount = 90;
    
    /** The colliding left. */
    private boolean collidingRight,collidingLeft;
    
    /** The camera. */
    private Camera1 camera;
    
    /** The count. */
    private int count = 300;
    
    /** The bear*/
    private bear Bear;
	
    //Objects for map
    /** The v wall2. */
    private verticalWall vWall1,vWall2;

    /** The enemy array. */
    private Enemy []enemyArray;
    
    /** The arrow array. */
    private Arrow1 []arrowArray;
    
    /** The floor array. */
    private basicFloor []floorArray;
    
    /** The kill box array. */
    private killBox []killBoxArray;
    
    /** The boulder array. */
    private boulder []boulderArray;
    
    /** The block array. */
    private block []blockArray;
    
    /** The s wall array. */
    private smallWall []sWallArray;
    
    /** The spike array. */
    private spikes []spikeArray;
    
    /** The medic array. */
    private medic [] medicArray;
    
    /** The s floor array. */
    private smallFloor [] sFloorArray;
    
    /** The fire ball array. */
    private fireBall [] fireBallArray;
    
    /** The loading array. */
    private int loading = 0;
    
    /** The menu object. */
    private GameObject1 menu;
    
    /** The Score. */
    private int Score = 100000;
    
    /** The music. */
    private Music menuM;


	
	/**
	 * Instantiates a new level one.
	 *
	 * @param title the title
	 */
	public LevelOne(String title){
		super(title);
	}
	
	/* 
	 * @see org.newdawn.slick.BasicGame#init(org.newdawn.slick.GameContainer)
	 */
	@Override
	public void init(GameContainer gc) throws SlickException{
		
		stickMan = new MainCharacter1(SPAWNX,SPAWNY);
		camera = new Camera1();
		createFloors();
		createSmallFloors();
	    createSmallWalls();
		createEnemys();
		createSpikes();
		createKillBox();
		createArrows();
		createBoulders();
		createBlocks();
		createFastBlocks();
		addMedic();
		createFireBalls();
		Bear = new bear(41400,550);
		menu = new GameObject1();
		menu.setX(0);
		menu.setY(0);
		menu.setImage("gamePhoto.png");
		menuM = new Music("res/Game/300.ogg");
		menuM.play();
		
		
		
	}
	
  /**
   * Creates the floors.
   */
  private void createFloors()
  {
	  floorArray = new basicFloor[33];
	  floorArray[0]= new basicFloor(0,400);
	  floorArray[1]=new basicFloor(1450,500);
	  floorArray[2]=new basicFloor(2450,250);
	  floorArray[3]=new basicFloor(4300,250);
	  floorArray[4]=new basicFloor(5400,50);
	  floorArray[5]=new basicFloor(7000,250);
	  floorArray[6]=new basicFloor(8150,1300);
	  floorArray[7]=new basicFloor(9200,1300);
	  floorArray[8]=new basicFloor(10300,1300);
	  floorArray[9]=new basicFloor(11400,1300);
	  floorArray[10]=new basicFloor(12500,1000);
	  floorArray[11]=new basicFloor(13500,1000);
	  floorArray[12]=new basicFloor(14600,1400);
	  floorArray[13]=new basicFloor(15700,1400);
	  floorArray[14]=new basicFloor(17000,1400);
	  floorArray[15]=new basicFloor(16800,2200);
	  floorArray[16]=new basicFloor(17900,2200);
	  floorArray[17]=new basicFloor(19500,2200);
	  floorArray[18]=new basicFloor(21000,2200);
	  floorArray[19]=new basicFloor(22100,2200);
	  floorArray[20]=new basicFloor(23200,2200);
	  floorArray[21]=new basicFloor(24800,2200);
	  floorArray[22]=new basicFloor(26200,990);
	  floorArray[23]=new basicFloor(30800,850);
	  floorArray[24]=new basicFloor(32110,850);
	  floorArray[25]=new basicFloor(33420,850);
	  floorArray[26]=new basicFloor(34520,1960);
	  floorArray[27]=new basicFloor(35620,850);
	  floorArray[28]=new basicFloor(36720,850);
	  floorArray[29]=new basicFloor(37820,850);
	  floorArray[30]=new basicFloor(38920,850);
	  floorArray[31]=new basicFloor(40520,850);//bear floor
	  floorArray[32]=new basicFloor(-1000,400);//bear floor
	  
		
  }
  
  /**
   * Creates the small floors.
   */
  private void createSmallFloors()
  {
	  sFloorArray = new smallFloor[14];
	  sFloorArray[0]= new smallFloor(25990,2000);
	  sFloorArray[1]= new smallFloor(25700,1700);
	  sFloorArray[2]= new smallFloor(25990,1400);
	  sFloorArray[3]= new smallFloor(25400,1200);
	  sFloorArray[4]= new smallFloor(28000,990);
	  sFloorArray[5]= new smallFloor(29000,990);
	  sFloorArray[6]= new smallFloor(30000,1000);
	  sFloorArray[7]= new smallFloor(30600,850);
	  sFloorArray[8]= new smallFloor(31900,1100);
	  sFloorArray[9]= new smallFloor(33210,1100);
	  sFloorArray[10]= new smallFloor(34520,1800);
	  sFloorArray[11]= new smallFloor(35200,1600);
	  sFloorArray[12]= new smallFloor(35400,1300);
	  sFloorArray[13]= new smallFloor(35400,1100);
	  
  }
  
  
  /**
   * Creates the small walls.
   */
  private void createSmallWalls()
  {
	  sWallArray = new smallWall[14];
	 sWallArray[0] = new smallWall(8400,-100);
	 sWallArray[1] = new smallWall(14600,300);//floor12
	 sWallArray[2] = new smallWall(17000,800);//floor 15
	 sWallArray[3] = new smallWall(18200,600);//floor 17
	 sWallArray[4] = new smallWall(25900,2210);//floor 22
	 sWallArray[5] = new smallWall(26200,1000);//floor 22
	 sWallArray[6] = new smallWall(26200,2100);//floor 22
	 sWallArray[7] = new smallWall(31900,860);//floor 23
	 sWallArray[8] = new smallWall(32110,860);//floor 23
	 sWallArray[9] = new smallWall(33210,860);//floor 24
	 sWallArray[10] = new smallWall(33420,860);//floor 24
	 
	 sWallArray[11] = new smallWall(34520,860);//floor 24
	 sWallArray[12] = new smallWall(35620,860);//floor 24
	 sWallArray[13] = new smallWall(40020,-500);//floor 24
  }
  
  /**
   * Creates the spikes.
   */
  private void createSpikes()
  {
		spikeArray = new spikes[12];
		//-150 from floor 7
		spikeArray[0] = new spikes(8150,1210);
		//floor 12
		spikeArray[1] = new spikes(14600,1310);
		spikeArray[2] = new spikes(14750,1310);
		//floor 18
		spikeArray[3] = new spikes(21000,2110);
		spikeArray[4] = new spikes(23200,2110);
		//floor 21
		spikeArray[5] = new spikes(25900,3100);
		spikeArray[6] = new spikes(26050,3100);
		//floor 26
		spikeArray[7] = new spikes(34520,1870);
		spikeArray[8] = new spikes(34720,1870);
		spikeArray[9] = new spikes(34920,1870);
		spikeArray[10] = new spikes(35120,1870);
		spikeArray[11] = new spikes(35320,1870);
		
		
  }
  
  /**
   * Creates the enemys.
   */
  private void createEnemys()
  {
	  enemyArray = new Enemy[6];
	  enemyArray[0] = new Enemy(1000,250,1000);//floor one
	  enemyArray[1] = new Enemy(17900,2050,17900,1000);
	  enemyArray[2] = new Enemy(19000,2050,19000);//floor 15 - 16
	  enemyArray[3] = new Enemy(20500,2050,20500,1000);//floor 17
	  enemyArray[4] = new Enemy(27200,840,27200,2000);//floor 17
	  enemyArray[5] = new Enemy(39950,700,40010,5000);//floor 17
	  
  }
  
  /**
   * Creates the kill box.
   */
  private void createKillBox()
  {
	  killBoxArray = new killBox[4];
	  killBoxArray[0] = new killBox(9150,1190);//95 less than floor 7
	  killBoxArray[1] = new killBox(11600,1190);//95 less than floor 9
	  killBoxArray[2] = new killBox(18900,1900);//floor 16
	  killBoxArray[3] = new killBox(18900,1950);//floor 16
  }
  
  /**
   * Creates the arrows.
   */
  private void createArrows()
  {
	  arrowArray = new Arrow1[6];
	  arrowArray[0] = new Arrow1(9150,1190);
	  arrowArray[0].setStart(9150);  arrowArray[0].setDistance(800);  //floor 10
	  arrowArray[1] = new Arrow1(11600,1190);
	  arrowArray[1].setStart(11600); arrowArray[1].setDistance(1600); // floor 9
	  arrowArray[2] = new Arrow1(18900,1900);
	  arrowArray[2].setStart(18900);  arrowArray[2].setDistance(2000);  //floor 16
	  arrowArray[3] = new Arrow1(18900,2000);
	  arrowArray[3].setStart(18900); arrowArray[3].setDistance(2000); //floor 16
	  arrowArray[4] = new Arrow1(18400,1900);
	  arrowArray[4].setStart(18900);  arrowArray[4].setDistance(2000);  //floor 16
	  arrowArray[5] = new Arrow1(18400,2000);
	  arrowArray[5].setStart(18900); arrowArray[5].setDistance(2000); //floor 16
	
	  
  }
  
  /**
   * Creates the boulders.
   */
  private void createBoulders()
  {
	  boulderArray = new boulder[6];
	  boulderArray[0]=new boulder(10200,600);
	  boulderArray[0].setStart(600);//floor 8
	  boulderArray[1]=new boulder(10600,700);
	  boulderArray[1].setStart(600);//floor 8
	  boulderArray[2]=new boulder(11000,600);
	  boulderArray[2].setStart(600);//floor 8
	  boulderArray[3]=new boulder(11400,600);
	  boulderArray[3].setStart(600);//floor 8
	  boulderArray[4]=new boulder(29050,300);
	  boulderArray[4].setStart(300);//floor 8
	  boulderArray[5]=new boulder(30650,-100);
	  boulderArray[5].setStart(-100);//floor 8
	  
  }
  
  /**
   * Creates the blocks.
   */
  private void createBlocks()
  {
	  blockArray = new block[22];
	  blockArray[0]=new block(10200,520);
	  blockArray[1]=new block(10800,520);
	  blockArray[2]=new block(11200,520);//floor 8
	  blockArray[3]=new block(12500,220);//floor 10
	  blockArray[3].setStart(220);//floor 10
	  blockArray[4]=new block(13000,220);//floor 10
	  blockArray[4].setStart(220);//floor 10
	  blockArray[5]=new block(13500,220);//floor 10
	  blockArray[5].setStart(220);//floor 10
	  blockArray[6]=new block(14000,220);//floor 10
	  blockArray[6].setStart(220);//floor 10
	  blockArray[7]=new block(21200,1400);//floor 18
	  blockArray[7].setStart(1400);//floor 18
	  blockArray[8]=new block(21700,1400);//floor 18
	  blockArray[8].setStart(1400);//floor 18
	  blockArray[9]=new block(22300,1400);//floor 18
	  blockArray[9].setStart(1400);//floor 18
	  blockArray[10]=new block(23200,1400);//floor 18
	  blockArray[10].setStart(1400);//floor 18
	  blockArray[11]=new block(23700,1400);//floor 18
	  blockArray[11].setStart(1400);//floor 18
}
  
  /**
   * Creates the fast blocks.
   */
  private void createFastBlocks()
  {
	  
	  blockArray[12]=new block(31000,75);//floor 23
	  blockArray[12].setStart(75);//floor 23
	  blockArray[13]=new block(31590,75);//floor 23
	  blockArray[13].setStart(75);//floor 23
	  blockArray[14]=new block(32180,75);//floor 23
	  blockArray[14].setStart(75);//floor 23
	  blockArray[15]=new block(32770,75);//floor 23
	  blockArray[15].setStart(75);//floor 23
	  blockArray[16]=new block(33360,75);//floor 23
	  blockArray[16].setStart(75);//floor 23
	  blockArray[17]=new block(33950,75);//floor 23
	  blockArray[17].setStart(75);//floor 23
	  
	  blockArray[18]=new block(35650,75);//floor 26
	  blockArray[18].setStart(75);//floor 26
	  blockArray[19]=new block(36200,75);//floor 26
	  blockArray[19].setStart(75);//floor 26
	  
	  blockArray[20]=new block(37200,75);//floor 26
	  blockArray[20].setStart(75);//floor 26
	  
	  blockArray[21]=new block(39300,75);//floor 26
	  blockArray[21].setStart(75);//floor 26
  }
  
  /**
   * Adds the medic.
   */
  private void addMedic()
  {
	  medicArray = new medic[2];
	  medicArray[0]=new medic(18000,1320);
	  medicArray[1]=new medic(25300,2110);
  }
  
  /**
   * Creates the fire balls.
   */
  private void createFireBalls()
  {
	  fireBallArray = new fireBall[35];
	  for(int i = 0; i < 35;i++)
		  fireBallArray[i]=new fireBall(0,0,4400);
  }
	
	/* (non-Javadoc)
	 * @see org.newdawn.slick.Game#render(org.newdawn.slick.GameContainer, org.newdawn.slick.Graphics)
	 */
	@Override
	public void render(GameContainer gc, org.newdawn.slick.Graphics g)
			throws SlickException {
		g.setBackground(Color.gray);
		if(loading < 1000){
			menu.getImage().draw(menu.getX(),menu.getY(),menu.getScale());
			g.drawString("Loading... "+loading,100 ,200);}
		if(loading > 999){
		camera.setCameraX(stickMan.getX()-200);
		camera.setCameraY(stickMan.getY()-350);
		g.translate(camera.getCameraX(), camera.getCameraY());
		stickMan.getImage().draw(stickMan.getX(),stickMan.getY(),stickMan.getScale());
		/**Loads all game objects through arrays*/
		for(int i = 0; i < enemyArray.length;i++)
		if(enemyArray[i].getAlive()){
		enemyArray[i].getImage().draw(enemyArray[i].getX(),enemyArray[i].getY(),enemyArray[i].getScale());
		g.drawString("Health: "+enemyArray[i].getHealth(),enemyArray[i].getX()-25 ,enemyArray[i].getY()-25);}
		Bear.getImage().draw(Bear.getX(),Bear.getY(),Bear.getScale());
		for(int i = 0; i < floorArray.length;i++)
			floorArray[i].getImage().draw(floorArray[i].getX(),floorArray[i].getY(),floorArray[i].getScale());
		for(int i = 0; i < sFloorArray.length;i++)
			sFloorArray[i].getImage().draw(sFloorArray[i].getX(),sFloorArray[i].getY(),sFloorArray[i].getScale());
		for(int i = 0; i < fireBallArray.length;i++){
			if(fireBallArray[i].isOnScreen())
			fireBallArray[i].getImage().draw(fireBallArray[i].getX(),fireBallArray[i].getY(),fireBallArray[i].getScale());}
		for(int i = 0; i < sWallArray.length;i++)
			sWallArray[i].getImage().draw(sWallArray[i].getX(),sWallArray[i].getY(),sWallArray[i].getScale());
		for(int i = 0; i < spikeArray.length;i++)
			spikeArray[i].getImage().draw(spikeArray[i].getX(),spikeArray[i].getY(),spikeArray[i].getScale());
		for(int i = 0; i < arrowArray.length;i++)
		arrowArray[i].getImage().draw(arrowArray[i].getX(),arrowArray[i].getY(),arrowArray[i].getScale());
		for(int i = 0; i < killBoxArray.length;i++)
        killBoxArray[i].getImage().draw(killBoxArray[i].getX(),killBoxArray[i].getY(),killBoxArray[i].getScale());
		for(int i = 0; i < boulderArray.length;i++)
			boulderArray[i].getImage().draw(boulderArray[i].getX(),boulderArray[i].getY(),boulderArray[i].getScale());
		for(int i = 0; i <blockArray.length;i++)
			blockArray[i].getImage().draw(blockArray[i].getX(),blockArray[i].getY(),blockArray[i].getScale());
		for(int i = 0; i <medicArray.length;i++)
			medicArray[i].getImage().draw(medicArray[i].getX(),medicArray[i].getY(),medicArray[i].getScale());
		//Messages to the user
		g.drawString("Good luck... ",12300 ,1000);
		g.drawString("DONT GO UP ^! YOU WILL DIE ",25900 ,1900);
		g.drawString("DONT GO DOWN ... REALLY DONT GO DOWN ",25850 ,2100);
		g.drawString("CHECKPOINT ",34850 ,1300);
		//StickMan
		g.drawString("Health: "+stickMan.getHealth(),stickMan.getX()-200 ,stickMan.getY()-300);
		g.drawString("Deaths: "+stickMan.getDeathCount(),stickMan.getX()-200 ,stickMan.getY()-250);
		if(stickMan.UsingTeleportPower())
			g.drawString("Time Till Teleport "+teleportCount,stickMan.getX()-200 ,stickMan.getY()-200);}}
	/* 
	 * @see org.newdawn.slick.BasicGame#update(org.newdawn.slick.GameContainer, int)
	 */
	@Override
    public void update(GameContainer gc,int delta) throws SlickException{
		if(loading < 1000)
			loading++;
	    Input i=gc.getInput();
	    updateObjects();
		//attacking
		if(i.isKeyDown(Input.KEY_W)&&stickMan.getAlive()&&stickMan.getXVelocity()==0 && !stickMan.getBlocking())
			  keyX();
		 else
		  stickMan.setAttack(false);
		//blocking
		if(i.isKeyDown(Input.KEY_S)&&stickMan.getAlive()&&stickMan.getXVelocity()==0)
			 keyC();
		 else
		  stickMan.setBlocking(false);
       //walking left
		 if(i.isKeyDown(Input.KEY_LEFT)&&stickMan.getAlive() &&!collidingLeft && !stickMan.getCrouching())
			 keyLeft();
	   //walking right
		else if(i.isKeyDown(Input.KEY_RIGHT)&&stickMan.getAlive()&&!collidingRight && !stickMan.getCrouching())
		        keyRight();
		//if stick man is not jumping,falling,has speed power,and has speed left can use this move
		else if(i.isKeyDown(Input.KEY_D)&&stickMan.getAlive()&&!collidingRight && !stickMan.getCrouching())
			    keyS();
	    //if stick man is not jumping,falling,has speed power,and has speed left can use this move
		else if(i.isKeyDown(Input.KEY_A)&&stickMan.getAlive()&&!collidingLeft && !stickMan.getCrouching())
			    keyA();
        //teleport
		else if(i.isKeyDown(Input.KEY_X)&&stickMan.getAlive())
			    keyD();
		//If not left and not right then player at standstill
		else{
			stickMan.setCrouching(false);
			stickMan.setXVelocity(0);
			stickMan.setUsingTeleportPower(false);
			stickMan.setUsingSpeedPower(false);}
		if(i.isKeyDown(Input.KEY_UP)&&stickMan.getAlive())
			KeySpaceBar();
		//stickMan is jumping
		jumping();
		stickMan.setY(stickMan.getY()+(stickMan.getYVelocity()*delta));
		stickMan.setX(stickMan.getX()+(stickMan.getXVelocity()*delta));
		//logs out of the system
		if(i.isKeyDown(Input.KEY_ESCAPE)){
			JOptionPane.showMessageDialog(null,"You have given up! The Art Department has won. \n"
					,"YOU LOSE!",
			          JOptionPane.WARNING_MESSAGE);
			System.exit(0);}
		/**Moves objects on screen*/
		for(int z = 0; z < enemyArray.length-1;z++)
		enemyArray[z].setX(enemyArray[z].getX()+(enemyArray[z].getXVelocity()*delta));
		for(int x = 0; x < arrowArray.length ;x++)
		arrowArray[x].setX(arrowArray[x].getX()+(arrowArray[x].getXVelocity()*delta));
		for(int x = 0; x < boulderArray.length ;x++)
		boulderArray[x].setY(boulderArray[x].getY()+(boulderArray[x].getYVelocity()*delta));
		for(int x = 3; x < blockArray.length ;x++)
			blockArray[x].setY(blockArray[x].getY()+(blockArray[x].getYVelocity()*delta));
		for(int j = 0; j < fireBallArray.length;j++){
			if(fireBallArray[j].isOnScreen())
				fireBallArray[j].setX(fireBallArray[j].getX()+(fireBallArray[j].getXVelocity()*delta));}}
	
	/**
	 * updates all objects
	 * 
	 * Calls all methods needed for player collision/deaths/respawn/enemys
	 */
	private void updateObjects(){
		checkFalling();
	    moveEnemyAll();
	    enemyAI();
	    FireBallDistance();
	    enemyCollision();
	    checkEnemyDeath();
	    medicKit();
	    spikes();
	    moveArrows();
		moveBoulders();
		moveBlock();
		moveFastBlock();
		moveBossBlock();
		respawn();
		floor();
		smallFloor();
		wall2();
		bear();
	}
	
	/**
	 * Floor.
	 */
	private void floor()
	{
	
	
	for(int i=0;i<floorArray.length;i++)
	  {
		if(stickMan.getRect().intersects(floorArray[i].getRect())&&stickMan.getY()+65 < floorArray[i].getY()){
			if(stickMan.getLeft()&&stickMan.getAlive())
				stickMan.setImage("ninjaStandingLeft.png");
				if(!stickMan.getLeft()&&stickMan.getAlive())
				stickMan.setImage("ninjaStandingRight.png");
				
				stickMan.setY(floorArray[i].getY()-stickMan.getHeight()+2);
				stickMan.setIsFalling(false);
				i=floorArray.length;
			 }
		else
			stickMan.setIsFalling(true);
	   }

}
	
	/**
	 * Small floor.
	 */
	private void smallFloor()
	{
	
	
	for(int i=0;i<sFloorArray.length;i++)
	  {
		if(stickMan.getRect().intersects(sFloorArray[i].getRect())&&stickMan.getY()+95 < sFloorArray[i].getY()){
			if(stickMan.getLeft()&&stickMan.getAlive())
				stickMan.setImage("ninjaStandingLeft.png");
				if(!stickMan.getLeft()&&stickMan.getAlive())
				stickMan.setImage("ninjaStandingRight.png");
				
				stickMan.setY(sFloorArray[i].getY()-stickMan.getHeight()+2);
				stickMan.setIsFalling(false);
				i=floorArray.length;
			 }
	   }

}
	
	/**
	 * Spikes.
	 */
	private void spikes()
	{
	
	
	for(int i=0;i<spikeArray.length;i++)
	  {
		if(stickMan.getRect().intersects(spikeArray[i].getRect()))
			if(stickMan.isFalling() && !stickMan.isJumping())
			stickMan.setAlive(false);
			else
				stickMan.damage();
			 
	  }
	
	
	   

}
	
	/**
	 * Enemy collision.
	 */
	private void enemyCollision()
	{
		for(int x = 0; x < enemyArray.length ;x++)
		if(stickMan.getRect().intersects(enemyArray[x].getRect())&&enemyArray[x].getAlive()){
			if(stickMan.getAttack()&&!enemyArray[x].getAttack())
				enemyArray[x].damage();
			else if (stickMan.UsingSpeedPower())
				     stickMan.setAlive(false);
			else if(stickMan.getAlive() && stickMan.getAttack())
				   stickMan.damage();
	        else if(stickMan.getAlive())
				     stickMan.damage(-9);}
		for(int i = 0; i < arrowArray.length;i++)
			if(stickMan.getRect().intersects(arrowArray[i].getRect())){
				
				if (stickMan.UsingSpeedPower())
					     stickMan.setAlive(false);
		        else if(stickMan.getAlive()&& !stickMan.getAttack())
					     stickMan.damage(-3);}
		for(int i = 0; i < boulderArray.length;i++)
			if(stickMan.getRect().intersects(boulderArray[i].getRect())){
			   if (stickMan.UsingSpeedPower())
				     stickMan.setAlive(false);
			   else if(stickMan.getAlive())
		        	stickMan.damage(-3);}
		
		for(int i = 0; i < blockArray.length;i++)
			if(stickMan.getRect().intersects(blockArray[i].getRect())&&blockArray[i].getSmash())
			   if (stickMan.getAlive())
				     stickMan.setAlive(false);
		
		for(int j = 0; j < fireBallArray.length;j++){
			if(fireBallArray[j].isOnScreen())
				if(stickMan.getRect().intersects(fireBallArray[j].getRect()))
				if (!stickMan.getBlocking())
				{
				fireBallArray[j].setIsOnScreen(false);
				stickMan.damage(-150);
				}
				
				
			}
			 
	
	}
	
	/**
	 * Medic kit.
	 */
	private void medicKit()
	{
		for(int i = 0; i < medicArray.length;i++)
			if(stickMan.getRect().intersects(medicArray[i].getRect()))
			   if(stickMan.getAlive() && stickMan.getHealth() < stickMan.getMaxHealth())
				     stickMan.heal();
	}
	
	/**
	 * Check enemy death.
	 */
	private void checkEnemyDeath()
	{
		for(int x = 0; x < enemyArray.length ;x++)
		if(enemyArray[x].getHealth()<1)
			enemyArray[x].setAlive(false);
	}

	/**
	 * V wall.
	 */
	private void vWall()
	{
	
	verticalWall vWallArray[] = {vWall1,vWall2}; 
	for(int i=0;i<vWallArray.length;i++)
	  {
		if(stickMan.getRect().intersects(vWallArray[i].getRect()))
		{
			if(stickMan.getLeft())
				collidingLeft = true;
			else
			    collidingRight = true;
			i=vWallArray.length;	
		}
	   
	else
	{
		collidingRight = false;
		collidingLeft = false;
	}
	  }
} 

	/**
	 * Wall2.
	 */
	private void wall2()
	{
		for(int i = 0; i < sWallArray.length;i++)
		if(stickMan.getRect().intersects(sWallArray[i].getRect()))
		{
               if(stickMan.getLeft())
				collidingLeft = true;
			else
			    collidingRight = true;
               i=sWallArray.length;}
		else{
			collidingRight = false;
			collidingLeft = false;
			
		}
		
		
	}

	
	/**
	 * Respawn.
	 */
	private void respawn()
	{
	
		if(stickMan.getY() > 3200)
			stickMan.setAlive(false);
		
		if(stickMan.getHealth() < 1)
			stickMan.setAlive(false);
		if(!stickMan.getAlive())
		{
			
			stickMan.setImage("ninjaStandingRight.png");
			stickMan.getImage().setAlpha(0.2f);
			count--;
			if(count < 200)
			stickMan.setY(stickMan.getY()-4);
			//now alive and respawning position
			if(count==0){
		    stickMan.setDeathCount(1);
		    //checkpoint one
		    if(stickMan.getX() < 34590)
		    {
			stickMan.setX(SPAWNX);
			stickMan.setY(SPAWNY);
		    }
		    else
		    {
		      stickMan.setX(34590);
			  stickMan.setY(400);
		    }
		    if(Score > 0)
		    Score -= 2500;
			stickMan.setAlive(true);
			stickMan.setIsFalling(true);
			stickMan.resetHealth();
			count = 300;
			}
		}
	}
	
	/**
	 * Key down.
	 */
	private void keyDown()
	{
	stickMan.setIsFalling(false);
	stickMan.setCrouching(true);
	stickMan.setXVelocity(0);
	if(stickMan.getLeft())
		stickMan.setImage("ninjaCrouchingLeft.png");
	else
	stickMan.setImage("ninjaCrouchingRight.png");
	
	stickMan.setY(stickMan.getY()+77);
	
	}
	
	/**
	 * Key x.
	 */
	private void keyX()
	{
		 if(!stickMan.isJumping() && !stickMan.isFalling())
		   {
			 
			   attackingCount--;
			   stickMan.setAttack(false);
			   stickMan.setImage("ninjaAttacking1 copy.png");
			   if(attackingCount < 60)
			   {
			   stickMan.setImage("ninjaAttack2.png");
			   stickMan.setAttack(true);
			   }
			   if(attackingCount < 30)
			   {
				 stickMan.setImage("ninjaAttacking3.png");
				 if(attackingCount < 1)
				 attackingCount=90;
			   }
			   stickMan.setY(stickMan.getY()-70);
		   }
	}
	
	/**
	 * Key c.
	 */
	private void keyC()
	{
		 if(!stickMan.isJumping() && !stickMan.isFalling())
		   {
			   stickMan.setBlocking(true);
			   stickMan.setImage("ninjaBlock.png");
		   }
	}
	
	/**
	 * Key left.
	 */
	private void keyLeft()
	{
		stickMan.setLeft(true);
		stickMan.setUsingSpeedPower(false);
		
		if(!collidingLeft)
		stickMan.setXVelocity(PLAYERSPEED*-1);
		else
		stickMan.setXVelocity(0);
		
		if(stickMan.isJumping() || stickMan.isFalling())
			stickMan.setImage("ninjaJumpingLeft.png");
		else
		{
	    stickMan.setIsFalling(false);
		stickMan.setImage("ninjaStandingLeft.png");
        }
	}
	
	/**
	 * Key right.
	 */
	private void keyRight()
	{
		stickMan.setLeft(false);
		stickMan.setUsingSpeedPower(false);
		if(!collidingRight)
			stickMan.setXVelocity(PLAYERSPEED);
			else
			stickMan.setXVelocity(0);
		
		if(stickMan.isJumping() || stickMan.isFalling())
			stickMan.setImage("ninjaJumpingRight.png");
		else
		{
			stickMan.setIsFalling(false);
		stickMan.setImage("ninjaStandingRight.png");
		}
	}
	
	/**
	 * Key s.
	 */
	private void keyS()
	{
		  if(!stickMan.isJumping() && !stickMan.isFalling()&&stickMan.getSprintCount() > 0 && stickMan.getSpeedPower())
			{
          	 if(stickMan.getSprintCount() > 0)
   			{
   			sprintCount--;
   			stickMan.setLeft(false);
   			stickMan.setIsFalling(false);
   			stickMan.setUsingSpeedPower(true);
   			
   			if(!collidingRight)
   				stickMan.setXVelocity(SPEED);
   				else
   				stickMan.setXVelocity(0);
   			
   			stickMan.setImage("ninjaSprintingRight.png");
   			stickMan.setY(stickMan.getY()+40);
   			
   			if(sprintCount < 1)
   			{
   		   // stickMan.DecrementSprintCount();
   			stickMan.setIsFalling(false);
   			sprintCount=150;
   			}
   			}
			 }
	}
	
	/**
	 * Key a.
	 */
	private void keyA()
	{
		if(!stickMan.isJumping() && !stickMan.isFalling()&&stickMan.getSprintCount() > 0 && stickMan.getSpeedPower())
		{
		if(stickMan.getSprintCount() > 0)
		{
		sprintCount--;
		stickMan.setLeft(true);
		stickMan.setIsFalling(false);
		stickMan.setUsingSpeedPower(true);
		
		if(!collidingLeft)
			stickMan.setXVelocity(SPEED*-1);
			else
			stickMan.setXVelocity(0);
		
		stickMan.setImage("ninjaSprintingLeft.png");
		stickMan.setY(stickMan.getY()+40);
		
		if(sprintCount < 1)
		{
	    //stickMan.DecrementSprintCount();
		stickMan.setIsFalling(false);
		sprintCount=150;
		}
		}
		 }
		
	}
	
	/**
	 * Key d.
	 */
	private void keyD()
	{
		if(!stickMan.isJumping() && !stickMan.isFalling())
		{
		stickMan.setUsingTeleportPower(true);
		teleportCount--;
		//changes images
		if(teleportCount %3 == 0)
		stickMan.setImage("teleport1.png");
		else
		stickMan.setImage("teleport2.png");	
		stickMan.setY(stickMan.getY()-70);
		stickMan.setXVelocity(0);
		
		
		if(teleportCount < 1)
		{
		stickMan.setIsFalling(true);
		stickMan.setX(stickMan.getX()+300);
		stickMan.setImage("ninjaStandingRight.png");
		teleportCount=1000;}
		}
	}
	
	/**
	 * Key space bar.
	 */
	private void KeySpaceBar()
	{
		if(!stickMan.isJumping() && !stickMan.isFalling()){ //If not currently in the air
			stickMan.setIsJumping(true); //Now the player is jumping
			stickMan.setIsFalling(false); //But not falling
			stickMan.setLastGroundY(stickMan.getY()); //Set the players ground Y 
			stickMan.setImage("ninjaJumpingRight.png");
		}
	}
	
	/**
	 * Jumping.
	 */
	private void jumping()
	{
		if(stickMan.isJumping()){ //If the stickMan is going up
			if(stickMan.getY()>stickMan.getLastGroundY()-stickMan.MAX_JUMP_HEIGHT){ 
				//Haven't reached jump height yet
				stickMan.setYVelocity(-.5f); //Velocity with a force that pushes up
			}else{ //If the jump height has been reached
				stickMan.setIsJumping(false); //Not jumping anymore
				stickMan.setIsFalling(true); //Just falling
			}
		}
	}
	
	/**
	 * Check falling.
	 */
	private void checkFalling()
	{
		if(stickMan.isFalling()&&stickMan.getAlive()){
			stickMan.setYVelocity(.5f); //Set the velocity with push down
			//stickMan.setImage("ninjaJumpingRight.png");

		}
	}
	
	/**
	 * Move enemy all.
	 */
	private void moveEnemyAll()
	{  
		for(int i = 0; i < enemyArray.length-1;i++){
			//walking right
			if(enemyArray[i].getX() < enemyArray[i].getStart()-500)
			{
			if(!enemyArray[i].getPreAttack())
				enemyArray[i].setImage("badGuyRight.png");
				enemyArray[i].setXVelocity(.4f);
				enemyArray[i].setLeft(false);
			 }
			
			//walking left
			if(enemyArray[i].getX() > enemyArray[i].getStart())
			{
			if(!enemyArray[i].getPreAttack())
				enemyArray[i].setImage("badGuyLeft.png");
				enemyArray[i].setXVelocity(-.4f);
				enemyArray[i].setLeft(true);
			 }
			
		}
	}
	
	
	/**
	 * Enemy ai.
	 */
	private void enemyAI()
	{
		for(int i = 0; i < enemyArray.length-1; i ++)
		{
			//enemy will always stop in front on main character
			if(enemyArray[i].getX() -600 < stickMan.getX() && enemyArray[i].getX() -120 > stickMan.getX())
			{
				if(!enemyArray[i].getPreAttack())
				enemyArray[i].setImage("badGuyLeft.png");
				enemyArray[i].setXVelocity(0);
				enemyArray[i].setLeft(false);
				enemyAttack(enemyArray[i]);
				
		     }
			else if(enemyArray[i].getLeft()){
				enemyArray[i].setXVelocity(-.4f);
				enemyArray[i].setImage("badGuyLeft.png");}
			else{
				enemyArray[i].setXVelocity(.4f);
				enemyArray[i].setImage("badGuyRight.png");}
			
		}
		if(enemyArray[5].getX() -4400 < stickMan.getX())
		{
			if(!enemyArray[5].getPreAttack())
			enemyArray[5].setImage("badGuyLeft.png");
			enemyArray[5].setXVelocity(0);
			enemyArray[5].setLeft(false);
			enemyAttack(enemyArray[5]);
			
	     }
		else if(enemyArray[5].getLeft()){
			enemyArray[5].setXVelocity(-.4f);
			enemyArray[5].setImage("badGuyLeft.png");}
		else{
			enemyArray[5].setXVelocity(.4f);
			enemyArray[5].setImage("badGuyRight.png");}
		
	
	}
	
	/**
	 * Enemy attack.
	 *
	 * @param enemy the enemy
	 */
	private void enemyAttack(Enemy enemy)
	{
		Random rand =  new Random();
		//hard at 200
		if(!enemy.getPreAttack())
		{
		enemy.setGenerateAttack(rand.nextInt(500));
		}
		
		if(enemy.getGenerateAttack() == 50){
			attackAnimation(enemy);}
	}
	
	/**
	 * Attack animation.
	 *
	 * @param enemy the enemy
	 */
	private void attackAnimation(Enemy enemy)
	{
		   enemy.setPreAttack(true);
		   enemy.decrementAttackCount();
		   if(enemy.getAttackCount() < 200 && enemy.getAttackCount() > 80)
		   {
		   enemy.setImage("bga1.png");
		   }
		   else if(enemy.getAttackCount() < 80 && enemy.getAttackCount() > 60)
		   {
		   enemy.setAttack(true);
		   enemy.setImage("bga2.png");
		   }
		   else if(enemy.getAttackCount() < 60)
		   {
			 enemy.setImage("bga3.png");
			  if(enemy.getAttackCount() < 1){
			 enemy.setAttackCount(200);
			 enemy.setAttack(false);
			 enemy.setPreAttack(false);
			 enemy.setGenerateAttack(0);
			 if(enemy.getAlive())
			 generateFireBall(enemy);}
		   }
		 }
	
	/**
	 * Generate fire ball.
	 *
	 * @param enemy the enemy
	 */
	private void generateFireBall(Enemy enemy)
	{
		for(int j = 0; j < fireBallArray.length;j++){
			if(!fireBallArray[j].isOnScreen()){
				fireBallArray[j].setIsOnScreen(true);
				fireBallArray[j].setX(enemy.getX());
			    fireBallArray[j].setY(enemy.getY());
			    fireBallArray[j].setStart(enemy.getX());
				j=fireBallArray.length;}
			}
	}
	
	/**
	 * Fire ball distance.
	 */
	private void FireBallDistance()
	{
		for(int j = 0; j < fireBallArray.length;j++)
			if(fireBallArray[j].isOnScreen())
			if(fireBallArray[j].getX() < fireBallArray[j].getStart() - fireBallArray[j].getDistance())
				fireBallArray[j].setIsOnScreen(false);
			
	}
	
	/**
	 * Move boulders.
	 */
	private void moveBoulders()
	{
		for(int i = 0; i < boulderArray.length;i++)
			if(boulderArray[i].getY() > boulderArray[i].getStart()+800)
				boulderArray[i].setY(boulderArray[i].getStart());
			
	}
	
	/**
	 * Move block.
	 */
	private void moveBlock()
	{
		for(int i = 0; i < 12;i++)
		{
			if(blockArray[i].getY() > blockArray[i].getStart()+500){
				blockArray[i].setYVelocity(-.1f);
				blockArray[i].setSmash(false);}
			if(blockArray[i].getY() < blockArray[i].getStart()){
				blockArray[i].setYVelocity(1f);
				blockArray[i].setSmash(true);}
			
		}
			
	}
	
	/**
	 * Move fast block.
	 */
	private void moveFastBlock()
	{
		for(int i = 12; i < 21;i++)
		{
			if(blockArray[i].getY() > blockArray[i].getStart()+500){
				blockArray[i].setYVelocity(-.3f);
				blockArray[i].setSmash(false);}
			if(blockArray[i].getY() < blockArray[i].getStart()){
				blockArray[i].setYVelocity(1f);
				blockArray[i].setSmash(true);}
			
		}
			
	}
	
	private void moveBossBlock()
	{
		for(int i = 21; i < 22;i++)
		{
			if(blockArray[i].getY() > blockArray[i].getStart()+500){
				blockArray[i].setYVelocity(-.1f);
				blockArray[i].setSmash(false);}
			if(blockArray[i].getY() < blockArray[i].getStart()){
				blockArray[i].setYVelocity(.1f);
				blockArray[i].setSmash(true);}
			
		}
			
	}
	
	private void bear()
	{
		
			if(stickMan.getRect().intersects(Bear.getRect()))
			{
				JOptionPane.showMessageDialog(null,"You have found Doctor Chases Bear! \n"
						+"Score: "+Score,"YOU WIN!",
				          JOptionPane.PLAIN_MESSAGE);
				System.exit(0);
			}
				 
		  
	}
	
	/**
	 * Move arrows.
	 */
	private void moveArrows()
	{
		for(int i = 0; i < arrowArray.length;i++){
			
		if(arrowArray[i].getX() < arrowArray[i].getStart()-arrowArray[i].getDistance())
		{
		//	System.out.println("in it");
			arrowArray[i].setX(arrowArray[i].getStart());
		}
		
	}}
	
}
