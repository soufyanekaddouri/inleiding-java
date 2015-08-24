package h01;
import java.awt.Color;
import java.awt.Graphics;
import java.applet.*;



public class PraktijkOpdracht extends Applet {
	
	  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;



	public void init() {
		  setBackground(Color.white);
	  }
	  


	public void paint(Graphics s) {
	// LIJN
		s.drawLine(0, 50, 100, 50);
		
	//RECHTHOEK
		s.drawRect(0, 70, 100, 50);
		
	//AFGERONDE RECHTHOEK
		s.drawRoundRect(0, 130, 100, 50, 10, 10);
		s.setColor(Color.magenta);
		s.fillOval(120, 130, 120, 50);
		
	
	}
	

		
	}