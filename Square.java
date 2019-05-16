

import java.awt.*;
import java.applet.*;
import java.util.ArrayList;

	class Square implements Shape
 	{
 	public void displayShape(Graphics g)

 	{
 	Polygon S = new Polygon();
 	S.addpoint(50,50);
 	S.addpoint(100,50);
 	S.addpoint(50,100);
 	S.addpoint(100,100);
 	g.fillPolygon(S);
 	}

 	public void displayName(Graphics g)

 	{
 	g.drawString("Square",100,275);
 	}
 //	{
 //		drawSquare(g);
 //	}
 	}