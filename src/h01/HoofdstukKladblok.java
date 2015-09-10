package h01;
import java.applet.Applet;
import java.awt.Button;
import java.awt.Graphics;
import java.awt.TextField;
import java.awt.event.*;


import java.awt.Label;


public class HoofdstukKladblok extends Applet { 
private static final long serialVersionUID = 1L;	
	
//DECLARATIE 
Button knop = new Button("Naar URL!");
TextField textveld = new TextField("http://",24);
Label tekst = new Label("(Pop-up)");      
String schermtekst = "Ja, deze knop doet wel iets";


//INITIALISATIE	
public void init()   {  
	
	//TOEVOEGEN AAN APPLET
    add(textveld);
    add(knop);
    add(tekst);
    KnopListener kl = new KnopListener();
    knop.addActionListener( kl );
                                       		
}                                               
	                                             
	
	
	public void paint(Graphics g) {
	
	g.drawString(schermtekst, 0, 80);
	
	
	
	
	}
	
	class KnopListener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
             
        }
    }
	
		
}