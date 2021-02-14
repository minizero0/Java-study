package practice5;

public class Array {

	public static void main(String[] args) {
		
		
		int[] a = new int[3];
		int sum =0;
		a[0] =1;
		a[1] =2;
		a[2] =3;
		for(int i=0; i<3; i++) {
			sum += a[i];
			
		}
		System.out.println(sum);
	}

}
