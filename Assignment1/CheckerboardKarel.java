/*
 * File: CheckerboardKarel.java
 * ----------------------------
 * When you finish writing it, the CheckerboardKarel class should draw
 * a checkerboard using beepers, as described in Assignment 1.  You
 * should make sure that your program works for all of the sample
 * worlds supplied in the starter folder.
 */

import stanford.karel.*;

public class CheckerboardKarel extends SuperKarel {

	// You fill in this part
	public void run() {
		turnLeft();
		for ( int i = 1 ; i < 65 ; i++ ) {
			goStrange();
			int k = ( i + 2 ) % 2  ;
			if ( k == 1 ) {
				if (noBeepersPresent()) {
					putBeeper();
				}
			}
			
		}
		
	}
	
	public void goStrange() {
		if (frontIsClear()) {
			move();
		} else {
			turnBack();
		}
	}
	public void turnBack() {
		if (frontIsBlocked()) {
			if (facingNorth()) {
				turnRight();
				if (frontIsClear()) {
					move();
					turnRight();
				}
			}
			else if (facingSouth()) {
				turnLeft();
				if (frontIsClear()) {
					move();
					turnLeft();
				}
			}
		}
	}
	public void turnRight() {
		turnLeft();
		turnLeft();
		turnLeft();
	}
	public void turnAround() {
		turnLeft();
		turnLeft();
	}

}
