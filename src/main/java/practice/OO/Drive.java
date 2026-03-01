package practice.OO;

import practice.OO.Vehicle;

public class Drive {
	
	public static void main(String[] args) {
		
		Vehicle V1 = new Vehicle();
		
		V1.setMake("Porsche");
		V1.setModel("911");
		
		V1.accelerate(30);
		V1.accelerate(30);
		V1.brake(20);
		V1.accelerate(40);
		
		
	}

}
