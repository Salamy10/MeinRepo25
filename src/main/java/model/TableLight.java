package model;

public class TableLight {

	private boolean isConnected;
	private boolean isOn;
	private LightBulb lightBulb;

	public void plugIn() {
		isConnected = true;
	}

	public void pullThePlug() {
		isConnected = false;
	}

	public void switchOn() {
		isOn = true;
	}

	public void switchOff() {
		isOn = false;
	}

	public LightBulb changeLightBulb(LightBulb newLightBulb) {
		LightBulb oldLightBulb = lightBulb;
		lightBulb = newLightBulb;
		return oldLightBulb;
	}

	public boolean isShining() {
		if (isConnected == true && isOn /* "== true" optional, da schon boolsch*/ && lightBulb != null) {
			return true;
		} else {
			return false;
		}
		
//		return isConnected && isOn && lightBulb !=null;		//profi methode für boolsch == true
	}
	
	
	//getter methode
	public boolean isConnected(){
		return isConnected;
	}
	
	public boolean isOn() {
		return isOn;
	}
	
	public LightBulb getLightBulb() {
		return lightBulb;
	}
}
