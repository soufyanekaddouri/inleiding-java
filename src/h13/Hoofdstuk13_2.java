package h13;

import java.applet.Applet;
import java.awt.Graphics;

public class Hoofdstuk13_2 extends Applet {
	private static final long serialVersionUID = 1L;
	//DECLARATIES
	int x1 = 20;
	int y1 = 20;
	
	int x2 = 30;
	int y2 = 30;
	
	int x3 = 40;
	int y3 = 40;
	
	public void init() {
		
	}
	
	

	public void paint(Graphics g) {
		
	}
		
	void tekenDriehoek( Graphics g, int x1, int y1, int x2, int y2, int x3, int y3) {
		g.drawArc(x1, y1, x2, y2, x3, y3);

	}
		
	
    
	
	
}