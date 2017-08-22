
import java.awt.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

import org.newdawn.slick.geom.Rectangle;

// TODO: Auto-generated Javadoc
/**
 * The Class GameObject1.
 */
public class GameObject1 {
	
	/** The x. */
	protected float x=0;//The x of the game object
	
	/** The y. */
	protected float y=0; //The y of the game object
	
	/** The x velocity. */
	private float xVelocity=0; // The xVelocity of the gameobject
	
	/** The y velocity. */
	private float yVelocity=0; //The yVelocity of the gameobject
	
	/** The scale. */
	private float scale=1.0f; // The scale of the game object
	
	/** The width. */
	private float width=0; 			//Width of object 		
	
	/** The height. */
	private float height=0;			//Height of object 		
	
	/** The obj image. */
	private Image objImage; //The image of the object
	
	
	/**
	 * Gets the x.
	 *
	 * @return the x
	 */
	public float getX(){
		  return x;
		}
		
		/**
		 * Gets the y value of the object.
		 *
		 * @return the y
		 */
		public float getY(){
			return y;
		}
		
		/**
		 * Gets the x velocity.
		 *
		 * @return the x velocity
		 */
		public float getXVelocity(){
			return xVelocity;
		}
		
		/**
		 * Gets the y velocity.
		 *
		 * @return the y velocity
		 */
		public float getYVelocity(){
			return yVelocity;
		}

		/**
		 * Gets the width of the game object .
		 *
		 * @return the width of the object
		 */
		public float getWidth(){
			if(objImage!=null){
				return objImage.getWidth();
			}
			else{
				return 0;
			}
		}
		
		/**
		 * Gets the height of the object.
		 *
		 * @return the height
		 */
		public float getHeight(){
			if(objImage!=null){
				return objImage.getHeight();
			}
			else{
				return 0;
			}
		}
		
		/**
		 * Sets the height.
		 *
		 * @param newSize the new height
		 */
		public void setHeight(float newSize)
		{
			height = newSize;
		}
		
		/**
		 * Sets the width.
		 *
		 * @param newSize the new width
		 */
		public void setWidth(float newSize)
		{
			width = newSize;
		}
		
		/**
		 * gets the image.
		 *
		 * @return image
		 */
		public Image getImage(){
			return objImage;
		}
		
		/**
		 * Sets the x of the object.
		 *
		 * @param x the x of the object
		 */
		public void setX(float x){
			this.x=x;
		}
		
		/**
		 * Sets the y of the object.
		 *
		 * @param y the y of the object
		 */
		public void setY(float y){
			this.y=y;
		}
		
		/**
		 * Sets the xvelocity of the object.
		 *
		 * @param xVelocity the xvelocity of the object
		 */
		public void setXVelocity(float xVelocity){
			this.xVelocity=xVelocity;
		}
		
		/**
		 * Sets the y velocity of the gameobject.
		 *
		 * @param yVelocity the yvelocity of the
		 */
		public void setYVelocity(float yVelocity){
			this.yVelocity=yVelocity;
		}
		
		
		/**
		 * Sets the image of the game object.
		 *
		 * @param filename the filename of the image
		 */
		public void setImage(String filename){
			try{
				objImage= new Image("res/" + filename);
				
			}
			catch(SlickException e){
				System.err.print("error" + e);
			}
			
		}
		
		
		
		/**
		 * gets the rectangle of the object.
		 *
		 * @return rectangle of the bounds
		 */
		public Rectangle getRect(){
			 return new Rectangle(getX(),getY(),getWidth(),getHeight());
		}
		
		
		
		
		/**
		 * Gets the scale of the object.
		 *
		 * @return the scale
		 */
		public float getScale() {
			return scale;
		}
		
		/**
		 * Sets the scale of the object.
		 *
		 * @param scale the scale of the object
		 */
		public void setScale(float scale) {
			this.scale = scale;
		}
		
	

}
