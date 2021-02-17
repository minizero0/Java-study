package practice6;
import java.util.Scanner;

public class Eee {
	
	public static int factorial(int number) {
		if (number ==1)
			return 1;
		else 
			return number * factorial(number-1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1개의 정수 입력");
		int number = sc.nextInt();		
		System.out.println(factorial(number));
		
		
	}

}
