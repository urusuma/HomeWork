package TrainingHomeWork;
/* Write a program that asks the user to input an integer from console and then outputs the number with the digits reversed. 
 * For example, if the input is 12345, the output should be 54321.
 */

import java.util.Scanner;

public class ReverseNo {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.println("Enter a muntidigit number");
		int number = input.nextInt();
		int reverse = 0;
		while(number!=0) {
			int remainder = number % 10;
			number = number/10;	
			reverse = reverse* 10 + remainder;
					
			
		}
		System.out.println("The reverse of the given number is " + reverse);
	}

}
