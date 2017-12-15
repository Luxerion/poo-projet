import java.awt.*;
import java.util.ArrayList;
import javax.swing.JFrame;

/**
 *Fenetre de type JFrame qui embarque un JPanel
 *@author Sébastien RIGOT
 */

public class Fenetre extends JFrame{

    private Panneau pan;
    
    public Fenetre(Panneau pan){
	this.setTitle("Projet POO");
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	this.setVisible(true);
	this.setSize(800, 600);
	this.pan = pan;
	this.setContentPane(pan);
    }
    
    public void deplacer(Forme f, Trajectoire traj){
	while(f.getX() != traj.getFin().getX()){
	    f.setX(traj.calculerSuivant(new Point(f.getX(), f.getY())).getX());
	    f.setY(traj.calculerSuivant(new Point(f.getX(), f.getY())).getY());
	    actualiser();
	    Toolkit.getDefaultToolkit().sync();//Annule l'effet saccadé sur Linux
	    try{
		Thread.sleep(30);
	    } catch(Exception e){
		System.out.println(e);
	    }
	}
    }

    public void toutDeplacer(){
    }
    
    public void actualiser(){
	this.pan.repaint();
    }
}
