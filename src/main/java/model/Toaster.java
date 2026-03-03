package model;

public class Toaster implements WiredDevice {	//"implements" greift Interfaces((...)I1, I2, ...)

	@Override
	public void plugIn() {
		System.out.println("Ich, der Toaster bin eingesteckt!!");
	}

	@Override
	public void pullThePlug() {
		System.out.println("Ich, der Toaster bin ausgesteckt!!");
	}

}
