package practice.OO;

public class Vehicle2 {
	private final String make;
	private final String model;
	private double speedInKmh;

	public Vehicle2(String make, String model) {
		this.make = make;
		this.model = model;
	}

//	public void setMake(String make) {
//		this.make = make;
//	}
//
//	public void setModel(String model) {
//		this.model = model;
//	}

	public String getMake() {
		return make;
	}

	public String getModel() {
		return model;
	}

	public double getspeedInKmh() {
		return speedInKmh;
	}

	public void accelerate(int valueInKmh) {
		speedInKmh += valueInKmh;
		System.out.println(toString() + " beschleunigt auf " + speedInKmh + "Km/h");
	}

	public void brake(int valueInKmh) {
		speedInKmh -= valueInKmh;
		System.out.println(toString() + " bremst auf " + speedInKmh + "Km/h ab");
	}

	@Override
	public String toString() {
		return make + " " + model;
	}
}
