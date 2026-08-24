package Task2;

public class to_check_armstrong {
public void to_check_armstrong()
{
 int  num = 153;
 int temp = num;
 int sum = 0 ;
 while (temp > 0)
 {
	 int digit = temp % 10; // get last digit 
	 sum= sum +( digit*digit*digit);
	 temp =temp / 10 ; // remove last digit 
 }if (sum == num )
	 System.out.println(num +" armstrong");
 else 
	 System.out.println(num +" not an armstrong ");
}
}
