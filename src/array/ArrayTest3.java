package array;

public class ArrayTest3 {

	public static void main(String[] args) {
		char[] alphabets = new char[26];
		char ch = 'A';
		for(int i =0; i<26; i++, ch++) {
			alphabets[i] = ch;
		}
		for(int i =0; i<26; i++) {
			System.out.println(alphabets[i]);
		}
	}

}
