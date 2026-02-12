package practice;

import java.util.Arrays;

public class P03_Arrays07 {

	public static void main(String[] args) {

		int[] arrayOne = { 1, 2, 3, 4 };
		int[] arrayTwo = { 5, 6, 7, 8 };
		int[] array = new int[8];
		int a1 = 0;
		int a2 = 4;
		
		
		for (int x = 0; x < 4; x++) {
			array[a1] = arrayOne[a1];
			array[a2] = arrayTwo[a1];

			a1++;
			a2++;
		}
		
		int c = 0;
		for (int i = 0; i <= 7; i++) {
			System.out.println(array[c]);
			c += 1;
		}

	}

}
