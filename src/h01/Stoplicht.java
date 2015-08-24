package h01;
import java.awt.Color;
import java.awt.Graphics;
import java.applet.*;



public class Stoplicht extends Applet {
	
	  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;



	public void init() {
		  setBackground(Color.white);
	  }
	  


	public void paint(Graphics s) {
		s.setColor(Color.red);
        s.fillRoundRect(65, 60, 20, 20, 20, 20); 
        
        s.setColor(Color.orange);
		s.fillRoundRect(65, 90, 20, 20, 20, 20);
		
		s.setColor(Color.green);
		s.fillRoundRect(65, 121, 20, 20, 20, 20);
		
		
		s.setColor(Color.black);
		s.drawRect(50, 50, 50, 100);
		
		//STOPLICHT-PAAL
		
		
		s.fillRect(69, 150, 10,70);
		
	
	}
	

		
	}