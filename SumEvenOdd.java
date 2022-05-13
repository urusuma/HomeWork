package TrainingHomeWork;
//Write a program that reads a set of integers, and then prints the sum of the even and odd integers.(separate sum for odd and even numbers )
import java.util.*;

public class SumEvenOdd {

	public static void main(String[] args) {
		
		int arr[]= {5,8,-3,-1,2};
		int sumOfpos = 0;
		int sumOfneg =0;
		
		for (int i: arr) {
			if(i>0) {
			System.out.println(i);
			sumOfpos += i;
			
			}else if(i<0) {
				System.out.println(i);
			sumOfneg += i;
			
		}
			
		}
		System.out.println("Sum of positive number in the array is " + sumOfpos);
		System.out.println("Sum of negative number in the array is " + sumOfneg);
			
	}
}
		
			

