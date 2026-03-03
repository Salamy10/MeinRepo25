package model;

public abstract class Light {	

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

	public abstract boolean isShining();	
	//abstrakte methden gehen nur in abstrakten Klassen && Nur implementierung keine emethoden
	//Methode muss dann in Unterklasse implementiert werden
	
	@Override
	public String toString() {
		return "Light [isOn=" + isOn + "]";
	}

}
