//DE VOLGENDE OPDRACHTEN ZIJN INBEGREPEN:


package h01;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class VariabelenStaafDiagram extends Applet {
	
	/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		// DECLARATIE VAN GEWICHT
		int gewichtJeroenR1;
		int gewichtJeroenR2;
		int gewichtHansR1;
		int gewichtHansR2;
		int gewichtValerieR1;
		int gewichtValerieR2;

	
	  public void init() {
		  setBackground(Color.white);
		  // INITIALISATIE
		  // ZOWEL R1 ALS R2 VERANDEREN MET EVEN GETALLEN OM GEWICHT AAN TE PASSEN
		  gewichtJeroenR1 = 50;
		  gewichtJeroenR2 = 105;
		  gewichtHansR1 = 70;
		  gewichtHansR2 = 85;
		  gewichtValerieR1 = 90;
		  gewichtValerieR2 = 65;
	  }
	  
	  public void paint(Graphics a) {
		  //STAAFDIAGRAM 3
		  a.setColor(Color.blue);
		  a.fillRect(60,gewichtJeroenR1 , 15,gewichtJeroenR2);
		  
		  //STAAFDIAGRAM 2
		  a.setColor(Color.red);
		  a.fillRect(90, gewichtHansR1, 15,gewichtHansR2);
		 
		  //STAAFDIAGRAM 1
		  a.setColor(Color.black);
		  a.fillRect(120,gewichtValerieR1 , 15,gewichtValerieR2);
		  
		  
		  
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
