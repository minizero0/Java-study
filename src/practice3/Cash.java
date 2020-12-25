package practice3;

public class Cash {

	public static void main(String[] args) {
		
		Person Jo = new Person("Jo", 10000);
		Person Lee = new Person("Lee", 20000);
		
		
		Coffee Ame = new Coffee("Ame");
		Jo.takeCoffee(Ame);
		Jo.showInfo();
		Ame.showInfo();
		
		Tea Black = new Tea("Black");
		Lee.takeTea(Black);
		Lee.showInfo();
		Black.showInfo();
		
		
	}
}
