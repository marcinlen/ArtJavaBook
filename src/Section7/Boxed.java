package Section7;

import acm.graphics.*;

public class Boxed extends GCompound {
	
	public Boxed(String text) {
		box = new GRect(BOX_WIDTH, BOX_HEIGHT);
		label = new GLabel(text);
		
		add(box, 0, 0);
		add(label, BOX_WIDTH / 2 - label.getWidth() / 2, BOX_HEIGHT / 2);
		
	}

	/* box */
	private GRect box;
	private static final double BOX_WIDTH = 120;
	private static final double BOX_HEIGHT = 50;
	
	/* label */
	private GLabel label;
}
