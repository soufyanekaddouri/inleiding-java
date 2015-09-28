package h10;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Hoofdstuk10_Praktijk extends Applet{
	private static final long serialVersionUID = 1L;
	
	TextField cijfer;
	String waardering;
	String fout;
	
	CijferListener cl = new CijferListener();
	
	
	public void init() {
		setSize(250,100);
		
		cijfer     = new TextField(20);
		cijfer.addActionListener(cl);
		
		waardering = " ";
		fout       = " ";
		
		
		
		
		add(cijfer);
	}
	
	
	public void paint(Graphics g) {
		g.drawString("Het ingevoerde getal is " + waardering, 5, 50);
		g.setColor(Color.red);
		g.drawString(fout, 0, 70);
	}
	
	
	class CijferListener implements ActionListener {
		public void actionPerformed (ActionEvent e) {
			if (Integer.parseInt(cijfer.getText()) == Integer.parseInt("1")) {
				waardering = "slecht";
				fout       = " ";
			}
			
			if (Integer.parseInt(cijfer.getText()) == Integer.parseInt("2")) {
				waardering = "slecht";
				fout       = " ";
			}
			
			if (Integer.parseInt(cijfer.getText()) == Integer.parseInt("3")) {
				waardering = "slecht";
				fout       = " ";
			}
			
			if (Integer.parseInt(cijfer.getText()) == Integer.parseInt("4")) {
				waardering = "een onvoldoende";
				fout       = " ";
			}
			
			if (Integer.parseInt(cijfer.getText()) == Integer.parseInt("5")) {
				waardering = "matig";
				fout       = " ";
			}
			
			if (Integer.parseInt(cijfer.getText()) == Integer.parseInt("6")) {
				waardering = "een voldoende";
				fout       = " ";
			}
			
			if (Integer.parseInt(cijfer.getText()) == Integer.parseInt("7")) {
				waardering = "een voldoende";
				fout       = " ";
			}
			
			if (Integer.parseInt(cijfer.getText()) == Integer.parseInt("8")) {
				waardering = "een goed";
				fout       = " ";
			}
			
			if (Integer.parseInt(cijfer.getText()) == Integer.parseInt("9")) {
				waardering = "een goed";
				fout       = " ";
			}
			
			if (Integer.parseInt(cijfer.getText()) == Integer.parseInt("10")) {
				waardering = "een goed";
				fout       = " ";
			}
			
			if (Integer.parseInt(cijfer.getText()) == Integer.parseInt("0")) {
				waardering = "geen waardering";
				fout       = "U heeft een verkeerd cijfer ingevoerd";
			}
			
			if (Integer.parseInt(cijfer.getText()) > Integer.parseInt("10")) {
				waardering = "geen waardering";
				fout       = "U heeft een verkeerd cijfer ingevoerd";
			}
			
			
			repaint();
		}
	}
	
	
	
	
	
	
	
	

}
