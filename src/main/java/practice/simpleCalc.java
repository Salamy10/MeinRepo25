package practice;

import java.util.Scanner;

public class simpleCalc {
	
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		
		System.out.print("Bitte eine ganze Zahl eingeben: ");
		int input = scanner.nextInt();
				
		System.out.print("Bitte eine weitere ganze Zahl eingeben: ");
		int input2 = scanner.nextInt();
		
		System.out.print("Wollen Sie addieren? (true = addieren, false = subtrahieren): ");
		boolean input3 = scanner.nextBoolean();
		
		
		if (input3) {
			System.out.println(input + input2);			
		} else {
			System.out.println(input - input2);
		
		}

		scanner.close();
		
	}

}