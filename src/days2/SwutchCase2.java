package days2;

public class SwutchCase2 {

	public static void main(String[] args) {
		int month = 10;
		int day;
		
		switch (month) {
			case 1: case 3: case 5: case 7 : case 8 : case 10 : case 12 : 
				day = 31;
				break;
			case 2: 
				day = 28;
				break;
			
			case 4: 
				day = 30;
				break;
			
			case 6: 
				day = 30;
				break;
			default :
				day = 0;
				break;
		}
		System.out.println(month + "월달은 " + day + "일 까지 입니다");
	}

}
