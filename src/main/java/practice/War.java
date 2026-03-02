package practice;

public class War {

	public static void main(String[] args) {

		Staat Israel = new Staat("Israel", 500, 50);
		Staat Iran = new Staat("Iran", 300, 30);
		Staat USA = new Staat("USA", 1000, 100);

		while (true) {
			if (Israel.getAnzahlSoldaten() == 0 || USA.getAnzahlSoldaten() == 0 || Iran.getAnzahlSoldaten() == 0) {
				if (Israel.getAnzahlSoldaten() == 0) {
					System.out.println("Isael hat verloren");
					break;
				}
				if (Iran.getAnzahlSoldaten() == 0) {
					System.out.println("Iran hat verloren");
					break;
				}
				if (USA.getAnzahlSoldaten() == 0) {
					System.out.println("USA hat verloren");
					break;
				}
			} else {
				Israel.defend(20);
				Israel.printStatus();
				USA.defend(3);
				USA.printStatus();
				Iran.defend(25);
				Iran.printStatus();
			}
		}

	}

}
