package h14;

import java.applet.Applet;
import java.awt.Graphics;
import java.util.Random;

public class Hoofdstuk14_2 extends Applet{
	private static final long serialVersionUID = 1L;

	String[] kleuren = {"Harten", "Ruiten", "Schoppen", "Klaver"};
	String[] kaarten = {"twee", "drie", "vier", "vijf", "zes", "zeven", "acht", "negen", "tien", "boer", "vrouw", "heer", "aas"};
	
	String[] deck    = new String[52];
	
	String[] speler1 = new String[13];
	String[] speler2 = new String[13];
	String[] speler3 = new String[13];
	String[] speler4 = new String[13];
	
	String randomkaart;
	
	int y;
	
	public void init() {
		setSize(800, 500);
		int random = new Random().nextInt(kleuren.length);
		int random2 = new Random().nextInt(kaarten.length);
		
		randomkaart = "" + kleuren[random] + " " + kaarten[random2];
		
		y = 60;
		
		//DECK VULLEN MET KAARTEN
	}
	
	public void paint(Graphics g) {
		g.drawString("Speler 1", 100, 20);
		g.drawString(""+randomkaart, 100, y);
		
		g.drawString("Speler 2", 300, 20);
		g.drawString("Speler 3", 500, 20);
		g.drawString("Speler 4", 700, 20);
		
		while (y < 260) {
			y++;
		}
	}
	
	
	
	
	
}