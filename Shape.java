package TrainingHomeWork;

import java.util.Scanner;

public class Shape {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Shape's Lenth l = ");
		int l = scan.nextInt();
		System.out.println("Enter the Shape's Width w = ");
		int w = scan.nextInt();
		recSqr(l,w);
	}
	private static void recSqr(int l, int w) {
		
	if (l!=w) {
		System.out.println("Rectangle is the shape for given parameters");
	}else {
		System.out.println("Square is the shape for given parameters");
		
		}
		
	}
}


