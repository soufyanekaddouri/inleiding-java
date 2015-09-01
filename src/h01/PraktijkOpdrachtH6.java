package h01;
import java.awt.*;
import java.applet.Applet;

public class PraktijkOpdrachtH6 extends Applet {
	
private static final long serialVersionUID = 1L;
double som = (5.9 + 6.3 + 6.9) / 3;
int teller;
int somheel = (int) som * 10;
double somfinish = (int) somheel;
double somfinish2 = somheel / 10;

	

    public void init() {
    	teller = 0;
		
		

	}
	
	public void paint (Graphics g) {
		teller ++;
g.drawString("Het gemiddelde bedraagd "+ somfinish2 + " ", 0, 10);
g.drawString("Scherm is " + teller +" keer ververst.", 50, 60 );
// VOORBEELD


	}
	
	
	
	
}

