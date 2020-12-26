package practice4;

public class Subway {
	String subwayName;
	int money;
	int people;
	
	public Subway(String name) {
		this.subwayName = name;
	}
	
	public void takeSubway(int money) {
		this.money += money;
		people++;
	}
	public void showInfo() {
		System.out.println("people:"+people+"money:"+money);
	}

}
