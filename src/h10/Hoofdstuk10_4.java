package h10;

import java.applet.*;
import java.awt.Button;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Hoofdstuk10_4 extends Applet {
	                                        private static final long serialVersionUID = 1L;
TextField jaar;
TextField maand;
String naam;
String error;
String error2;
String planeet;
String jaartal;
String welniet;


int getal;

Button check;
Button check2;

ButtonListener bl = new ButtonListener();
ButtonListener2 bl2 = new ButtonListener2();
	                                        
	                                        
	                                        
	   public void init() {
		   setSize(250, 300);
		   
		   maand   = new TextField(20);
		   jaar    = new TextField(20);
		   naam    = "Januari";
		   error   = " ";
		   error2  = " ";
		   planeet = " ";
		   jaartal = "2015";
		   getal   = 31;
		   check   = new Button("Check maand");
		   check2  = new Button("Check jaartal");
		   welniet = " ";
		   
		   check.addActionListener(bl);
		   check2.addActionListener(bl2);

		   add(maand);
		   add(jaar); 
		   add(check);
		   add(check2);
	   }
	                                        
	       
	   public void paint(Graphics g) {
		   g.setColor(Color.blue);
		   g.drawString("Het getal wat zojuist is ingevoerd", 0, 100);
		   g.drawString("is de maand " + naam, 0, 120);
		   g.drawString("en " + naam + " heeft " + getal + " dagen!", 0, 140);
		   
		   g.setColor(Color.GREEN);
		   g.drawString("Het jaar " + jaar.getText()+ welniet, 0, 170);
		   
		   g.setColor(Color.red);
		   g.drawString("Jaartal invoeren van 2015 tot 2020", 0, 200);
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
	   
	   class ButtonListener2 implements ActionListener {
		   public void actionPerformed( ActionEvent e) {
			   
			   if ( (Integer.parseInt(jaar.getText()) % 4 == 0 && !(Integer.parseInt(jaar.getText()) % 100 == 0)) ||
					   Integer.parseInt(jaar.getText()) % 400 == 0 ) {
				   welniet = " is een schrikkeljaar";  
			   }
			   else {
				   welniet = " is geen schrikkeljaar";
			   }
			   
			   repaint();
		   }
	   }
	   
	   
	   
	   
	   
	   
}
	                                        
	                                        
	                                        
	                                        
	                                        
	                                        