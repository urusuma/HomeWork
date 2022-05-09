package TrainingHomeWork;
import java.util.*;

public class OldYoung {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter person X's age = ");
		int x = obj.nextInt();
		System.out.println("Enter person Y's age = ");
		int y = obj.nextInt();
		System.out.println("Enter person Z's age = ");
		int z = obj.nextInt();
		Older(x, y, z);
		Younger(x, y, z);
	}
	private static void Older(int x, int y, int z) {
		
		if(x>y && x>z)  {
			System.out.println("X is the older person");
		}else if(y>x && y>z) {
			System.out.println("Y is the older person");
		}else if(z>x && z>y){
			System.out.println("Z is the older person");
		}
	}	
	private static void Younger(int x, int y, int z) {
				
				if(x<y && x<z)  {
					System.out.println("X is the younger person");
				}else if(y<x && y<z) {
					System.out.println("Y is the younger person");
				}else if(z<x && z<y){
					System.out.println("Z is the younger person");
				}	
			
	}
		
			
}
			
						
		
		
	