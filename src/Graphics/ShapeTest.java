package Graphics;

import java.awt.Color;

import acm.graphics.*;
import acm.program.*;

public class ShapeTest extends GraphicsProgram {
	
	public void run() {
		GDiamond d = new GDiamond(100, 150);
		//add(d, 200, 175);
		GTrapezoid t = new GTrapezoid(200, 300, 150);
		//add(t, 150, 100);
		GTShape ts = new GTShape(100);
		//add(ts, 200, 110);
		
		HartShepedPoly hart = new HartShepedPoly(100);
		hart.setFilled(true);
		hart.setColor(Color.RED);
		hart.setFillColor(Color.RED);
		add(hart, getWidth() / 2, getHeight() / 2);
		
		GPolygon rtest = LogCabinBlock.rectPoly(90, 10, 0);
		add(rtest, 200, 200);
		while (true) {
			pause(2);
			rtest.rotate(1);
			
		}
		
		
		
	}

}
