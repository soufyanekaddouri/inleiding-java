package h12;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Graphics;

public class Hoofdstuk12_2 extends Applet {
	private static final long serialVersionUID = 1L;
  
	Button knoppen[] = new Button[25];

    

    

	public void init() {
		

		for (int i = 0; i < knoppen.length; i++) {
			knoppen[i] = new Button("" + i);
            add(knoppen[i]);
		}
		
	} 
	
	
	public void paint(Graphics g) {
		
	}
	
	
	
}
