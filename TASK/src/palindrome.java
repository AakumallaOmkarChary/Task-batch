
public class palindrome {
	
		public static void main (String args [])
		{
		 String str = "DAD ";
		 String rev =  " ";
		for(int i = str.length()-1; i>= 0 ;i--)
		{
		  rev = rev + str.charAt(i);
		}
		System.out.println("reverse" + rev);
		if (str.equals(rev))
		System.out.println("pallindrome ");
		else 
		System.out.println("not a palindrome");
		}
		


}
