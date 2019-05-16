

import java.awt.*;
import java.applet.*;
import java.util.ArrayList;

public class Lab14a extends Applet {

	public void paint(Graphics g)
	{
		drawGrid(g);
		ArrayList<Shape> shapes = new ArrayList<Shape>();
   		Square Square1= new Square();
   		Triangle Triangle1 = new Triangle();
   		Octagon Octagon1 = new Octagon();
   		Circle Circle1 = new Circle();

   		/*Square1.displayShape(g);
   		Triangle1.displayShape(g);
   		Octagon1.displayShape(g);
   		Circle1.displayShape(g);

   		Square.displayName(g);
   		Triangle.displayName(g);
   		Octagon.displayName(g);
   		Triangle.displayName(g);*/
   		shapes.add(Square1);
   		shapes.add(Triangle1);

 	Triangle1.addPoint(625,50);
 	Triangle1.addPoint(500,250);
 	Triangle1.addPoint(750,250);
   		shapes.add(Octagon1);
   		shapes.add(Circle1);

   		for (Shape shape: shapes)
   		{
   			shape.displayShape(g);
   			shape.displayName(g);
   		}
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

	public abstract void displayShape(Graphics g);

	public abstract void displayName(Graphics g);

	}









