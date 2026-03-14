package practice;

public class Wuerfelspiel {
	
//	import java.util.ArrayList;
//	import java.util.List;
//
//	// 1. ASSOZIATION (Lose Verbindung: Dozent kennt Kurs, aber Kurs existiert ohne ihn)
//	class Dozent {
//	    String name;
//	    public Dozent(String name) { this.name = name; }
//	}
//
//	class Kurs {
//	    String titel;
//	    Dozent dozent; // Dozent kann auch null sein oder wechseln
//
//	    public Kurs(String titel) { this.titel = titel; }
//	    public void setDozent(Dozent d) { this.dozent = d; }
//	}
//
//	// 2. AGGREGATION (Teile-Ganzes: Team hat Spieler, aber Spieler existiert ohne Team)
//	class Spieler {
//	    String name;
//	    public Spieler(String name) { this.name = name; }
//	}
//
//	class Team {
//	    String name;
//	    List<Spieler> mitglieder; // Team enthält Spieler
//
//	    public Team(String name) {
//	        this.name = name;
//	        this.mitglieder = new ArrayList<>(); // Aggregation
//	    }
//	    public void addSpieler(Spieler s) { this.mitglieder.add(s); }
//	}
//
//	// Hauptprogramm
//	public class Main {
//	    public static void main(String[] args) {
//	        // Assoziation Anwendung
//	        Dozent d = new Dozent("Dr. Müller");
//	        Kurs k = new Kurs("Informatik");
//	        k.setDozent(d); // Verbindung wird hergestellt
//
//	        // Aggregation Anwendung
//	        Spieler s1 = new Spieler("Max");
//	        Team t = new Team("FC Bayern");
//	        t.addSpieler(s1); // Spieler gehört zum Team, existiert aber unabhängig
//	    }
//	}


}
