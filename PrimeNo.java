package TrainingHomeWork;

import java.util.Scanner;

//Find the given number is Prime number or not

public class PrimeNo {
	
	public static void main(String[] args) {
		int num;
		 Scanner scan = new Scanner(System.in);
		 System.out.println("Enter a number ");
		 num = scan.nextInt(); 
		 
		 int i=2, count = 0;
				
 while(i<=num/2) {
 
		if(num % i == 0) {
			count++;
			break;
		 }
		i++;
 }
	if(count == 0) {
	System.out.println(num + " is prime number");
	}
	
	else {
		System.out.println(num + " is not a prime number");
	  }
  }
}
