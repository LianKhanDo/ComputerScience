import java.awt.*;
import java.applet.*;
import java.util.ArrayList;

	class Triangle implements Shape
 	{


 	public void displayShape(Graphics g)

 	{
 	Polygon T = new Polygon();
 	g.fillPolygon(T);
 	}

 	public void displayName(Graphics g)

 	{
 	g.drawString("Triangle",600,275);
 	}
 //	{
 //		drawSquare(g);
 //	}
 	}