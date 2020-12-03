package finalproject;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Random;

public class Player extends GameObject {

	Random r = new Random();
	Handler handler;
	//moving the game objects

	public Player(int x, int y, ID id, Handler handler) {
		super(x, y, id);
		this.handler = handler;
		
	}
	public Rectangle getBounds() {
		return new Rectangle(x, y, 32, 32);
	}

	public void tick() {
		x += speedX;
		y += speedY;
		
		x = Game.clamp(x, 0, Game.WIDTH - 45);
		y = Game.clamp(y, 0, Game.HEIGHT - 70);
		
		
		collision();
	}
	
	private void collision() {
		for(int i = 0; i < handler.object.size(); i++) {
			
			GameObject tempObject = handler.object.get(i);
			
			if(tempObject.getId() == ID.BasicEnemy) { // tempobject is basic enemy 
				
				if(getBounds().intersects(tempObject.getBounds())) {
					// collision code
					HUD.HEALTH -= 3;
				}
			}
			
		}
	}

	public void render(Graphics g) {
		
		g.setColor(Color.BLUE);
		g.fillRect(x, y, 32, 32);
	}

}
