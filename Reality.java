import java.awt.*;
import java.applet.*;

class Reality extends Earth
{
	public static void Void(Graphics g)
	{
		g.setColor(Color.black);
		g.fillRect(0,0,1280,1280);
	}
	public static void Stars(Graphics g)
	{
		for (int k = 1; k <= 500; k++)
		{
			g.setColor(Color.yellow);
			int x = (int) (Math.random()*(2000));
			int y = (int) (Math.random()*(1000));
			g.fillRect(x,y,5,5);
		}
	}
	public static void drawingEarth(Graphics g)
	{
		CubeEarth.drawSquare(g);
		CubeEarth.drawOcean(g);
		CubeEarth.drawGround(g);
	}
}

