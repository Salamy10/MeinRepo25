package practice;

import java.util.Scanner;

public class simpleCalc {
	
	
	public static void main(String[] args) {

		boolean wiederholen = true;
		
		while (wiederholen = true) {
		
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

		
		System.out.println("Wollen sie nochmal rechnen? (true = ja, false = nein): ");
		boolean turn = scanner.nextBoolean();
		
		if (turn == false) {
			System.out.println("Auf Wiedersehen!");
			break;}
		if (turn == true) {
			System.out.println("Ok, lass es uns nochmal versuchen!");
			wiederholen = true;
			
			
		}
		
		
	}

}
}