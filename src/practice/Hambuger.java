package practice;

public class Hambuger {
	
	String hambugerName;
	int personCounter;
	int money;
	
	public Hambuger() {}
	
	public Hambuger(String name) {
		this.hambugerName = name;
	}
	
	public void take(int money) {
		this.money += money;
		personCounter++;
	}
	public void showInfo() {
		System.out.println("오늘 손님"+personCounter+"명 총 수익"+money);
	}

}
