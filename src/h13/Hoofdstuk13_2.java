package h13;

import java.applet.Applet;
import java.awt.Graphics;

public class Hoofdstuk13_2 extends Applet {
	private static final long serialVersionUID = 1L;
	
	
	int x1 = 300;
	int y1 = 10;
	
	int x2 = 200;
	int y2 = 100;
	
	public void init() {
		setSize(400,400);
	}
	
	public void paint(Graphics g) {
		tekenDriehoek(g, x1, y1, x2, y2);
	}
	
	void tekenDriehoek( Graphics g, int x1, int y1, int x2, int y2){
		
		g.drawLine(x1,  x1,  x2, y1);
		g.drawLine(y2,  x1,  x2, y1);
		g.drawLine(y2,  x1,  x1, x1);
		
	}
	
	
	


		
	
    
	
	
}