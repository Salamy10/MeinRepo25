package model;

public class Light {

	protected boolean isOn;

	public void switchOn() {
		isOn = true;
	}

	public void switchOff() {
		isOn = false;
	}
	
	public boolean isOn() {
		return isOn;
	}

	public boolean isShining() {
		if (isOn == true) {
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public String toString() {
		return "Light [isOn=" + isOn + "]";
	}

}
