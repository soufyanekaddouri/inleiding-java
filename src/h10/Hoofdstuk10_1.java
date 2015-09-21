package h10;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class Hoofdstuk10_1 extends Applet {
                                                  private static final long serialVersionUID = 1L;

//DECLARATIE
TextField Input1;
Button Knop;
String Text = "0";

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
//======START OF IF STATEMENT======\\	    	
	    if (Integer.parseInt(Input1.getText()) >= Integer.parseInt(Text)) {
	    	Integer.parseInt(Text = Input1.getText());
	    }
	    
	    repaint();
	    	
//======END OF IF STATEMENT=========\\
	    } 
	    }
	
	public void paint(Graphics g) {
		g.setColor(Color.white);
		g.drawString("Het hoogste getal is:", 0, 100);
		
		g.setColor(Color.magenta);
		g.drawString("=====> ", 140, 100);
		
		g.setColor(Color.blue);
		g.drawString(Text, 200, 100);
		
	}














}