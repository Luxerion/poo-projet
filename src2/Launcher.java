import java.awt.*;

public class Launcher{
    public static void main(String[] args){
	MainWindow mw = new MainWindow();
	Elipse e = new Elipse(Color.BLUE, 50, 300, 30, 30);
	TrajectoireRectiligne tr = new TrajectoireRectiligne(new Point(50, 300), new Point(600, 300));
	mw.ajouterForme(e);	
	mw.deplacer(e, tr);
    }
}
    
