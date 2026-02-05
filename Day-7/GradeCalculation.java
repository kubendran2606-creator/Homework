class GradeCalculation
{
	public static void main(String[] args)
	{
		int mark = 82;
		
		if((mark>=90)&&(mark<=100))
		{
			System.out.println("A Grade");
		}
		else if((mark>=75)&&(mark<90))
		{
			System.out.println("B Grade");	
		}
		else if((mark>=50)&&(mark<75))
		{
			System.out.println("C Grade");	
		}
		else if((mark>=0)&&(mark<50))
		{
			System.out.println("fail");	
		}
		else
		{
			System.out.println("Invalid Mark");	
		}
		
	}
}