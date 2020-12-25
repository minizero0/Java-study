package practice3;

public class Tea {

	String teaName;
	int money;
	int personCount;
	public Tea(String name) {
		this.teaName=name;
		
	}
	
	public void takeTea(int money) {
		this.money += money;
		this.personCount++;
	}
	
	public void showInfo() {
		System.out.println("today customer:" + personCount + "today benefit:" + money);
	}
}
