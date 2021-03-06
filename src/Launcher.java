import java.awt.*;

public class Launcher{
    public static void main(String[] args){
	MainWindow mw = new MainWindow();
	Elipse e = new Elipse(Color.BLUE, 400, 300, 50, 50);
	Elipse e1 = new Elipse(Color.GREEN, 0, 200, 50, 50);
	Elipse e2 = new Elipse(Color.GREEN, 0, 100, 50, 50);
	Elipse e3 = new Elipse(Color.GREEN, 0, 300, 50, 50);
	mw.ajouterForme(e);
	mw.ajouterForme(e1);
	mw.ajouterForme(e2);
	mw.ajouterForme(e3);
	Point p1 = new Point(400, 300);
	Point p2 = new Point(500, 500);
	Point p3 = new Point(0, 100);
	Point p4 = new Point(500, 100);
	Point p5 = new Point(0, 200);
	Point p6 = new Point(500, 200);
	Point p7 = new Point(0, 300);
	Point p8 = new Point(500, 300);
	mw.deplacer(e, new TrajectoireCirculaire(p1, 40));
	mw.deplacer(e1, new TrajectoireRectiligne(p3, p4));
	mw.deplacer(e2, new TrajectoireRectiligne(p5, p6));
	mw.deplacer(e3, new TrajectoireRectiligne(p7, p8));
    }
}
    
