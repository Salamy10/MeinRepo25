package model;

public class TableLight {

	private boolean isConnected;
	private boolean isOn;
	private LightBulb lightBulb;
	private final PlugType plugType;

	private static int numberOfTableLights; // ++ zählt jedes mal wenn eine Tischlampe erstellt wird
	// statische Methode

	public TableLight() { // komplett ohne Parameter
		plugType = new PlugType("Typ F", "CEE 7/4", "Europa")
		numberOfTableLights++; // bietet sich bei der Implementierung der Methode an
	}

	public TableLight(LightBulb lightBulb) { // Hier mit "lightBulb"
		plugType = new PlugType("Typ F", "CEE 7/4", "Europa")
		numberOfTableLights++;
		this.lightBulb = lightBulb;
	}

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
		if (isConnected == true && isOn /* "== true" optional, da schon boolsch */ && lightBulb != null) {
			return true;
		} else {
			return false;
		}

//		return isConnected && isOn && lightBulb !=null;		//profi methode für boolsch == true
	}

	// getter methode
	public boolean isConnected() {
		return isConnected;
	}

	public boolean isOn() {
		return isOn;
	}

	public LightBulb getLightBulb() {
		return lightBulb;
	}

	@Override // +1 punkt klausur
	public String toString() {
		return "TableLight [isConnected=" + isConnected + ", isOn=" + isOn + ", lightBulb=" + lightBulb + "]";
	} // gehört zum guten ton die Klasse richtig abzugeben

	public static int getNumberOfTableLights() {
		return numberOfTableLights;
	}
}
