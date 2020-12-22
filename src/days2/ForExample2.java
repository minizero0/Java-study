package days2;

public class ForExample2 {

	public static void main(String[] args) {
		int num;
		int sum;
		for(num= 1; num<=9; num++) {
			if((num%2)==1)
				continue;
			for(sum=1; sum<=9; sum++) {
				if(sum>num)
					break;
				System.out.println(num + "X" + sum + "=" + num*sum);	
			}
			System.out.println();
		}
	}
}
