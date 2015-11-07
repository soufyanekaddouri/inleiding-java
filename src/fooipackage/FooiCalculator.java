package fooipackage;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FooiCalculator extends Applet {
	private static final long serialVersionUID = 1L;
	
	TextField bedragInvoer = new TextField(20);
	
	double bedragCijfer;
    double procentCijfer;
    double bedragKortingCijfer;
    double totaalCijfer;
    
    VeldListener vl = new VeldListener();

	
	public void init() {
		
		bedragCijfer        = 0;		
	    procentCijfer       = 0;
	    bedragKortingCijfer = 0;
	    totaalCijfer        = 0;
	    
	    bedragInvoer.addActionListener(vl);
	    
	    //ADD
	    add(bedragInvoer);
		
	    
		
	}
	
	
	public void paint(Graphics g) {
		g.drawString(""+ bedragCijfer, 20, 50);
		
	}
	
	
	
	
	class VeldListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			bedragCijfer        = Double.parseDouble(bedragInvoer.getText().toString());
			repaint();
		}
	}
	
	
	
	
}
