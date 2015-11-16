package h13;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class Hoofdstuk13_3 extends Applet{
	private static final long serialVersionUID = 1L;
	
	int x1 =  20;
	int y1 =  10;
	
	int x2 =  70;
	int y2 =  70;
	
	int x3 =  20;
	int y3 = 130;
	int e =   70;
	int e2 = 110;
	
	public void init() {
		setSize(1000, 400);
	}
	
	public void paint(Graphics g) {
		baksteen(g);	
	}
	
	
	void baksteen(Graphics g) {
		for (int i = 20; i < 100; i+=10) {
			g.setColor(Color.red);
			g.fillRect(x1, y1, 100, 60);
			g.setColor(Color.black);
			g.drawRect(x1, y1, 100, 60);
			x1 += 100;	
		}

		for (int i = 20; i < 90; i+=10) {
			g.setColor(Color.red);
			g.fillRect(e, y1+60, 100, 60);
			g.setColor(Color.black);
			g.drawRect(e, y1+60, 100, 60);
			e += 100;	
		}
		
		for (int i = 20; i < 100; i+=10) {
			g.setColor(Color.red);
			g.fillRect(e2-90, y1+120, 100, 60);
			g.setColor(Color.black);
			g.drawRect(e2-90, y1+120, 100, 60);
			e2 += 100;	
		}
		
	}
	
}