package h12;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.TextField;

public class Hoofdstuk12_3 extends Applet {
	private static final long serialVersionUID = 1L;
  
	TextField textveld[] = new TextField[5];
    int c = 0;
    int x;
    int y;

	
	public void init() {
		x = 10;
		y = 20;
		int cff = 0;
		
		while (cff < 10) {
			add(textveld[cff]);
		}
	
		
		
	} 
	
	
	public void paint(Graphics g) {
		for (int counter = 0; counter < textveld.length; counter++) {
			g.drawString(""+ textveld[counter], x, y);
			x += 10;
			y += 10;
			
			
			
		}
		
		
	}
	
	
	
}
