import javax.swing.JPanel;
import java.util.ArrayList;
import java.awt.*;

public class Panneau extends JPanel{

    private Forme f;
    
    public Panneau(Forme f){
	this.f = f;
    }

    public Forme getForme(){
	return this.f;
    }
	
    
    public void paintComponent(Graphics g){
	this.f.dessiner(g);
    }

    
}
