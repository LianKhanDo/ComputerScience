

import java.awt.*;
import java.applet.*;
import java.util.ArrayList;

class Circle implements Shape
 	{
 	public void displayShape(Graphics g)

 	{
 	Polygon C = new Polygon();
 	g.fillOval(50,600,50,50);
 	}

 	public void displayName(Graphics g)
 	{
 	g.drawString("Circle",100,875);
 	}
 //	{
 //		drawSquare(g);
 //	}
 	}