package h01;
import java.applet.Applet;
import java.awt.Button;
import java.awt.Color;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Hoofdstk8PRAKTIJK extends Applet {
private static final long serialVersionUID = 1L;

//DECLARATIE
             Button vermenigvuldigen;
             Button delen;
             Button min;
             Button plus;
             
             TextField eersteInput;
             TextField tweedeInput;
             
             Vlistener vl = new Vlistener();
             Dlistener dl = new Dlistener();
             Mlistener ml = new Mlistener();
             Plistener pl = new Plistener();
             
             
             double uitkomst;

            public void init() {
            	setBackground(Color.gray);
            	vermenigvuldigen = new Button("x");
            	delen            = new Button("/");
            	min              = new Button("-");
            	plus             = new Button("+");
            	
            	eersteInput = new TextField(15);
            	tweedeInput = new TextField(15);
            	uitkomst    = 0;
            	
            	vermenigvuldigen.addActionListener(vl);
            	delen.addActionListener(dl);
            	min.addActionListener(ml);
            	plus.addActionListener(pl);
            	
            	add(plus);
            	add(min);
            	add(vermenigvuldigen);
            	add(delen);
            	add(eersteInput);
            	add(tweedeInput);
            }



    

class Vlistener implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		double eersteNummer = Double.parseDouble(eersteInput.getText());
		double tweedeNummer = Double.parseDouble(tweedeInput.getText());
		double uitkomst = 0;
		
		uitkomst = eersteNummer * tweedeNummer;
		
		eersteInput.setText("" + uitkomst);
		repaint();
		}
}

class Dlistener implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		eersteInput.setText("" + (Double.parseDouble(eersteInput.getText()) / Double.parseDouble(tweedeInput.getText())));
	}
}

class Mlistener implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		eersteInput.setText("" + (Double.parseDouble(eersteInput.getText()) - Double.parseDouble(tweedeInput.getText())));
	}
	
}

class Plistener implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		
		eersteInput.setText("" + (Double.parseDouble(eersteInput.getText()) + Double.parseDouble(tweedeInput.getText())));
	}
}







}