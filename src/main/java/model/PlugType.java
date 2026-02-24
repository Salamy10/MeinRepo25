package model;

public enum PlugType {	//KlassenTyp "enum" für Aufzählungen

	//definierte Konstanten
	TYPE_F("Typ-F", "CEE 7/4", "Europa"),
	TYPE_I("Typ-I", "AS/NZS 3112", "Australien");
//	Prinzipiell das selbe wie die ausführliche Form:
//	public final static PlugType TYPE_I = new PlugType("Typ-I", "AS/NZS 3112", "Australien");
	
	
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
