package practice;

import java.util.Random;

public class W03_Dice {
	
	public int rollTheDice() {
		Random r = new Random();
		return r.nextInt(1, 7);
	
	}

}
