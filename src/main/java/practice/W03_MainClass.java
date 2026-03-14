package practice;

import java.util.Scanner;

public class W03_MainClass {

	private static W03_Player p1;
	private static W03_Player p2;
	private static Scanner sc;

	public static void main(String[] args) {

		sc = new Scanner(System.in);

		System.out.println("Name P1: ");
		p1 = new W03_Player(sc.nextLine(), 10);

		System.out.println("Name P2: ");
		p2 = new W03_Player(sc.nextLine(), 10);

		do {
			System.out.println(p1.getName() + " hat " + p1.getHP() + " HP.");
			System.out.println(p2.getName() + " hat " + p2.getHP() + " HP.");

			int dice1 = p1.rollTheDice();
			int dice2 = p2.rollTheDice();

			System.out.println(p1.getName() + " würfelt eine " + dice1);
			System.out.println(p2.getName() + " würfelt eine " + dice2);

			if (dice1 > dice2) {
				p2.reduceHP(1);
			}
			if (dice2 > dice1) {
				p1.reduceHP(1);
			}
		} while (p1.getHP() > 0 && p2.getHP() > 0);

		if (p1.getHP() == 0) {
			System.out.println(p2.getName() + " gewinnt!!");
		}
		if (p2.getHP() == 0) {
			System.out.println(p1.getName() + " gewinnt!!");
		}
	}

}
