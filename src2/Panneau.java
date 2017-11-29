import javax.swing.JPanel;
import java.util.ArrayList;
import java.awt.*;

public class Panneau extends JPanel{
    private ArrayList<Forme> formes;
    
    public Panneau(){
	this.formes = new ArrayList<>();
    }
    
    public void ajouterForme(Forme f){
	this.formes.add(f);
    }
    
    public void paintComponent(Graphics g){
	for(Forme f : formes){
	    f.dessiner(g);
	}
    }

    public ArrayList<Forme> getFormes(){
	return this.formes;
    }
}
