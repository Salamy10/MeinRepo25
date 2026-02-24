package V;

import model.LightBulb;
import model.TableLight;

public class D25_Constructors {

	public static void main(String[] args) {
		LightBulb redLightBulb = new LightBulb("rot"); // -> Siehe Appenmaier Repi Versions in all LightBulb classes
		// => Change D21 & nessecary
		//

		TableLight light1 = new TableLight();
		TableLight light2 = new TableLight(redLightBulb);

	}

}
