package practice;

import java.util.Scanner;

public class flexCalc 
{
	
	
	public static void main(String[] args) 
	{
		
		
		boolean wiederholen = true;
		while (wiederholen = true) 
		{
			
			Scanner scanner = new Scanner(System.in);
			
			
			System.out.print("Bitte eine ganze Zahl eingeben: ");
			int a = scanner.nextInt();
			System.out.print("Operator: ");
			String operator = scanner.next();
			System.out.print("Bitte eineweitere Zahl eingeben: ");
			int b = scanner.nextInt();
			
			
			
			if (operator.equals("+")) {
			System.out.println(a + "+" + b + "=" + (a+b));
			}
			if (operator.equals("-")) {
			System.out.println(a + "-" + b + "=" + (a-b));
			}
			if (operator.equals("*")) {
			System.out.println(a + "*" + b + "=" + (a*b));
			}
			if (operator.equals("/")) {
			System.out.println(a + "/" + b + "=" + (double) a/b);
			}
			else {
			System.out.println("Wtf");
			}
		
		
		
		
		
			System.out.print("Wollen sie nochmal rechnen? (y = ja, n = nein): ");
			String turn = scanner.next();
		
			if (turn.equals("n")) {
			System.out.println("Auf Wiedersehen!");
			break;}
			if (turn.equals("y")) {
			System.out.println("Ok, lass es uns nochmal versuchen!");
			wiederholen = true;
			}
			else { 
			System.out.println("Fuck you!" + "\nSHUT OFF");
			break;}
			
			
		}
		
		
	}

}
