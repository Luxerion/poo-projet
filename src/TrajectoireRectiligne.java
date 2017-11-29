import java.util.ArrayList;

public class TrajectoireRectiligne extends Trajectoire{

    public TrajectoireRectiligne(Point debut, Point fin){
	super(debut, fin);
	
    }
    
    @Override
    public ArrayList<Point> calculerPoints(){
	ArrayList<Point> pts = new ArrayList<>();
	pts.add(this.debutfin[0]);
	int distX = this.debutfin[1].getX() - this.debutfin[0].getX();
	int distY = this.debutfin[1].getY() - this.debutfin[0].getY();
	int pasX = distX/50;
	int pasY = distY/50;
	int curX = this.debutfin[0].getX() + pasX;
	int curY = this.debutfin[0].getY() + pasY;
	for(int i = 0; i < 48; i++){
	    curX += pasX;
	    curY += pasY;
	    pts.add(new Point(curX, curY));
	}
	pts.add(this.debutfin[1]);
	return pts;
    }

    
}
