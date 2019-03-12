/**
 * @(#)Lab14.java
 *
 * Lab14 Applet application
 *
 * @author
 * @version 1.00 2019/3/11
 */


import java.awt.*;
import java.applet.*;

public class Lab14 extends Applet
{
   public void paint(Graphics g)
   {
      drawGrid(g);
      Shape1Square Square = new Shape1Square();
      Shape2Triangle Triangle = new Shape2Triangle();
      Shape3Octagon Octagon = new Shape3Octagon();
      Shape4Circle Circle = new Shape4Circle();

      Square.drawShape(g);
      Square.displayName(g);
      Triangle.drawShape(g);
      Triangle.displayName(g);
      Octagon.drawShape(g);
      Octagon.displayName(g);
      Circle.drawShape(g);
      Circle.displayName(g);
   }

   public void drawGrid(Graphics g)
   {
     	g.drawRect(10,10,800,600);
      	g.drawLine(10,300,810,300);
      	g.drawLine(410,10,410,610);
   }
}

abstract interface Shape
{
   public abstract void drawShape(Graphics g);

   public abstract void displayName(Graphics g);

   // public abstract void displayNumSides(Graphics g);
}

class Shape1Square implements Shape
{
   public void drawShape(Graphics g)
   {
   		g.fillRect(100,50,200,200);
   }
   public void displayName(Graphics g)
   {
   		g.drawString("Square", 40,50);
   }
}

class Shape2Triangle implements Shape
{
	public void drawShape(Graphics g)
	{
		Polygon T = new Polygon();
		T.addPoint(625,50);
		T.addPoint(500,250);
		T.addPoint(750,250);
		g.fillPolygon(T);
	}
	public void displayName(Graphics g)
	{
		g.drawString("Triangle", 450,50);
	}
}

class Shape3Octagon implements Shape
{
	public void drawShape(Graphics g)
	{
		Polygon O = new Polygon();
		O.addPoint(175,325);
		O.addPoint(250,325);
		O.addPoint(325,400);
		O.addPoint(325,500);
		O.addPoint(250,575);
		O.addPoint(175,575);
		O.addPoint(100,500);
		O.addPoint(100,400);

		g.fillPolygon(O);
	}
	public void displayName(Graphics g)
	{
		g.drawString("Octagon", 40,350);
	}
}

class Shape4Circle implements Shape
{
	public void drawShape(Graphics g)
	{
		g.fillOval(500,350,225,225);
	}
	public void displayName(Graphics g)
	{
		g.drawString("Circle", 450,350);
	}
}
