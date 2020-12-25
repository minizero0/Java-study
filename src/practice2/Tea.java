package practice2;

public class Tea {
	String teaName;
	int money;
	int customer;
	public Tea(String name) {
		this.teaName = name;
	}
	public void takeTea(int money) {
		this.money += money;
		customer++;
	}
	public void showInfo() {
		System.out.println("손님:" + customer + ", 수익:" + money);
	}

}
