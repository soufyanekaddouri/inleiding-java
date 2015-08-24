package h01;

//Dit is een java applet van hoofdstuk 2, opdracht 2.2
//Link van de opdracht: http://ao.roc-dev.com/AO/InlJava/H2/H2.jsp


import java.awt.*;
import java.applet.*;

public class JavaKlassee extends Applet {

/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public void init() {
	  setBackground(Color.white);
}
public void paint(Graphics kleur) {
	  kleur.setColor(Color.blue);
 kleur.drawString("Soufyane", 50, 60 );
 
 kleur.setColor(Color.red);
 kleur.drawString("Kaddouri", 60, 70 );
 
 //Dit was opdracht 2.2
 
 
 
 }

}

