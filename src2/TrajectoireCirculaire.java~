import java.util.ArrayList;

public class TrajectoireCirculaire extends Trajectoire{

    private int rayon;
    
    public TrajectoireCirculaire(Point debut, int rayon){
	super(debut, debut);
	this.rayon = rayon;
    }

    @Override
    public ArrayList<Point> calculerPoints(){
	ArrayList<Point> pts = new ArrayList<>();
	int originX = this.debutfin[0].getX();
	int originY = this.debutfin[0].getY();
	for(int i = 0; i < 360; i++){
	    int newX = originX + (int)Math.round((this.rayon*Math.cos(Math.toRadians(i))));
	    int newY = originY + (int)Math.round((this.rayon*Math.sin(Math.toRadians(i))));
	    pts.add(new Point(newX, newY));
	}
	return pts;
    }
    
}
