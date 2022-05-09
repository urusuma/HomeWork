package TrainingHomeWork;
import java.util.*;


public class LowUp {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter a character from a to z ");
		char c = obj.next().charAt(0);
		int ascii = c;
		LowerUpperCase(ascii);
		} 
	private static void LowerUpperCase(int ascii) {
	
		if (ascii>=65 && ascii<=90) {
			System.out.println("Entered character is Upper Case: ");
		} else if(ascii>=97 && ascii<=122){
			System.out.println("Entered character is Lower Case: ");
		} else {
			System.out.println("Entered character is not an Alphabet: ");
		}
	}

}
