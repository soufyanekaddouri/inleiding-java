package h01;
import java.applet.Applet;
import java.awt.*;

public class Variabelen extends Applet{
	private static final long serialVersionUID = 1L;
	
    Color paars;
    Color zwart;
    int breedte;
    int hoogte;

    public void init() {
        
        paars = Color.MAGENTA;
        zwart = Color.BLACK;
        breedte = 200;
        hoogte = 100;
    }

    public void paint(Graphics g) {
        
        g.drawRect(100, 100, breedte, hoogte);
        
        g.drawRoundRect(100, 225, breedte, hoogte, 30, 30);
        
        g.setColor(zwart);
        g.drawOval(315, 100, breedte, hoogte);
        
        g.setColor(paars);
        g.fillOval(315, 225, breedte, hoogte);
        
        g.setColor(paars);
        g.fillRect(315, 100, breedte, hoogte);
       
        
       
    }
}
	
	
	
	
	
	
	

