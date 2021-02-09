package array;

public class ArrayTest4 {

	public static void main(String[] args) {
		int[] arr = new int[3];
		arr[0] =1;
		arr[1] = 2;
		arr[2] = 3;
		int total =0;
		for(int i=0; i<3; i++) {
			System.out.println(arr[i]);
			total += arr[i];
		}
		System.out.println(total);
		}

}
