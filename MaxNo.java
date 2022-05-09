package TrainingHomeWork;
import java.util.Scanner;

public class MaxNo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Value a = ");
		int a = scan.nextInt();
		System.out.println("Enter a value b = ");
		int b = scan.nextInt();
		gretnum(a,b);
				
	}
	private static void gretnum(int a, int b) {
	
		if (a>b) {
			System.out.println("The greatest number is a = " + a);
		}else {
		System.out.println("The greatest number is b = " + b);
		}
	}
		}

	


