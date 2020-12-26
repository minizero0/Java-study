package practice4;

public class Bus {
	
	String busName;
	int money;
	int people;
	
	public Bus(String name) {
		this.busName = name;
	}
	
	public void takeBus(int money) {
		this.money += money;
		people++;
	}
	public void showInfo() {
		System.out.println("people:"+people+"money:"+money);
	}

}
