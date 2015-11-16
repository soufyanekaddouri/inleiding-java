package h11;

import java.applet.Applet;
import java.awt.Graphics;

public class Hoofdstuk11_9 extends Applet{

	private static final long serialVersionUID = 1L;
	
	int x = 10;
	int y = 10;
	

	
	
	public void init() {
		setSize(400,400);
		
	}
	
	public void paint(Graphics g) {
		schaak(g);
		
	}
	
	void schaak(Graphics g) {
		
		for (int v = 0; v < 8; v++) {
		g.drawRect(x+v*50, y, 50, 50);
	    g.fillRect(x+v, y, 50, 50);
	    
		}
		
	}
	
	
	
	
	
}
