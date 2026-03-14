package practice;

public class W03_Player {

	private final String name;
	private final W03_Dice dice;
	private int HP;

	public W03_Player(String name, int HP) {
		this.name = name;
		this.HP = HP;
		dice = new W03_Dice();
	}

	public int rollTheDice() {
		return dice.rollTheDice();
	}

	public String getName() {
		return name;
	}

	public int getHP() {
		return HP;
	}

	public void reduceHP(int points) {
		HP -= points;
	}

}
