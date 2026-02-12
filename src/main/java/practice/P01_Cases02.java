package practice;

import java.util.Scanner;

public class P01_Cases02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Bitte gib eine ganze Zahl ein: ");
		int a = scanner.nextInt();
		System.out.print("Bitte gib einen Operator ein: ");
		String operator = scanner.next();
		System.out.print("Bitte gib eine weitere ganze Zahl ein: ");
		int b = scanner.nextInt();
		
		if (operator.equals("+")) {
			System.out.println(a + "+" + b + "=" + (a+b));}
		else if (operator.equals("-")) {
			System.out.println(a + "-" + b + "=" + (a-b));}
		else if (operator.equals("*")) {
			System.out.println(a + "*" + b + "=" + a*b);}
		else if (operator.equals("/")) {
			System.out.println(a + "/" + b + "=" +  (double) a/b);}
		else { System.out.println("unzulässige eingabe");
		

	}

}
}
