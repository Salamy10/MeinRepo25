package V;

import java.util.ArrayList;

import model.FlashLight;
import model.Light;
import model.LightBulb;
import model.TableLight;

public class D31_Inheritance {
	public static void main(String[] args) {
		/* Objekterzeugung */
		TableLight tableLight1 = new TableLight();
		LightBulb redLightBulb = new LightBulb("rot");
		TableLight tableLight2 = new TableLight();

		FlashLight flashLight1 = new FlashLight();
		FlashLight flashLight2 = new FlashLight();

		/* Ansatz ohne Vererbung */
		ArrayList<TableLight> tableLights = new ArrayList<>();
		tableLights.add(tableLight1);
		tableLights.add(tableLight2);

		for (TableLight light : tableLights) {
			light.switchOn();
			System.out.println(light.isShining()); // 2 lampen sagen: false
		}

		ArrayList<FlashLight> flashLight = new ArrayList<>();
		flashLight.add(flashLight1);
		flashLight.add(flashLight2);

		for (FlashLight light : flashLight) {
			light.switchOn();
			System.out.println(light.isShining()); // 2 lampen sagen: true
		}

		/* Ansatz mit Vererbung */
		ArrayList<Light> lights = new ArrayList<>();

		lights.add(flashLight1); // Upcast
		lights.add(flashLight2); // Upcast
		lights.add(tableLight1); // Upcast
		lights.add(tableLight2); // Upcast

		for (Light light : lights) {
			light.switchOn(); // dynamische polymorphie (Ausgang bei Laufzeit bestimmt)
			System.out.println(light.toString()); // statische Polymorphie (println) + dynamische polymorphie (toString)
			System.out.println(light.isShining());// statische Polymorphie (println) + dynamische polymorphie
													// (isShining)
		}

	}

}
