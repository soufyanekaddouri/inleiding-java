package h01;

import java.awt.Graphics;
import java.applet.Applet;
import java.awt.Button;
import java.awt.Color;
import java.awt.event.*;


public class Hoofdstk8OpenAvond extends Applet {
private static final long serialVersionUID = 1L;



//DECLARATIE
Button man         = new Button("mannen");
Button vrouw       = new Button("vrouwen"); 
Button pman        = new Button("Mannelijke studenten");
Button pvrouw      = new Button("Vrouwelijke studenten");

ManListener ml     = new ManListener();
VrouwListener vl   = new VrouwListener();
PManListener pml   = new PManListener();
PVrouwListener pvl = new PVrouwListener();

int mannenCounter           = 0;
int vrouwenCounter          = 0;
int mannenStudentCounter    = 0;
int vrouwenStudentCounter   = 0;
int totaalcounter		    = 0;

	   public void init() {
	   //ActionListeners
	   man.addActionListener(ml);
	   vrouw.addActionListener(vl);
	   pman.addActionListener(pml);
	   pvrouw.addActionListener(pvl);
		   
	   // TOEVOEGINGEN
	   add(man);
	   add(vrouw);
	   add(pman);
	   add(pvrouw);
	   
	   }
	   
	   //MANLISTENER
	    class ManListener implements ActionListener {
	    public void actionPerformed(ActionEvent m) {
	    	mannenCounter++;
	    	totaalcounter++;
	    	repaint();
	    }
	   }
	   
	   //VROUWLISTENER
	   class VrouwListener implements ActionListener {
	   public void actionPerformed(ActionEvent v) {
		   vrouwenCounter++;
		   totaalcounter++;
		   repaint();
	    }
	   }
	   
	   //PMANLISTENER
	   class PManListener implements ActionListener {
	   public void actionPerformed(ActionEvent v) {
		   mannenStudentCounter++;
		   mannenCounter++;
		   totaalcounter++;
		   repaint();
	    }
	   }
	   
	   //PVROUWLISTENER
	   class PVrouwListener implements ActionListener {
	   public void actionPerformed(ActionEvent v) {
		   vrouwenStudentCounter++;
		   vrouwenCounter++;
		   totaalcounter++;
		   repaint();
	    }
	   }
	   
	   
	   
	   // GRAPHICS METHODE  
	   public void paint(Graphics g) {
	   g.drawString("Er zijn "+ mannenCounter + " mannen", 0, 100);
	   g.drawString("Er zijn "+ vrouwenCounter + " vrouwen", 0, 115);
	   g.drawString("Waarvan er "+ mannenStudentCounter + " mannen student zijn", 0, 130);
	   g.drawString("Waarvan er "+ vrouwenStudentCounter + " vrouwen student zijn", 0, 145);
	   
	   g.setColor(Color.green);
	   g.drawString("Er zijn in totaal " + totaalcounter + " mensen aanwezig op de openavond", 0, 165);
	   }
	

	
}


