package TrainingHomeWork;

import java.util.*;

//Display Sum of n Natural Numbers, n should be taken from console.

public class SumOfN {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n = scan.nextInt();
		int sum = 0;
		
		for (int i=1; i<=n; i++) {
			sum+=i;
			System.out.println(sum);
			
		}
	}

}
