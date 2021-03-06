package day3;

public class Student {
	int studentID;
	String studentName;
	Subject korea;
	Subject math;
	Subject excercise;
	
//	public Student() {
//		korea = new Subject();
//		math = new Subject();
//	}
	public Student(int id, String name) {
		studentID = id;
		studentName = name;
		
		korea = new Subject("국어");
		math = new Subject("수학");
		excercise = new Subject("체육");
	}
	
	public void setKorea(int score) {
		korea.setScore(score);
	}
	
	public void setMath(int score) {
		math.setScore(score);
	}
	
	public void setExcercise(int score) {
		excercise.setScore(score);
	}
	
	public void showStudentInfo() {
		int total = korea.getScore() + math.getScore() + excercise.getScore();
		System.out.println(studentName + "학생의 총점은 "+ total);
	}
}
