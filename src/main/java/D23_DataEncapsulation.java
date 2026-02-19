package P1;

import model.LightBulb;
import model.TableLight;

public class D23_DataEncapsulation {
	public static void main(String[] args) {
		LightBulb redLightBulb = new LightBulb();
		redLightBulb.setColor("rot");		//zu selbst-referenz von "LightBulb.java" zugreifen und setzen
		
		TableLight light1 = new TableLight();
		light1.switchOn();	//Methoden setzen anstatt attribute direkt
		light1.plugIn();
		light1.changeLightBulb(redLightBulb);
		
		System.out.println(light1.isShining());
		System.out.println(light1.getLightBulb().getColor());
	}

}
