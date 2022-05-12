package TrainingHomeWork;
//find the factorial value of any number entered through the keyboard.
import java.util.Scanner;

public class FactorialEx {

	public static void main(String[] args) {
     int a;
     Scanner input = new Scanner(System.in);
     System.out.println("Enter a number");
     int n = input.nextInt();
     int fact = 1;
        for(a=1; a<=n; a++) {
    	 fact = fact*a;
    	 
     }
System.out.println("Factorial of " + n + " is " + fact);

	}

}
