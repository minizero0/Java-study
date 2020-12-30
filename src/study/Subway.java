package study;

public class Subway {

		int subwayNumber;
		int money;
		int person;
		
		public Subway(int SubwayNumber) {
			this.subwayNumber = SubwayNumber;
		}
		
		public void takeSubway(int money) {
			this.money += money;
			person++;
		}
		
		public void showInfo() {
			System.out.println(subwayNumber + "호선 지하철의 승객은" + person + "명 입니다.  수익은 " + money + "입니다." );
		}

}
