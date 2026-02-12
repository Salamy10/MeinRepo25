package practice;

import java.util.Scanner;

public class Cases01 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Gib eine ganze zahl ein: ");
		int a = scanner.nextInt();

		int b = a % 2;

		if (b == 0) {
			System.out.println("Die Zahl ist gerade");
		} else {

			System.out.println("Die Zahl ist ungerade");
		}
		scanner.close();

	}

}
