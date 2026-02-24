package model;

public class PlugType {

	//definierte Konstanten
	public final static PlugType TYPE_F = new PlugType("Typ-F", "CEE 7/4", "Europa");
	public final static PlugType TYPE_I = new PlugType("Typ-I", "AS/NZS 3112", "Australien");
	
	
	private final String description;
	private final String norm;
	private final String region;
	

	// für die privates folgenden constructor
	private PlugType(String description, String norm, String region) {
		this.description = description;
		this.norm = norm;
		this.region = region;
	}

	public String getDescription() {
		return description;
	}

	public String getNorm() {
		return norm;
	}

	public String getRegion() {
		return region;
	}
	
	
}
