package practice2;

public class Coffee {
	String coffeeName;
	int money;
	int customer;
	public Coffee(String name) {
		this.coffeeName = name;
	}
	public void takeCoffee(int money) {
		this.money += money;
		customer++;
	}
	public void showInfo() {
		System.out.println("손님:" + customer + ", 수익:" + money);
	}

}
