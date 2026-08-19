
public class ifelse {

	/*public static void main(String[] args) {
		int age = 2;
		if(age>18) {
			
			System.out.println("eligible for voiting");

	}else
		System.out.println("not eligible for voting");

}

}*/
	int age;
	void checkvoitingeligibility()
	{
		if (age >= 18)
		{
			System.out.println("eligible for voting");
		}else
		{
			System.out.println("not eligible for voting ");
		}
	}
	 public static void main(String args[])
	 {
		 ifelse obj = new ifelse();
		 obj.age =20;
		 obj.checkvoitingeligibility();
	 }
	
	
	}