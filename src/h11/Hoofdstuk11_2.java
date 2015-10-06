package h11;

import java.applet.Applet;
import java.awt.Graphics;

public class Hoofdstuk11_2 extends Applet {
	private static final long serialVersionUID = 1L;

	int counter;
	int x;
	int y;
	
	public void init() {
		counter = 20;
		x       =  10;
		y       =  10;
	}
	
	
	
	
	
	public void paint(Graphics g) {
		g.drawString(" " + counter, x, y);
		while (counter >= 10) {
			counter++;
			x+= 10;
			y+= 10;
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
                                                                                                                      }