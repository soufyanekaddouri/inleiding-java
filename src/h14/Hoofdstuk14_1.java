package h14;

import java.applet.Applet;
import java.awt.Graphics;
import java.util.Random;

public class Hoofdstuk14_1 extends Applet{
	private static final long serialVersionUID = 1L;

	String[] kleuren = {"Harten", "Ruiten", "Schoppen", "Klaver"};
	String[] kaarten = {"twee", "drie", "vier", "vijf", "zes", "zeven", "acht", "negen", "tien", "Boer", "Vrouw", "Heer", "Aas"};
	String text = "";
	
	public void init() {
		setSize(250, 200);
		int  random  = new Random().nextInt(kleuren.length);
		int  random2 = new Random().nextInt(kaarten.length);
		text = "U heeft de kleur " + kleuren[random]+" en "+kaarten[random2];
	}
	
	public void paint(Graphics g) {
		g.drawString(text, 20, 50);
		
	}
	

}
