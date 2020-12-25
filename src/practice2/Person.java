package practice2;

public class Person {
	
	String personName;
	int money;
	
	public Person(String name, int money) {
		this.personName = name;
		this.money = money;
	}
	
	public void takeCoffee(Coffee coffee) {
		coffee.takeCoffee(3000);
		this.money -= 3000;
	}
	
	public void takeTea(Tea tea) {
		tea.takeTea(3000);
		this.money -= 3000;
	}
	
	public void showInfo() {
		System.out.println(personName + "님의 남은 금액:" + money);
	}

}
