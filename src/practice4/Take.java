package practice4;

public class Take {
	
	public static void main(String[] args) {
		
		Person Jo = new Person("Jp", 10000);
		
		Bus bus152 = new Bus("Bus");
		Jo.takeBus(bus152);
		Jo.showInfo();
		bus152.showInfo();
	}

}
