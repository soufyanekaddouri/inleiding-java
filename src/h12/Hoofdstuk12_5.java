package h12;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Graphics;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Hoofdstuk12_5 extends Applet {
	private static final long serialVersionUID = 1L;
	
	TextField textveld = new TextField(20);
	Button    knop     = new  Button("OK");
	KnopListener kl    = new KnopListener();
	int tabel[] = {1,2,3,4,5,6,7,8,9,10};
	boolean gevonden   = true;
	int z = 50;
	int vv = 50;
	
	int x = 50;
	int y = 50;
	int i = 0;
	String gelukt;
	String index;

	
	public void init() {
		setSize(300,400);
		knop.addActionListener(kl);
		
		add(textveld);
		add(knop);
		
		
	}
	
	
	public void paint(Graphics g) {
		g.drawString("De ingevoerde waarde: " + Integer.parseInt(textveld.getText()), x, y);
		g.drawString(gelukt, x, y+20);
		g.drawString("De index is:", x, y+40);
		g.drawString("" + tabel[i], z, vv+60);
		g.drawString(""+tabel[1], x, y+80);
		g.drawString(""+tabel[2], x, y+100);
		g.drawString(""+tabel[3], x, y+120);
		g.drawString(""+tabel[4], x, y+140);
		g.drawString(""+tabel[5], x, y+160);
		g.drawString(""+tabel[6], x, y+180);
		g.drawString(""+tabel[7], x, y+200);
		g.drawString(""+tabel[8], x, y+220);
		g.drawString(""+tabel[9], x, y+240);
		
		
	
	
	}
	
	class KnopListener implements ActionListener{
		public void actionPerformed (ActionEvent e) {
			
			while (Integer.parseInt(textveld.getText()) <= 10) {
			    gelukt = "De waarde is gevonden";
			    index = "De index = " + tabel[0];
                break;
			}
			
			while (Integer.parseInt(textveld.getText()) > 10) {
				gelukt = "De waarde is niet gevonden";
	            break;
				}
			repaint();
		}
	}
	
	
	
	
}






