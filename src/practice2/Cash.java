package practice2;

public class Cash {
	public static void main(String[] args) {
	
	Person Jo = new Person("Jo", 10000);
	
	Coffee ameri = new Coffee("ameri");
	Jo.takeCoffee(ameri);
	Jo.showInfo();
	ameri.showInfo();
	
	Tea greenTea = new Tea("greenTea");
	Jo.takeTea(greenTea);
	Jo.showInfo();
	greenTea.showInfo();	
	
	
	}

}
