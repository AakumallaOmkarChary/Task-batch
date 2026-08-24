package Task2;
import java.util.Scanner;

public class Even_odd {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the NUmber: ");
		int num = scanner.nextInt();
		if(num%2!=0) {
			System.out.println("the number "+num +" is odd");
		}
		else {
			System.out.println("the number "+num +" is Even");
		}
		
	}
	

}
