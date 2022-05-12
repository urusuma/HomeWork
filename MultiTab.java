package TrainingHomeWork;
//Write a program that prompts the user to input a positive integer. It should then print the multiplication table of that number.

import java.math.*;
import java.util.*;

public class MultiTab {
	public static void main(String[] args) {
				Scanner input = new Scanner(System.in);
					System.out.println("Enter a positive number");
					int x = input.nextInt();
					
				for(int y=1; y <= 10; y++) {
					int multiple = x*y;
					System.out.println(multiple);
				}
	}

}
