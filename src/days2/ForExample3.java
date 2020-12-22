package days2;

public class ForExample3 {

	public static void main(String[] args) {
		int num;
		int num2;
//		for(num =1; num< 10; num++) {
//			for(num2 = 0; num2 < num; num2 ++) {
//				System.out.print('*');
//			}
//			System.out.println();
//		}

		for(num =0; num <10; num ++) {
			for(num2 =0;num2<9-num;num2++) {
				System.out.print(" ");
			}
			for(num2=0; num2<2*num+1;num2++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
