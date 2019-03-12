
import java.awt.*;
import java.applet.*;

class CubeEarth extends Continents
{
	public static void drawSquare(Graphics g)
	{
		g.setColor(new Color(128,128,128));
		g.drawRect(200,100,900,700);
		g.drawRect(199,99,902,702);
		g.drawRect(198,98,904,704);
		g.drawRect(197,97,906,706);
	}
	public static void drawOcean(Graphics g)
	{
		g.setColor(Color.blue);
		g.fillRect(201,101,899,699);
	}
	public static void drawGround(Graphics g)
	{
		Continents.NorthAmerica(g);
		Continents.SouthAmerica(g);
		Continents.Africa(g);
		Continents.Europe(g);
	}
}

