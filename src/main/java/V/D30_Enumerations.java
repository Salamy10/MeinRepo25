package V;

import model.PlugType;
import model.TableLight;

public class D30_Enumerations {

	public static void main(String[] args) {
		//klasse model/plugtype stellt stecker zur verfügung
		PlugType typeF = PlugType.TYPE_F;
		PlugType typeI = PlugType.TYPE_I;

		TableLight light1 = new TableLight();
		
		
		System.out.println(typeF);
		System.out.println(typeI);
		System.out.println(light1);
	}

}
