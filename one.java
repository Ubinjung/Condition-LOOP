
package 
import java.util.Scanner;

public class one {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("���� ���� �Է�");
		int month = input.nextInt();
		
		switch(month){
		case 1 : 
		case 2 :
		case 3 : 
			System.out.printf("%d���� 1�б��Դϴ�.",month);
			break;
		case 4 : 
			System.out.printf("%d���� 1�б��Դϴ�.",month);
			break;
		case 7 : case 8 : case 9 :
			System.out.printf("%d���� 1�б��Դϴ�.",month);
			break;
		case 10 : case 11 : case 12 : 
			System.out.printf("%d���� 1�б��Դϴ�.",month);
			break;
		
		}
			
	}

}
