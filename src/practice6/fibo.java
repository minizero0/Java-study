package practice6;

public class fibo {
	
	public static int fibonacci(int n) {
		int one =1;
		int two =1;
		int result = -1;
		if(n==1) {
			return one;
		}
		else if(n==2) {
			return two;
		}
		else 
		{
			for(int i =2; i <n; i++) 
			{
				result = one + two;
				one = two;
				two = result;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(fibonacci(10));
	}

}
