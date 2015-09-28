package h10;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Graphics;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Hoofdstuk10_5 extends Applet {
	private static final long serialVersionUID = 1L;

	TextField cijfer;
	
	Button ok;
	Button reset;
	
	String waardering;
	String gemiddelde;
	
	OkListener ol    = new OkListener();
	ResetListener rl = new ResetListener();
	
	
	
	public void init() {
		cijfer       = new TextField(20);
		ok           = new Button("OK");
		reset        = new Button("Nieuwe Berekening");
		
		ok.addActionListener(ol);
		reset.addActionListener(rl);
		
		waardering = " ";
		gemiddelde = " ";
		add(cijfer);
		add(ok);
		add(reset);
	}
	
	public void paint(Graphics g) {
		g.drawString("Het cijfer is een " + waardering, 0, 100);
		g.drawString("Op dit moment is je gemiddelde een " + gemiddelde, 0, 120);
	}
	
	
	class OkListener implements ActionListener {
		public void actionPerformed (ActionEvent e) {
			if (Double.parseDouble(cijfer.getText()) < Double.parseDouble("5.5")) {
				waardering = "onvoldoende";
			}
			else {
				waardering = "voldoende";
			}
			
	repaint();		
    }
	}
	
	class ResetListener implements ActionListener {
		public void actionPerformed (ActionEvent e) {
			
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
