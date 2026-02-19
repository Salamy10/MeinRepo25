package P1;

import model.LightBulb;
import model.TableLight;

public class D20_Classes {

	public static void main(String[] args) {

		LightBulb redLightBulb = new LightBulb();
//		redLightBulb.color = "rot";	//version 1

		LightBulb blueLightBulb = new LightBulb();
//		blueLightBulb.color = "blau";	//version 1

		TableLight tableLight = new TableLight();
		System.out.println(tableLight.isShining());
		tableLight.plugIn();
		System.out.println(tableLight.isShining());
		tableLight.switchOn();
		System.out.println(tableLight.isShining());
		tableLight.changeLightBulb(blueLightBulb);
		System.out.println(tableLight.isShining());
//		System.out.println(tableLight.lightBulb.color);		//version 1

		System.out.println();
		LightBulb oldLightBulb = tableLight.changeLightBulb(redLightBulb);
		System.out.println(tableLight.isShining());
//		System.out.println(tableLight.lightBulb.color);		//version 1
//		System.out.println(oldLightBulb.color);		//version 1

		System.out.println(redLightBulb);

	}

}
