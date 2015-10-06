package h11;

import java.applet.Applet;
import java.awt.Graphics;

public class Hoofdstuk11_1 extends Applet {
	private static final long serialVersionUID = 1L;

	int begin1;
	int begin2;
	int einde1;
	int einde2;
	
	int teller;

	
	public void init() {
		setSize(600,600);
		
		begin1 = 20;
		begin2 = 20;
		
		einde1 = 20;
		einde2 = 400;
		
		teller = 0;
		
}
	

	public void paint(Graphics g) {
        while (teller < 10) { 
        	
        	g.drawLine(begin1, einde1, begin2, einde2);
        	begin1 += 60;
        	begin2 += 60;
        	teller++;
        
        } 	
        

        	
        
	        			
	        			
	        			
	        			
	        			
	        			
	        			
	        	
	        
}
	

		
	
		
		
		
		
		
		
		

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	
	

	
	
	
	
	
	
	
	
	
	
	
	

