package day4;

class Person{
	String name;
	int age;
	
	public Person() {
	
		this("이름없음", 1);
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public Person resturnSelf() {
		return this;
	}
}




public class CallAnotherConst {
	public static void main(String[] args) {
		
		Person A = new Person();
		System.out.println(A.resturnSelf());
		
	}

}
