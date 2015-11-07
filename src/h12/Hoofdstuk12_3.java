package h12;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Graphics;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Hoofdstuk12_3 extends Applet {
	private static final long serialVersionUID = 1L;
  
	TextField woordjes[] = new TextField[5];
	Button ok = new Button("OK");
    int c =  0;
    int x = 50;
    int y = 60;
    
    int getal1;
    int getal2;
    int getal3;
    int getal4;
    int getal5;
    
    
  
	KnopListener kl = new KnopListener();
    
	public void init() {
		setSize(400, 300);
		
		ok.addActionListener(kl);
 
		for (int i = 0; i < 5; i++) {
			woordjes[i] = new TextField(20);
			add(woordjes[i]);
			add(ok);
			
			
		}
		
		
		
		//HIER HOORT NOG IETS TE STAAN, MAAR WAT HOORT ER TE STAAN?
		//IK WIL DAT DE VOLGORDE WORD BEBAALD MET WELKE VOLGORDE ER IETS
		//WORD INGEVOERD.
		
	} 
	
	
	public void paint(Graphics g) {
		g.drawString("Dit zijn de getallen die u heeft ingevoerd:", 10, 100);
		g.drawString("" + getal1 , 100, 120);
		g.drawString("" + getal2 , 100, 135);
		g.drawString("" + getal3 , 100, 150);
		g.drawString("" + getal4 , 100, 165);
		g.drawString("" + getal5 , 100, 180);
		
		
		
	}
	
	
	   class KnopListener implements ActionListener {
	   public void actionPerformed (ActionEvent e) {
		   getal1 = Integer.parseInt(woordjes[0].getText());
		   getal2 = Integer.parseInt(woordjes[1].getText());
		   getal3 = Integer.parseInt(woordjes[2].getText());
		   getal4 = Integer.parseInt(woordjes[3].getText());
		   getal5 = Integer.parseInt(woordjes[4].getText());
		   
	       repaint();
	     }
	   }
	
	
	
}
