/* File:SlotMachine.java
 * ---------------------
 * Program simulates one-arm bandit slot machine
 * commonly found in casinos. Not like in casinos,
 * all results have equal chance.
 * A game costs 1$ to play.
 */

package Graphics;

import java.awt.Color;

import acm.program.*;
import acm.graphics.*;
import acm.util.RandomGenerator;

public class SlotMachineGraphic extends GraphicsProgram {
	
/* current wallet value */
	private static int wallet = 50;
	
/* set size of the application window */
	public static final int APPLICATION_WIDTH = 600;
	public static final int APPLICATION_HEIGHT = 400;
	
	/* make user wallet +
	 * give instruction to the user
	 * play game (select 3 random slots) +
	 * update user wallet +
	 * give info to the user & ask to play again
	 */
	
	public void init() {
		GRect background = new GRect(APPLICATION_WIDTH, APPLICATION_HEIGHT);
		background.setFilled(true);
		background.setFillColor(Color.LIGHT_GRAY);
		add(background);
		
		topText = new GLabel("Welcome to the slot machine!");
		midText = new GLabel("You now have $50.");
		botText = new GLabel("Click to play");
		topText.setFont("Serif-24");
		midText.setFont("Serif-24");
		botText.setFont("Serif-24");
		add(topText, 100, 250);
		add(midText, 100, 280);
		add(botText, 100, 310);
		
		slotBox1 = new GImage("empty.png");;
		slotBox2 = new GImage("empty.png");
		slotBox3 = new GImage("empty.png");
		add(slotBox1, 100, 100);
		add(slotBox2, 250, 100);
		add(slotBox3, 400, 100);
		
		
		
		while (!gameOver()) {
			waitForClick();
			removeAll();
			add(background);
			playGame();
		}
	}
	
/* plays random game, returns results of game and updates wallet */	
	private void playGame() {
		
		/* take 1$ from the wallet to play game */
		setWallet(-1);
		
		/* generate 3 random slots */
		slot1 = getSlot();
		slot2 = getSlot();
		slot3 = getSlot();
		slotBox1 = getSlotBox(slot1);
		slotBox2 = getSlotBox(slot2);
		slotBox3 = getSlotBox(slot3);
		
		/* draw slots on the screen and compute result*/
		add(slotBox1, 100, 100);
		add(slotBox2, 250, 100);
		add(slotBox3, 400, 100);
		
		String result = gameOutcome(slot1, slot2, slot3);
		topText = new GLabel(result);
		midText = new GLabel("You now have " + getWallet() + "$.");
		botText = new GLabel("Click to play");
		topText.setFont("Serif-24");
		midText.setFont("Serif-24");
		botText.setFont("Serif-24");
		add(topText, 100, 250);
		add(midText, 100, 280);
		add(botText, 100, 310);

	}
	
/* construct GImage representing slot from a name of a slot as a string */
	private GImage getSlotBox(String name) {
		if (name.equals(CHERRY)) {
			return new GImage("cherry.png");
		} else if (name.equals(LEMON)) {
			return new GImage("lemon.png");
		} else if (name.equals(ORANGE)) {
			return new GImage("orange.png");
		} else if (name.equals(PLUM)) {
			return new GImage("plum.png");
		} else if (name.equals(BELL)) {
			return new GImage("bell.png");
		} else if (name.equals(BAR)) {
			return new GImage("bar.png");
		} else {
			return new GImage("empty.png");
		}
	}
	
/* get random slot result */
	private String getSlot() {
		int slotPick = rgen.nextInt(1, 7);
			switch (slotPick) {
			case 1: return CHERRY;
			case 2: return LEMON;
			case 3: return ORANGE;
			case 4: return PLUM;
			case 5: return BELL;
			case 6: return BAR;
			case 7: return EMPTY_SLOT;
			default: return null;
		}
	}
	
/* determine result and update wallet*/	
	private String gameOutcome (String slot1, String slot2, String slot3) {
		if (slot1.equals(BAR) && slot2.equals(BAR) && slot3.equals(BAR)) {
			setWallet(250);
			return "You Win 250$";
		} else if (slot1.equals(BELL) && slot2.equals(BELL) && (slot3.equals(BELL) || slot3.equals(BAR))) { // dont forget about having || in parentheses !!!!!!!!!!
			setWallet(20);
			return "You win 20$";
		} else if (slot1.equals(PLUM) && slot2.equals(PLUM) && (slot3.equals(PLUM) || slot3.equals(BAR))) {
			setWallet(14);
			return "You Win 14$";
		} else if (slot1.equals(ORANGE) && slot2.equals(ORANGE) && (slot3.equals(ORANGE) || slot3.equals(BAR))) {
			setWallet(10);
			return "You Win 10$";
		} else if (slot1.equals(CHERRY) && slot2.equals(CHERRY) && slot3.equals(CHERRY)) {
			setWallet(7);
			return "You Win 7$";
		} else if (slot1.equals(CHERRY) && slot2.equals(CHERRY) && slot3.equals(EMPTY_SLOT)) {
			setWallet(5);
			return "You Win 5$";
		} else if (slot1.equals(CHERRY) && slot2.equals(EMPTY_SLOT) && slot3.equals(EMPTY_SLOT)) {
			setWallet(2);
			return "You Win 2$";
		} else {
			return "You lose";
		}
	}
	
/* update user wallet */
	private void setWallet(int dollars) {
		wallet += dollars;
	}
	
/* retrive wallet current value */
	private int getWallet() {
		return wallet;
	}

	private boolean gameOver() {
		if (wallet <= 0) {
			return true;
		}
		return false;
	}
/*  slots symbols */
	private String CHERRY = "cherry";
	private String LEMON = "lemon";
	private String ORANGE = "orange";
	private String PLUM = "plum";
	private String BELL = "bell";
	private String BAR = "bar";
	private String EMPTY_SLOT = "empty";
	
/* slot variables */
	private String slot1;
	private String slot2;
	private String slot3;
	private GImage slotBox1;
	private GImage slotBox2;
	private GImage slotBox3;
	
/* text labels
*/
	private static GLabel topText;
	private static GLabel midText;
	private static GLabel botText;
	
/* random generator */
	RandomGenerator rgen = RandomGenerator.getInstance();
}

