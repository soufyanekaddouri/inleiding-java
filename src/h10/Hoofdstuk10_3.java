package h10;

import java.applet.*;
import java.awt.Button;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Hoofdstuk10_3 extends Applet {
	                                        private static final long serialVersionUID = 1L;

TextField maand;
String naam;
String error;
String error2;
String planeet;
int getal;

Button check;

ButtonListener bl = new ButtonListener();
	                                        
	                                        
	                                        
	   public void init() {
		   setSize(300, 400);
		   
		   maand   = new TextField(20);
		   naam    = "Januari";
		   error   = " ";
		   error2  = " ";
		   planeet = " ";
		   getal   = 31;
		   check   = new Button("Check");
		   
		   check.addActionListener(bl);
		   
		   add(maand);
		   add(check);
		  
	   }
	                                        
	       
	   public void paint(Graphics g) {
		   g.setColor(Color.blue);
		   g.drawString("Het getal wat zojuist is ingevoerd is de maand " + naam, 0, 100);
		   g.drawString("en " + naam + " heeft " + getal + " dagen!", 0, 120);
		   
		   g.setColor(Color.red);
		   g.drawString(error, 0, 140);
		   g.drawString(error2, 0, 155);
		   
		   g.setColor(Color.MAGENTA);
		   g.drawString(planeet, 0, 190);
	   }
	   
	   class ButtonListener implements ActionListener {
		   public void actionPerformed( ActionEvent e) {
			   if (Integer.parseInt(maand.getText()) == Integer.parseInt("1")) {
			    	naam = "Januari";
			    	getal = 31;
			    	repaint();
			    }
			   
			   if (Integer.parseInt(maand.getText()) == Integer.parseInt("2")) {
			    	naam = "Februari";
			    	getal = 28;
			    	repaint();
			    }
			   
			   if (Integer.parseInt(maand.getText()) == Integer.parseInt("3")) {
			    	naam = "Maart";
			    	getal = 31;
			    	repaint();
			    }
			   
			   if (Integer.parseInt(maand.getText()) == Integer.parseInt("4")) {
			    	naam = "April";
			    	getal = 30;
			    	repaint();
			    }
			   
			   if (Integer.parseInt(maand.getText()) == Integer.parseInt("5")) {
			    	naam = "Mei";
			    	getal = 31;
			    	repaint();
			    }
			   
			   if (Integer.parseInt(maand.getText()) == Integer.parseInt("6")) {
			    	naam = "Juni";
			    	getal = 30;
			    	repaint();
			    }
			   
			   if (Integer.parseInt(maand.getText()) == Integer.parseInt("7")) {
			    	naam = "Juli";
			    	getal = 31;
			    	repaint();
			    }
			   
			   if (Integer.parseInt(maand.getText()) == Integer.parseInt("8")) {
			    	naam = "Augustus";
			    	getal = 31;
			    	repaint();
			    }
			   
			   if (Integer.parseInt(maand.getText()) == Integer.parseInt("9")) {
			    	naam = "September";
			    	getal = 30;
			    	repaint();
			    }
			   
			   if (Integer.parseInt(maand.getText()) == Integer.parseInt("10")) {
			    	naam = "Oktober";
			    	getal = 31;
			    	repaint();
			    }
			   
			   if (Integer.parseInt(maand.getText()) == Integer.parseInt("11")) {
			    	naam = "November";
			    	getal = 30;
			    	repaint();
			    }
			   
			   if (Integer.parseInt(maand.getText()) == Integer.parseInt("12")) {
			    	naam = "December";
			    	getal = 31;
			    	repaint();
			    }
			   
			   
			   
			   
		   
	   }
	   }
	   
	   
	   
	   
	   
	   
	   
}
	                                        
	                                        
	                                        
	                                        
	                                        
	                                        