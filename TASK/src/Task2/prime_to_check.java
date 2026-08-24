package Task2;

public class prime_to_check {
	public void prime_to_check()
	{
		int num =8;
		int count =0;
		for(int i =1;i<= num;i++)
		{
			if(num%i==0)
				count++;
		}if(count==2)
			System.out.println("ia a prime ");
		else 
			System.out.println("is not a prime ");
	}

}
