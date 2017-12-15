import java.awt.*;

public class Ellipse extends Forme{
    protected int rayonX, rayonY;

    public Ellipse(Color color, int x, int y, int rayonX, int rayonY){
	super(color, x, y);
	this.rayonX = rayonX;
	this.rayonY = rayonY;
    }

    public void dessiner(Graphics g){
	g.setColor(this.color);
	g.fillOval(this.x-this.rayonX, this.y-this.rayonY, this.rayonX*2, this.rayonY*2);
    }
	
}
