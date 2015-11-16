package h13;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class Hoofdstuk13_Praktijk extends Applet{
	private static final long serialVersionUID = 1L;

	public void init() {
		setSize(400,400);
		
	}
	
	public void paint(Graphics g) {
		tekenBoom(g);
	}
	
	void tekenBoom(Graphics g) {
		g.setColor(Color.black);
		g.fillRect(150, 190, 80, 200);
		g.setColor(Color.green);
		g.fillOval(90, 70, 200, 170);

	}
	
	
}