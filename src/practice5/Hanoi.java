package practice5;
import java.util.Scanner;

public class Hanoi {
	
	public static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sb.append((int) (Math.pow(2, n)-1)).append('n');
		System.out.println(sb);
		
		
	}
	
	public static void Hanoi(int n, int start, int mid, int to) {
		
		if(n==1)
			sb.append(start + "" + to +"ln");
		else
			Hanoi(n-1, start, to, mid);
			sb.append(start + "" + to +"ln");
			Hanoi(n-1, mid, start, to);
			
			
	}



}
