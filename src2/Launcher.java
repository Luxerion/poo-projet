import java.awt.*;

/**
 *Lanceur de du programme, crée un rond en trajectoire ......................
 *@author Sébastien RIGOT
 *@author Cyril Hamon
 */

public class Launcher{
    public static void main(String[] args){
	Ellipse e = new Ellipse(Color.RED, 0, 0, 10, 10);
	Panneau pan = new Panneau(e);
	Fenetre f = new Fenetre(pan);
	TrajectoireSpirale t = new TrajectoireSpirale(new Point(400, 300), 100);
	Point suiv = t.getDebut();
	for(int i = 0; i < 360; i++){
	    suiv = t.calculerSuivant(suiv);
	    pan.getForme().setX(suiv.getX());
	    pan.getForme().setY(suiv.getY());
	    System.out.println(e.getX());
	    f.actualiser();
	    Toolkit.getDefaultToolkit().sync();//Annule l'effet saccadé sur Linux
	    pause();
	}
    }

    public static void pause(){
	try{
	    Thread.sleep(10);	      
	} catch(Exception ee){
	}    
    }
    
}
