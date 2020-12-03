package finalproject;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Random;

public class BasicEnemy extends GameObject {
	
	Random r = new Random();
	
	public BasicEnemy(int x, int y, ID id, Handler handler) {
		super(x, y, id);
		
		speedX = (5);
		speedY = (5);

}
	public Rectangle getBounds() {
		return new Rectangle(x, y, 16, 16);
	}
	
	// looping the movement of the enemy to bounce off the borders
	public void tick() {

		x += speedX;
		y += speedY;
		
		if(y <= 0 || y >= Game.HEIGHT - 45) speedY *= - 1;
		if(x <= 0 || x >= Game.WIDTH - 70) speedX *= - 1;
		
	}

	public void render(Graphics g) {
		g.setColor(Color.red);		
		g.fillRect(x, y, 16, 16);
	}
	
}
