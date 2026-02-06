class MovieTicketPrice
{
	public static void main(String[] args)
	{
		int age = 21;
		
		if(age<12)
		{
			System.out.println("Ticket price:80");
		}
		else if((age>=12)&&(age<=59))
		{
			System.out.println("Ticket price:150");
		}
		else if(age>=60)
		{
			System.out.println("Ticket price:100");
		}
		else
			System.out.println("Invalid Age");
	}
}