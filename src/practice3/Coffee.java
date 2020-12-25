package practice3;

public class Coffee {
	String coffeeName;
	int money;
	int personCount;
	public Coffee(String name) {
		this.coffeeName=name;
	}
	
	public void takeCoffee(int money) {
		this.money += money;
		this.personCount++;
	}
	
	public void showInfo() {
		System.out.println("today customer:" + personCount + "today benefit:" + this.money);
	}
}
