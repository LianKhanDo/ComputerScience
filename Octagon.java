

import java.awt.*;
import java.applet.*;
import java.util.ArrayList;

 	class Octagon implements Shape
 	{
 	public void displayShape(Graphics g)

 	{
 	Polygon O = new Polygon();
 	O.addpoint(700,500);
 	O.addpoint(725,500);
 	O.addpoint(750,525);
 	O.addpoint(750,550);
 	O.addpoint(725,575);
 	O.addpoint(700,575);
 	O.addpoint(675,525);
 	O.addpoint(675,550);
 	g.fillPolygon(O);
 	}

 	public void displayName(Graphics g)
 	{
 	g.drawString("Octagon",700,675);
 	}
 //	{
 //		drawSquare(g);
 //	}