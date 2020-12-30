package study;

public class Student {
	String studentName;
	int money;

	public Student(String name, int money) {
		this.studentName = name;
		this.money = money;
	}
	
	public void takeBus(Bus bus) {
		bus.takeBus(1000);
		this.money -= 1000;
		
	}
	
	public void takeSubway(Subway bus) {
		bus.takeSubway(2000);
		this.money -= 2000;
		
	}
	
	public void showInfo() {
		System.out.println(studentName + " : "  + money);
	}

}
