package h01;
import java.awt.*;
import java.applet.Applet;

public class Getallen extends Applet {
	
private static final long serialVersionUID = 1L;

	double perpersoon;

    public void init() {
		perpersoon = 113 / 4;
		
		

	}
	
	public void paint (Graphics g) {
		g.drawString("Soufyane krijgt"+" "+perpersoon+" "+"uitbetaald.", 00, 10);
		g.drawString("Ali krijgt"+" "+perpersoon+" "+"uitbetaald.", 00, 25);
		g.drawString("Jan krijgt"+" "+perpersoon+" "+"uitbetaald.", 00, 40);
		g.drawString("Jeanette krijgt"+" "+perpersoon+" "+"uitbetaald.", 00, 55);
		
	}
	
	
	
	
}

