class FactorialNumber
{
	public static void main(String[] args)
	{
		int i = 1;
		int num = 7;
		int fact = 1;
		
		for(i=1;i<=num;i++)
		{
			fact = fact*i;
		}
		
		System.out.println("Factorial of 7 ="+fact);
	}
}