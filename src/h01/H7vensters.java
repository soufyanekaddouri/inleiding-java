package h01;
import java.awt.*;
import java.applet.Applet;




public class H7vensters extends Applet {
private static final long serialVersionUID = 1L;

	
int groen;
	public void init() {
		setBackground(Color.red);
		setSize(400, 400);
		groen = 100;
	}
	
	public void paint(Graphics g) {
		g.setColor(Color.green);
		g.drawString("Welke", 0, 50);
	}
	
	
	
	
}
