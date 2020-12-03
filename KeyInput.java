package finalproject;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyInput extends KeyAdapter {

	private Handler handler;
	
	public KeyInput(Handler handler){
		this.handler = handler;
	}
	
	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();
		
		for(int i = 0; i < handler.object.size(); i++) {
			GameObject tempObject = handler.object.get(i);
			
			if(tempObject.getId() == ID.Player) {
				// key event for player 
				
				if(key == KeyEvent.VK_W) tempObject.setspeedY(-5);
				if(key == KeyEvent.VK_S) tempObject.setspeedY(5);
				if(key == KeyEvent.VK_A) tempObject.setspeedx(-5);
				if(key == KeyEvent.VK_D) tempObject.setspeedx(5);
			
				// key event for player to use arrows instead of w,a,s,d
				
				if(key == KeyEvent.VK_UP) tempObject.setspeedY(-5);
				if(key == KeyEvent.VK_DOWN) tempObject.setspeedY(5);
				if(key == KeyEvent.VK_LEFT) tempObject.setspeedx(-5);
				if(key == KeyEvent.VK_RIGHT) tempObject.setspeedx(5);
			}
		}
		
		if(key == KeyEvent.VK_ESCAPE) System.exit(1);
		
	}
	
	public void keyReleased(KeyEvent e) {
		int key = e.getKeyCode();
		
		for(int i = 0; i < handler.object.size(); i++) {
			GameObject tempObject = handler.object.get(i);
			
			if(tempObject.getId() == ID.Player) {
				// key event for player 
				
				if(key == KeyEvent.VK_W) tempObject.setspeedY(0);
				if(key == KeyEvent.VK_S) tempObject.setspeedY(0);
				if(key == KeyEvent.VK_A) tempObject.setspeedx(0);
				if(key == KeyEvent.VK_D) tempObject.setspeedx(0);
	
				// key event for player to use arrows instead of w,a,s,d
				
				if(key == KeyEvent.VK_UP) tempObject.setspeedY(0);
				if(key == KeyEvent.VK_DOWN) tempObject.setspeedY(0);
				if(key == KeyEvent.VK_LEFT) tempObject.setspeedx(0);
				if(key == KeyEvent.VK_RIGHT) tempObject.setspeedx(0);
	}
	
}
	}
}
