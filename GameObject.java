package finalproject;

import java.awt.Graphics;
import java.awt.Rectangle;

public abstract class GameObject {

	protected int x, y;
	protected ID id;
	protected int speedX, speedY;
	
	public GameObject(int x, int y, ID id ) {
		this.x = x;
		this.y = x;
		this.id = id;
	}
	
	public abstract void tick();
	public abstract void render(Graphics g);
	public abstract Rectangle getBounds();
	
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public void setId(ID id) {
		this.id = id;
	}
	public ID getId() {
		return id;
	}
	public void setspeedx(int speedX) {
		this.speedX = speedX;
	}
	public void setspeedY(int speedY) {
		this.speedY = speedY;
	}
	public int getspeedX() {
		return speedX;
	}
	public int getspeedY() {
		return speedY;
	}

}
