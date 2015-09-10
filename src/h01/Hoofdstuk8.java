package h01;
import java.applet.Applet;
import java.awt.Button;
import java.awt.Graphics;
import java.awt.TextField;
import java.awt.event.*;




public class Hoofdstuk8 extends Applet { 
private static final long serialVersionUID = 1L;	
	
//DECLARATIE 
Button OKknop = new Button("OK");
Button RESETknop = new Button("RESET");
TextField textveld = new TextField("Voer tekst in om weer te geven",24);


    
String schermtekst = "De tekst verschijnt na het klikken op OK";
KnopListener kl = new KnopListener();
ResetListener rl = new ResetListener();

//INITIALISATIE	
public void init()   {  
	
	//TOEVOEGEN AAN APPLET
	textveld.setBounds(10, 10, 100, 20);
    add(textveld);
    add(OKknop);
    add(RESETknop);
    OKknop.addActionListener( kl );
    RESETknop.addActionListener(rl);
                                       		
}                                               
	                                             
	
	
	public void paint(Graphics g) {   // de paint methode moet altijd eerst want anders geeft de schermtekst niet weer! Moet ik nog ff opzoeken waarom dat is.
	
	g.drawString(schermtekst, 0, 80);                          
	}
	
	
	// CLASS VOOR OK KNOP
	class KnopListener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
             schermtekst = textveld.getText(); 
             
             repaint(); // REPAINT BETEKEND REFRESHEN
        }
 
    }
	
	class ResetListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			schermtekst = "";
			textveld.setText("");
			repaint();
			
		}
		
	}
	
	
	
}