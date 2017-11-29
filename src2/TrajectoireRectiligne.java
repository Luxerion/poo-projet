public class TrajectoireRectiligne extends Trajectoire{

    public TrajectoireRectiligne(Point debut, Point fin){
	super(debut, fin);
	
    }
    
    @Override
    public Point calculerSuivant(Point p){
	int x = p.getX();
	int y = p.getY();
	int distX = this.fin.getX() - this.debut.getX();
	int distY = this.fin.getY() - this.debut.getY();
	x += distX/100;
	y += distY/100;
	return new Point(x, y);
    }

    
}
