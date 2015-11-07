package h13;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Hoofdstuk13_1 extends Applet {
	private static final long serialVersionUID = 1L;
	
	Button blauweknop = new Button("BLAUW");
	BlauwListener bl = new BlauwListener();
	
	Button groeneknop = new Button("GROEN");
	GroenListener gl = new GroenListener();
	
	Button paarseknop = new Button("PAARS");
	PaarsListener pl = new PaarsListener();
	
	Button oranjeknop = new Button("ORANJE");
	OranjeListener ol = new OranjeListener();
	
	Button rozeknop   = new Button("ROZE");
	RozeListener rl = new RozeListener();
	
	String kleur = "nog geen kleur";
	
	Color test = Color.BLACK;
	public void init() {
		
		blauweknop.addActionListener(bl);
		groeneknop.addActionListener(gl);
		paarseknop.addActionListener(pl);
		oranjeknop.addActionListener(ol);
		rozeknop.addActionListener(rl);
		
		add(blauweknop);
		add(groeneknop);
		add(paarseknop);
		add(oranjeknop);
		add(rozeknop);
		
		
		blauweknop.setBackground(Color.BLUE);
		blauweknop.setForeground(Color.WHITE);
		
		groeneknop.setBackground(Color.GREEN);
		groeneknop.setForeground(Color.WHITE);
		
		paarseknop.setBackground(Color.MAGENTA);
		paarseknop.setForeground(Color.WHITE);
		
		oranjeknop.setBackground(Color.ORANGE);
		oranjeknop.setForeground(Color.WHITE);
		
		rozeknop.setBackground(Color.PINK);
		rozeknop.setForeground(Color.WHITE);
		
		setBackground(Color.BLACK);
	}
	
	public void paint(Graphics g) {
		g.setColor(Color.RED);
		g.drawString("De kleur die u heeft geselecteerd:" , 5, 80);
		g.setColor(test);
		g.drawString("" + kleur, 5, 100);
	}

	
	class BlauwListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			kleur = "BLAUW";
			test = Color.BLUE;
			repaint();
		}
	}
	
	class GroenListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			kleur = "GROEN";
			test = Color.GREEN;
			repaint();
		}
	}
	
	class PaarsListener implements ActionListener  {
		public void actionPerformed(ActionEvent e) {
			kleur = "PAARS";
			test = Color.MAGENTA;
			repaint();
		}
	}
	
	class OranjeListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			kleur = "ORANJE";
			test = Color.ORANGE;
			repaint();
		}
	}
	
	class RozeListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			kleur = "ROZE";
			test = Color.PINK;
			repaint();
		}
	}
	
	
	
	
}