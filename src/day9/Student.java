package day9;

public class Student {
	
	private static int serialNum = 10000;
	
	int studentID;
	String studentName;
	
	public Student() {
		serialNum++;
		studentID = serialNum;
	}

	public static int getSerialNum() {
		int i = 10;
		i++;
		System.out.println(i);
		
		studentName = "das";
		return serialNum;
	}

//	public static void setSerialNum(int serialNum) {
//		Student.serialNum = serialNum;
//	}
	
	
}
