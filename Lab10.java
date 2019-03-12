/**
 * @(#)Lab10.java
 *
 * Lab10 Applet application
 *
 * @author
 * @version 1.00 2019/1/22
 */

import java.awt.*;
import java.applet.*;

public class Lab10 extends Applet
{

	public void init()
	{
	}

	public void paint(Graphics g)
	{
	Reality.Void(g);
	Reality.Stars(g);
	Reality.drawingEarth(g);
	}
}