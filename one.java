
package 
import java.util.Scanner;

public class one {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("년의 월을 입력");
		int month = input.nextInt();
		
		switch(month){
		case 1 : 
		case 2 :
		case 3 : 
			System.out.printf("%d월은 1분기입니다.",month);
			break;
		case 4 : 
			System.out.printf("%d월은 1분기입니다.",month);
			break;
		case 7 : case 8 : case 9 :
			System.out.printf("%d월은 1분기입니다.",month);
			break;
		case 10 : case 11 : case 12 : 
			System.out.printf("%d월은 1분기입니다.",month);
			break;
		
		}
			
	}

}
