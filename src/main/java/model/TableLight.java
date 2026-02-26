package model;

public class TableLight extends Light{

	private boolean isConnected;
	private LightBulb lightBulb;
	private final PlugType plugType;

	private static int numberOfTableLights; // ++ zählt jedes mal wenn eine Tischlampe erstellt wird
	// statische Methode

	public TableLight() { // komplett ohne Parameter
		plugType = PlugType.TYPE_F;
		numberOfTableLights++; // bietet sich bei der Implementierung der Methode an
	}

	public TableLight(LightBulb lightBulb) { // Hier mit "lightBulb"
		plugType = PlugType.TYPE_F;
		numberOfTableLights++;
		this.lightBulb = lightBulb;
	}

	public void plugIn() {
		isConnected = true;
	}

	public void pullThePlug() {
		isConnected = false;
	}


	public LightBulb changeLightBulb(LightBulb newLightBulb) {
		LightBulb oldLightBulb = lightBulb;
		lightBulb = newLightBulb;
		return oldLightBulb;
	}

	@Override
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

	public LightBulb getLightBulb() {
		return lightBulb;
	}

	@Override // +1 punkt klausur
	public String toString() {		//wandelt Objekt in eine Zeichenkette um
		return "TableLight [isConnected=" + isConnected + ", isOn=" + isOn + ", lightBulb=" + lightBulb + 
				", plugType= " + plugType +  "]";
	} // gehört zum guten ton die Klasse richtig abzugeben

	public static int getNumberOfTableLights() {
		return numberOfTableLights;
	}
	
	public PlugType getPlugType() {
		return plugType;
	}
}
