 package Task2;
 import java.util.Scanner;

public class palindrome_check {
	public static void main(String[]args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int number = scanner.nextInt();
		
		int reverse = 0;
		int originalNumber = number;
		
		while(number!=0) {
			int digit = number%10;
			reverse = reverse*10+digit;
			number = number/10;
		}
		if(reverse == originalNumber) {
			System.out.println("It is a palindrone NUmber");
		}
		else {
			System.out.println("It is Not a palindrone Number");
		}
		scanner.close();
		
	}
	

}
