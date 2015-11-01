package h12;

import java.applet.Applet;
import java.awt.Graphics;

public class Hoofdstuk12_4 extends Applet {
private static final long serialVersionUID = 1L;

boolean gevonden;
double[] salaris = { 100.0, 200.0, 500.0, 400.0, 300.0 }; 
double gezocht;

public void init() {
    gezocht = 400;
    gevonden = false;
    int teller = 0;
    while(teller < salaris.length) {
        if(salaris[teller] == gezocht) {
            gevonden = true;
        }
        teller ++;
        break;
    }
}

public void paint(Graphics g) {
    if(gevonden == true) {
        g.drawString("De waarde is gevonden.", 20, 50);
    }
    else {
        g.drawString("De waarde is niet gevonden.", 20, 50);
    }
}

}