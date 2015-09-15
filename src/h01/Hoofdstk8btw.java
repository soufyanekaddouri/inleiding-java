package h01;

import java.awt.Graphics;
import java.awt.TextField;
import java.applet.Applet;
import java.awt.Button;
import java.awt.Color;
import java.awt.event.*;

public class Hoofdstk8btw extends Applet {
private static final long serialVersionUID = 1L;



//DECLARATIE
String tekst       = "Hier verschijnt het bedrag inclusief BTW (19%)";

//KNOP EN TEKSTVAK VARIABELEN
TextField textveld = new TextField(10);
Button knop        = new Button("OK");
Button reset       = new Button("RESET");

//ACTIONLISTENERS
KnopListener kl     = new KnopListener();
ResetListener rl    = new ResetListener();
TextVeldListener tl = new TextVeldListener();


int bedragBTW = 0;


       public void init() {
       setSize(400,200);
       setBackground(Color.BLUE);
       
       knop.addActionListener(kl);
       reset.addActionListener(rl);
    	   
    	   
    	   
    	   
    	         // TOEVOEGING VAN VARIABELEN
    	         add (knop);
    	         add (reset);
    	         add (textveld);
    	         }


       class KnopListener implements ActionListener {
             public void actionPerformed(ActionEvent a) {
       tekst = ( Double.parseDouble(textveld.getText()) * 1.19) + " is het bedrag inclusief BTW "  ;
       repaint();
    }
       }

       class TextVeldListener implements ActionListener {
    	     public void actionPerformed(ActionEvent a)  {
      
       }
    }
       
       class ResetListener implements ActionListener {
    	     public void actionPerformed(ActionEvent a) {
    	    	tekst = (" "); 
    	    	repaint();
    	     }
       }
     
	   
	   
	   
	   // GRAPHICS METHODE  
	   public void paint(Graphics g) {
	   g.setColor(Color.white);
	   g.drawString(tekst, 0, 50);
	   }
	

	
}


