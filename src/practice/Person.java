package practice;

public class Person {
	String personName;
	int money;
	
	
	public  Person(String name, int money) {
		this.personName = name;
		this.money= money;
	}
	
	public void takeHambuger(Hambuger hambuger) {
		hambuger.take(5000);
		this.money -= 5000;
	}
	public void takePasta(Pasta pasta) {
		pasta.take(5000);
		this.money -= 5000;
	}
	
	public void showInfo() {
		System.out.println(personName + "님의 남은돈" + money + "입니다.");
	}

}
