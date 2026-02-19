package practice;


public class Arrays01 {

	public static void main(String[] args) {
		int[] array = new int[16];
		
		
		for (int i = 0; i <= 15; i++) {		
		double g = Math.pow(2, i);

		array[i] = (int) g;
		
		}
		System.out.println("Zweierpotenzen: ");
		for (int x = 0; x <= 15; x++) {
		System.out.println(array[x]);
		}

	}

}
