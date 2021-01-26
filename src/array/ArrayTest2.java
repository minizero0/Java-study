package array;

public class ArrayTest2 {

	public static void main(String[] args) {
		double[] arr = new double[5];
		
		arr[0]=10.0;
		arr[1]=20.0;
		arr[2]=30.0;
		
		double total = 0;
		for(int i =0; i<3; i++) {
			System.out.println(arr[i]);
			total += arr[i];
		}
		System.out.println("total =" + total);
	}

}
