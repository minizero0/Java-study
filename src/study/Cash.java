package study;

public class Cash {
	
	public static void main(String[] args) {
		
		Student Jo = new Student("Jo", 10000);
		
		Bus bus100 = new Bus(152);
		Subway subway2 = new Subway(2);
		
		Jo.takeBus(bus100);
		Jo.takeSubway(subway2);
		
		Jo.showInfo();
		bus100.showInfo();
		subway2.showInfo();
	}

}
