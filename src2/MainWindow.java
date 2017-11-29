import java.awt.*;
import java.util.ArrayList;
import javax.swing.JFrame;

public class MainWindow extends JFrame{

    private Panneau pan;
    
    public MainWindow(){
	this.setTitle("Projet POO");
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	this.setVisible(true);
	this.setSize(800, 600);
	this.pan = new Panneau();
	this.setContentPane(pan);
    }
    
    public void ajouterForme(Forme f){
	this.pan.ajouterForme(f);
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
	for(Forme f : pan.getFormes()){
	    
	}
    }
    
    public void actualiser(){
	this.pan.repaint();
	this.repaint();
    }
}
