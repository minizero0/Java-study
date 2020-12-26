package practice4;

public class Person {
	
	String personName;
	int money;
	
	public Person(String name, int money) {
		this.personName = name;
		this.money = money;
	}
	
	public void takeBus(Bus bus) {
		bus.takeBus(1000);
		this.money -= 1000;
	}
	
	public void takeSubway(Subway subway) {
		subway.takeSubway(1500);
		this.money -= 1500;
	}

	
	public void showInfo() {
		System.out.println("you:" + personName + "money:" + money);
	}
}
