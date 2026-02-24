package V;

import java.util.ArrayList;


public class D28_ForEachLoop {	//make it shorter/easier aber rein optional

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<>();
		
		names.add("Hans");
		names.add("Peter");
		names.add("Lisa");
		names.add("Huan");
		
		/*klassische Schleife*/
		for(int i=0; i < names.size(); i++) {
			String name = names.get(i);
			System.out.println(name);
		}
		
		System.out.println();
		
		/*For-Each-Schleife */
		for(String name : names) {	//"Für jeden Namen in der namensliste mache ich..."
			System.out.println(name);
		}
	}

}
