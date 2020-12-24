package day4;

public class TakeTrans {

	public static void main(String[] args) {
		Student james = new Student("james", 5000);
		Student tomas = new Student("tomas", 15000);
		
		Bus bus100 = new Bus(100);
		james.takeBus(bus100);
		james.showInfo();
		bus100.showInfo();
		
		Subway line2 = new Subway(2);
		tomas.takeSubway(line2);
		tomas.showInfo();
		line2.showInfo();
		
	}
}
