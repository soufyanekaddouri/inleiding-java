package h14;

import java.applet.Applet;
import java.awt.Graphics;

public class Hoofdstuk14_1 extends Applet{
	private static final long serialVersionUID = 1L;

	String[] kleuren = {"Harten", "Ruiten", "Schoppen", "Klaver"};
	String[] kaarten = {"twee", "drie", "vier", "vijf", "zes", "zeven", "acht", "negen", "tien", "boer", "vrouw", "heer", "aas"};
	
	Double kleur;
	Double kaart;
	
	public void init() {
		setSize(200,200);
		
		kleur = Math.random();
	}
	
	public void paint(Graphics g) {
		g.drawString("" + kleur * 6, 50, 50);
	}
	
	
	
}