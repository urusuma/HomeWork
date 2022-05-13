package TrainingHomeWork;

/*Write a do-while loop that asks the user to enter two numbers. The numbers should be added and the sum displayed. 
The loop should ask the user whether he/she wishes to perform the operation again. 
If so, the loop should repeat; otherwise it should terminate. */

import java.util.*;

public class SumDoWhile {
	

	public static void main(String[] args) {
			
			Scanner input1 = new Scanner(System.in);
			System.out.println("Enter a number");
			int a1 = input1.nextInt();
			Scanner input2 = new Scanner(System.in);
			System.out.println("Enter another number");
			int b1 = input2.nextInt();
			mymethod(a1,b1);
			
			}
	 public static void mymethod(int a2, int b2) {
		 int sum = a2 + b2;
		 
		do{
			System.out.println("Sum of the numbers is " + sum);
			Scanner input3 = new Scanner(System.in);
			System.out.println("Would you like to continue? ");
			String c1 = input3.next();	
			
		}
	
		while (sum<=0);
		
	}

}
