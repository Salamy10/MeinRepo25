package V;

import model.TableLight;

public class D23_DataEncapsulation {

	   public static void main(String[] args) {
	      /* version 1: LightBulb redLightBulb = new LightBulb(); */
	      /* version 1: redLightBulb.setColor("rot"); */	//zu selbst-referenz von "LightBulb.java" zugreifen und setzen

	      TableLight light1 = new TableLight();
	      light1.switchOn();	//Methoden setzen anstatt attribute direkt
	      light1.plugIn();
	      /* version 1: light1.changeLightBulb(redLightBulb); */

	      System.out.println(light1.isShining());
	      System.out.println(light1.getLightBulb().getColor());
	   }

	}
