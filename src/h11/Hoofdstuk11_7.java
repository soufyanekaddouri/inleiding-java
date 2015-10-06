package h11;

import java.applet.Applet;
import java.awt.Graphics;

public class Hoofdstuk11_7 extends Applet {
private static final long serialVersionUID = 1L;

int width;
int height;

int co1;
int co2;

public void init() {
	setSize(500, 600);
	
	width  = 10;
    height = 10;
    
    co1 = 200;
    co2 = 200;
}



public void paint(Graphics g) {
	
	
	do {
		g.drawOval(co1, co2, width, height);
		

		co1-=5;
		co2-=5;
		width+=  10;
		height+= 10;
		
	} while (height <= 500);
	
}












}