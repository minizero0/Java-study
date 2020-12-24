package day4;

public class Subway {

	int lineNumber;
	int PersonCounter;
	int money;
	
	public Subway(int lineNumber) {
		this.lineNumber = lineNumber;
	}
	
	public void take(int money) {
		this.money += money;
		PersonCounter++;
	}
	public void showInfo() {
		System.out.println("지하철" + lineNumber + "호선의 승객은" + PersonCounter + "명이고, 수익은" + money + "입니다.");
	}
}
