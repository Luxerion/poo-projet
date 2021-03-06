public class TrajectoireSpirale extends Trajectoire{

    private int rayon;
    private int indice;
    private int origX, origY;
    
    public TrajectoireSpirale(Point debut, int rayon){
	super(debut, debut);
	this.rayon = rayon;
	this.indice = 0;
	this.origX = this.debut.getX() - this.rayon;
	this.origY = this.debut.getY() - this.rayon;
    }

    @Override
    public Point calculerSuivant(Point p){
	int x = origX + (int)Math.round((this.rayon*Math.cos(Math.toRadians(indice))));
	int y = origY + (int)Math.round((this.rayon*Math.sin(Math.toRadians(indice))));
	this.indice++;
	this.rayon++;
	return new Point(x, y);
    }
    
}
