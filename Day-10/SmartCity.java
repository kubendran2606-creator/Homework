	import java.util.Scanner;

	class SmartCity
	{
		public static void main(String[] args)
		{
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Welcome to Smart City");
			System.out.println("1.Electricity Bill");
			System.out.println("2.Water Bill");
			System.out.println("3.Internet Plan");
			System.out.println("4.Exit");
			System.out.print("Enter your choice:");
			
			int option = sc.nextInt();
			
			switch(option)
			{
				case 1:
				{
					System.out.print("Enter number of units:");
					
					int units = sc.nextInt();
					int bill = 0;
					
					if(units<=100)
					{
						bill = units*2;
					}
					else if(units<=300)
					{
						bill = units*3;
					}
					else if(units>300)
					{
						bill = units*5;
					}
				
					System.out.println("Electricity Bill = Rs." + bill);
					
					break; 
					
					
				}
				case 2:
				{
					System.out.println("Select House Type");
					System.out.println("1.Apartment");
					System.out.println("2.Individual House");
					System.out.print("Enter your house type:");
					
					int housetype = sc.nextInt();
					
					if(housetype==1)
					{
						System.out.println("Monthly Charge-Rs.300");
					}
					else if(housetype==2)
					{
						System.out.println("Monthly Charge-Rs.500");
					}
					else
					{
						System.out.println("Invalid Housetype");
					}
					break;
				}
				
				case 3:
				{
					System.out.println("Select your plan");
					System.out.println("1.Basic plan");
					System.out.println("2.Standard plan");
					System.out.println("3.Premium plan");
					System.out.print("Enter plan choice:");
					
					int plan = sc.nextInt();
					
					if(plan==1)
					{
						System.out.println("Monthly Charge-Rs.399");
					}
					else if(plan==2)
					{
						System.out.println("Monthly Charge-Rs.699");
					}
					else if(plan==3)
					{
						System.out.println("Monthly Charge-Rs.999");
					}
					else
					{
						System.out.println("Invalid Internet Plan");
					}
					break;
					
				}
				
				case 4:
				{
					System.out.println("Thank you for using Smart City Utility System");
					break;
				}
				
				default:
					System.out.println("Invalid Option");
					
					

			}
			sc.close();
		}
	}