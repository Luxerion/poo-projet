import java.util.ArrayList;

public class TrajectoireCirculaire extends Trajectoire{

    private int rayon;
    
    public TrajectoireCirculaire(Point debut, int rayon){
	super(debut, debut);
	this.rayon = rayon;
    }

    @Override
    public Point calculerSuivant(Point p){
	int x = p.getX();
	int y = p.getY();
	int origX = this.debut.getX();
	int origY = this.debut.getY();
	return new Point(x, y);
    }
    
}