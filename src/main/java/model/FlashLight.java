package model;

public class FlashLight extends Light {

//	private boolean isOn;	//kommt von class "Light
	private double energyLevel;

	public FlashLight() {
		energyLevel = 1;
	}
	
	@Override
	public void switchOn() {
		energyLevel -= 0.1;
		isOn = true;
	}

	public void recharge() {
		energyLevel = 1;
	}

	@Override
	public boolean isShining() {
		if (isOn && energyLevel > 0) {
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public String toString () {
		return "FlashLight [isOn=" + isOn + ", energyLevel=" + energyLevel +  "]";
	}

}
