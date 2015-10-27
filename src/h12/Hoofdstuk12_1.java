package h12;

import java.applet.Applet;
import java.awt.Graphics;

public class Hoofdstuk12_1 extends Applet {
	private static final long serialVersionUID = 1L;
	int getallen[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	int x = 10;
	int y = 20;
	
	public void init() {
		setSize(400, 400);
		
		
	}
	
	
	
	public void paint(Graphics g) {
		int gem = 0;
		
		for (int c = 0; c < getallen.length; c++) {
			g.drawString(""+getallen[c], x, y);
			x += 10;
			y += 10;
			gem += getallen[c];	
		}
		gem /= getallen.length;
		g.drawString("" + gem, x+10, y+10);
		
		
		
	}
	

   
	
	
	
	
	
	
	

	
}