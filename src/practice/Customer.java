package practice;

public class Customer {
	
	public static void main(String[] args) {
	
		Person Jo = new Person("Jo", 20000);
		Person Lee = new Person("Lee", 30000);
		
		Hambuger shak = new Hambuger("shak");
		Jo.takeHambuger(shak);
		Jo.showInfo();
		shak.showInfo();
		
		Pasta ailo = new Pasta("ailo");
		Lee.takePasta(ailo);
		Lee.showInfo();
		ailo.showInfo();
	}
}
