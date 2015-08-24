package h01;
import java.awt.Color;
import java.awt.Graphics;
import java.applet.*;



public class OpdrachtEllips extends Applet {
	
	  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;



	public void init() {
		  setBackground(Color.blue);
	  }
	  


	public void paint(Graphics g) {
	g.setColor(Color.black);
	g.drawOval(20, 20, 300, 150);
	g.setColor(Color.yellow);
	g.fillArc(20, 20, 300, 150, 200, 200);
	
	
	}
	

		
	}