package h10;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class Hoofdstuk10_2 extends Applet {
                                                  private static final long serialVersionUID = 1L;

//DECLARATIE
TextField Input1;
Button Knop;
String Text  = "0";
String Text2 = "0";

KnopListener kl = new KnopListener();

                                       
public void init() {
	setSize(400,150);
	setBackground(Color.black);
	
	Input1 = new TextField(10);
	Knop   = new Button("OK");
	
	Knop.addActionListener(kl);

	add(Input1);
	add(Knop);
	
}
	

	
	class KnopListener implements ActionListener {
	    public void actionPerformed( ActionEvent e ) {
   	
	    if (Integer.parseInt(Input1.getText()) >= Integer.parseInt(Text)) {
	    	Integer.parseInt(Text = Input1.getText());
	    	
	    }
	    
	    else Integer.parseInt(Text2 = Input1.getText()); {
	    	
	    }
	    repaint();
	    	

	      } 
	    }
	
	public void paint(Graphics g) {
		g.setColor(Color.white);
		g.drawString("Het hoogste getal is:", 0, 100);
		
		g.setColor(Color.white);
		g.drawString("Het laagste getal is:", 0, 120);
		
		g.setColor(Color.magenta);
		g.drawString("=====> ", 140, 100);
		g.drawString("=====>", 140, 120);
		
		g.setColor(Color.blue);
		g.drawString(Text, 200, 100);
		g.drawString(Text2, 200, 120);
		
	}














}