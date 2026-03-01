package practice.OO;

public class Vehicle {
	private String make;
	private String model;
	private double speedInKmh;

	public void setMake(String make) {
		this.make = make;
	}

	public void setModel(String model) {
		this.model = model;
	}

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
