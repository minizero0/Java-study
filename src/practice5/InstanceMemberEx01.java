package practice5;
import java.util.Scanner;
public class InstanceMemberEx01 {
		int a, b;
		
		public InstanceMemberEx01 (int a, int b) {
			this.a = a;
			this.b = b;
		}
		
		public void sum() {
			int sum = 0;
			if(a<b) {
				for(int i= a; i <=b; i++) {
					sum += i;
				}
			}else {
					for(int i=b; i<=a; i++) {
						sum += i;
					}
				}
			System.out.println(sum);
				
			}
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("2개의 정수 입력");
		int a = sc.nextInt();
		int b = sc.nextInt();
		InstanceMemberEx01 im = new InstanceMemberEx01(a, b);
		im.sum();
		
		
		
		
	}

}
