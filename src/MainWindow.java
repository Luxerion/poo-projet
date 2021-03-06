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
	ArrayList<Point> pts = traj.calculerPoints();
	for(Point p : pts){
	    f.setX(p.getX());
	    f.setY(p.getY());
	    this.actualiser();
	    
	    try{
		Thread.sleep(10);
	    } catch(InterruptedException e){
		e.printStackTrace();
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
