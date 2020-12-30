package study;

public class Bus {
	int busNumber;
	int money;
	int person;
	
	public Bus(int BusNumber) {
		this.busNumber = BusNumber;
	}
	
	public void takeBus(int money) {
		this.money += money;
		person++;
	}
	
	public void showInfo() {
		System.out.println(busNumber + "버스의 승객은" + person + "명 입니다.  수익은 " + money + "입니다." );
	}

}
