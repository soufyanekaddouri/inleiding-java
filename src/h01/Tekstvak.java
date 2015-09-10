package h01;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Tekstvak extends Applet {
	private static final long serialVersionUID = 1L;
	TextField tekstvak;
    Label label;	
 
    String s;
	
    public void init() {
        tekstvak = new TextField("Klik op mij", 20);
        label = new Label("Type iets in het tekstvak ");
        label = new Label("En druk op Enter ");
        tekstvak.addActionListener( new TekstvakListener() );
        add(label);
        add(tekstvak);
       
        s = "";
    }

    public void paint(Graphics g) {
        g.drawString(s, 50, 60 );
    }
	
    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            repaint();
        }
    }
}

// DIT IS VOORBEELD 8.5 GEKOPIEERD EN GEPLAKT OM UIT TE ZOEKEN WELKE CODE WAT DOET