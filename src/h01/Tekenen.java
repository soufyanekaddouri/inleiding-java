//DE VOLGENDE OPDRACHTEN ZIJN INBEGREPEN:
// 4.1, 4.2 EN 4.3


package h01;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class Tekenen extends Applet {

	  /**
		 * 
		 */
		private static final long serialVersionUID = 1L;

	  public void init() {
		  setBackground(Color.white);
	  }
	  
	  public void paint(Graphics lijn) {
		  
		  lijn.drawLine(100,  50, 50, 100);
		  lijn.drawLine(100,  50, 150, 100);
		  lijn.drawLine(50,  100, 150, 100);
		  // VIERKANT
		  lijn.drawRect(50, 150, 25, 50);
		  
		  
		  //RAAM
		  lijn.drawRect(100, 137, 30, 30);
		  //DEUR
		  lijn.drawRect(50, 100, 100, 100);
		  //SCHOORSTEEN
		  lijn.drawRect(50, 65, 15, 35);
		  
		  //VLAGGENSTOK
		  lijn.drawLine(50, 100, 50, 45);
		  
		  //VLAG
		  lijn.setColor(Color.red);
		  lijn.fillRect(50, 10, 70, 12);
		  
		  lijn.setColor(Color.white);
		  lijn.fillRect(50, 20, 70, 12);
		  
		  lijn.setColor(Color.blue);
		  lijn.fillRect(50, 35, 70, 12);
		  
		  //KLEUREN
		    
	  }
		  
}
