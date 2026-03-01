package practice.OO;

public class Drive2 {

	public static void main(String[] args) {

		Vehicle2 V1 = new Vehicle2("Porsche", "911");

//		V1.setMake("Porsche");
//		V1.setModel("911");

		V1.accelerate(30);
		V1.accelerate(30);
		V1.brake(20);
		V1.accelerate(40);

	}

}
