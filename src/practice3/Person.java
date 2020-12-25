package practice3;

public class Person {
	String personName;
	int money;
	
	public Person(String name, int money) {
		this.personName = name;
		this.money = money;
	}
	
	public void takeCoffee(Coffee coffee) {
		coffee.takeCoffee(2000);
		this.money -= 2000;
	}
	
	public void takeTea(Tea tea) {
		tea.takeTea(3000);
		this.money -= 3000;
	}

	public void showInfo() {
		System.out.println("you have" + money + "won");
	}
}
