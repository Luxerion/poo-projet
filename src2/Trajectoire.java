import java.util.ArrayList;

public abstract class Trajectoire{

    protected Point debut, fin;
    
    public Trajectoire(Point debut, Point fin){
	this.debut = debut;
	this.fin = fin;
    }

    public abstract Point calculerSuivant(Point p);

    public Point getDebut(){
	return this.debut;
    }

    public Point getFin(){
	return this.fin;
    }
}
