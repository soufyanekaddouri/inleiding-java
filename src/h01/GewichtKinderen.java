//DE VOLGENDE OPDRACHTEN ZIJN INBEGREPEN:


package h01;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class GewichtKinderen extends Applet {
	
	/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

	  public void init() {
		  setBackground(Color.white);
	  }
	  
	  public void paint(Graphics a) {
		  //STAAFDIAGRAM 3
		  a.setColor(Color.blue);
		  a.fillRect(60,50 , 15,105);
		  
		  //STAAFDIAGRAM 2
		  a.setColor(Color.red);
		  a.fillRect(90, 70, 15,85);
		 
		  //STAAFDIAGRAM 1
		  a.setColor(Color.black);
		  a.fillRect(120,90 , 15,65);
		  
		  
		   //NAMEN
		   a.setColor(Color.blue);
		   a.drawString("Jeroen", 20, 170);
		   
		   a.setColor(Color.red);
		   a.drawString("Hans", 20, 190);
		   
		   a.setColor(Color.black);
		   a.drawString("Valerie", 20, 210);
		   
		   // DE VERTICALE AS
		   a.drawLine(50,155 , 50,45);
		   
		   // DE HORIZONTALE AS
		   a.drawLine(50,155 , 145,155);
		   
		   //VERDELING STREPEN
		   a.drawLine(50,90 , 160,90); //40
		   a.drawLine(50,70 , 160,70); //60
		   a.drawLine(50,50 , 160,50); //80
		   a.drawLine(50,110 , 160,110); //100
		   
		   //VERDELING CIJFERS
		   a.drawString("40 KG", 10, 115);
		   a.drawString("60 KG", 10, 95);
		   a.drawString("80 KG", 10, 75);
		   a.drawString("100 KG", 5, 55);


		   
		   
	  }
		  
}
