package array;

public class ArrayTest5 {

	public static void main(String[] args) {
		int[] arr = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int total = 0;
		for(int i =0; i<10; i++) {
			total += arr[i];
		}
		System.out.println(total);
	
	}
}
