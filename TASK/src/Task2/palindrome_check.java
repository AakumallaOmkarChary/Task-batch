package Task2;

public class palindrome_check {
	public void palindrome_check()
	{
		String str = "dad ";
		String rev = "";
		 for(int i=str.length()-1;i>=0;i--)
		 {
			rev = rev +str.charAt(i);
		 }
		 System.out.println("riverse "+ rev);
		 if (str.equals(rev))
			 System.out.println("palindrome");
		 else 
			 System.out.println("not a palindrome ");
		
		
		
		
	}
	

}
