package P1;


public class P03_Arrays07_flex.java {

	public static void main(String[] args) {

		int[] arrayOne = { 1, 2, 3, 4 };
		int[] arrayTwo = { 5, 6, 7, 8 };
		int[] array = new int[arrayOne.length + arrayTwo.length];
		int a1 = 0;
		int a2 = array.length / 2;

		for (int x = 0; x < array.length / 2; x++) {
			array[a1] = arrayOne[a1];
			array[a2] = arrayTwo[a1];

			a1++;
			a2++;
		}

		for (int i = 0; i <= array.length - 1; i++) {
			System.out.println(array[i]);
		}

	}

}
