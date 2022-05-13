package TrainingHomeWork;
import java.util.*;

//Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered. 


public class CountPosNegZeros {

	public static void main(String[] args) {
		 int pos=0, neg=0, zero=0;
		 int[] arr = new int[5];
	      	Scanner input = new Scanner(System.in);
	        System.out.print("Enter 5 Numbers: ");
	     int i;
	     for( i=0; i<5; i++)
	         arr[i] = input.nextInt();
	      
	     for(i=0; i<5; i++) {
	    	 if(arr[i]>0)
	            pos++;
	         else if(arr[i]<0)
	            neg++;
	         else
	            zero++;
	      }
	      
	      System.out.println("Total of given Positive Numbers: " + pos);
	      System.out.println("Total of given Negative Numbers: " + neg);
	      System.out.println("Total of given Zeros: " + zero);
	}

}
