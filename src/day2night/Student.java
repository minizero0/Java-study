package day2night;

public class Student {
	int studentID;
	String studentName;
	int grade;
	String address;
	
	public Student(int id, String name) {
		studentID = id;
		studentName = name;
	}
	public Student( ) {}
	
	public void showStudentInfor() {
		System.out.println("이름:"+studentName);
		System.out.println("학번:"+studentID);
		System.out.println("성적:"+grade);
		System.out.println("주소:"+address);
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String name) {
		studentName = name;
	}
	
	public static void main (String[] args) {
		Student studentA = new Student();
		studentA.studentName = "yoengmin";
		studentA.studentID = 1;
		studentA.showStudentInfor();
		
	}
	
	
}


