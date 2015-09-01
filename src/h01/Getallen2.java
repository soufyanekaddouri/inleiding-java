package h01;
import java.awt.*;
import java.applet.Applet;

public class Getallen2 extends Applet {
	
private static final long serialVersionUID = 1L;

	int eenuur = 60 * 60;
	int eendag = 24 * eenuur;
	int eenjaar = eendag * 365;

    public void init() {
		
		
		

	}
	
	public void paint (Graphics g) {
	g.drawString("In een uur zitten er"+" "+eenuur+" "+"seconden!", 0, 10);
	g.drawString("In een dag zitten er"+" "+eendag+" "+"seconden!", 0, 25);
	g.drawString("In een jaar zitten er"+" "+eenjaar+" "+"seconden!", 0, 40);
		
	}
	
	
	
	
}

