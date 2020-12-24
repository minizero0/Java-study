package day3;

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentJo = new Student(1, "JO");
		studentJo.setKorea( 100);
		studentJo.setMath( 100);
		studentJo.showStudentInfo();
		
		Student studentLee = new Student(2, "Lee");
		studentLee.setKorea(20);
		studentLee.setMath(30);
		studentLee.setExcercise(40);
		studentLee.showStudentInfo();
		
		Student Ho = new Student(2, "sa");
	Ho.showStudentInfo();
	}
}