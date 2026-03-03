package V;

import java.util.ArrayList;
import java.util.List;

import model.FlashLight;
import model.TableLight;
import model.Toaster;
import model.WiredDevice;

public class D33_Interfaces {

	public static void main(String[] args) {

		TableLight tableLight1 = new TableLight();
		TableLight tableLight2 = new TableLight();
		FlashLight flashLight = new FlashLight();
		Toaster toaster1 = new Toaster();
		Toaster toaster2 = new Toaster();

		List<WiredDevice> wiredDevices = new ArrayList<>();	//Upcast

		wiredDevices.add(toaster1);
		wiredDevices.add(toaster2);
		wiredDevices.add(tableLight1);
		wiredDevices.add(tableLight2);
//		wiredDevices.add(flashLight);

		for (WiredDevice wiredDevice : wiredDevices) {
			wiredDevice.plugIn(); // Dynamische Polymorphie
			if (wiredDevice instanceof TableLight) {
				TableLight tableLight = (TableLight) wiredDevice; // Downcast
				tableLight.switchOn();
				System.out.println(tableLight);
			}
		}

	}

}
