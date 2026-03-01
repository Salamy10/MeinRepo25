package model;

public enum Color {
	
	BROWN(210, 105, 30), RED(255, 0, 0), BLUE(0, 0, 255), ORANGE(255, 165, 0), BLACK(0, 0, 0);
	
	private int r;
	private int g;
	private int b;	//unveränderlich -> Constructor
	
	Color(int r, int g, int b){
		this.r = r;
		this.g = g;
		this.b = b;
	}

	
	@Override
	public String toString() {
		return "(" + r + ", " + g + ", " + b + ")";
	}

}
