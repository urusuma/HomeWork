package TrainingHomeWork;

import java.util.Scanner;
import java.math.*;

//Two numbers are entered through the keyboard from console . Write a program to find the value of one number raised to the power of another.

public class RaisedPower {

	public static void main(String[] args) {  
		Scanner input1 = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = input1.nextInt();
		Scanner input2 = new Scanner(System.in);
		System.out.println("Enter another number");
		int b = input2.nextInt();
	
		System.out.println(Math.pow(a,b));
		
			}

}
