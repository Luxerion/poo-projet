import java.awt.*;

public class Elipse extends Forme{
    protected int rayonX, rayonY;

    public Elipse(Color color, int x, int y, int rayonX, int rayonY){
	super(color, x, y);
	this.rayonX = rayonX;
	this.rayonY = rayonY;
    }

    public void dessiner(Graphics g){
	g.setColor(this.color);
	g.fillOval(this.x, this.y, this.rayonX, this.rayonY);
    }
	
}
