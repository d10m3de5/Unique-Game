package finalproject;

import java.awt.Color;
import java.awt.Graphics;

/**
 * @author Andrew
 *
 */
public class HUD {
	
	public static int HEALTH = 100;
	
	private int greenValue = 255;
	
	public void tick(){
		HEALTH =Game.clamp(HEALTH, 0, 100);
		greenValue = Game.clamp(greenValue, 0, 255);
		
		greenValue = HEALTH*2;
	}

	public void render(Graphics g) {
		g.setColor(Color.black);
		g.fillRect(15, 15, 200, 32);
		g.setColor(new Color(75, greenValue,0));
		g.fillRect(15, 15, HEALTH * 2, 32);
		g.setColor(Color.WHITE);
		g.drawRect(15, 15, 200, 32);
		g.drawString(HEALTH+"%", 15, 15);
	}
}
