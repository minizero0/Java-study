package practice;

public class Pasta {
	
	String pastaName;
	int personCounter;
	int money;
	
	public Pasta() {}
	
	public Pasta(String name) {
		this.pastaName = name;
	}
	
	public void take(int money) {
		this.money += money;
		personCounter++;
	}
	
	public void showInfo() {
		
		System.out.println("오늘 손님은 " + personCounter + "명 이며 총 수익은" + money + "입니다.");
	}

}
