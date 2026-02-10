import java.util.Scanner;
class GarmentShop
{
	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
	
		System.out.println("Welcome to GarmentShop");
		System.out.println("1.Men");
		System.out.println("2.Women");
		System.out.println("3.Kids");
		System.out.print("Enter your choice:");
		
		int category = sc.nextInt();
		
		switch(category)
		{
		
			case 1:
			{
				System.out.println("Welcome to Men section");
				System.out.println("1.Shirt");
				System.out.println("2.Pant");
				System.out.println("3.T-shirts");
				System.out.print("Enter your dresstype:");
				
				int dresstype = sc.nextInt();
				
				if(dresstype==1)
				{
					System.out.println("1.Shirt-Rs.1200");
				}
				else if(dresstype==2)
				{
					System.out.println("2.Pant-Rs.1500");
				}
				else if(dresstype==3)
				{
					System.out.println("3.T-shirs-Rs.800");
				}
				else
				{
					System.out.println("Not Available");
				}
				break;
			}
				case 2:
			{
				System.out.println("Welcome to Women section");
				System.out.println("1.Saree");
				System.out.println("2.Chudidhar");
				System.out.println("3.Kurti");
				System.out.print("Enter your dresstype:");
				
				int dresstype = sc.nextInt();
				
				if(dresstype==1)
				{
					System.out.println("1.Saree-Rs.2500");
				}
				else if(dresstype==2)
				{
					System.out.println("2.Chudidhar-Rs.1800");
				}
				else if(dresstype==3)
				{
					System.out.println("3.Kurti-Rs.1400");
				}
				else
				{
					System.out.println("Not Available");
				}
				break;
			}
				case 3:
			{
				System.out.println("Welcome to Kids section");
				System.out.println("1.Frock");
				System.out.println("2.Shorts");
				System.out.println("3.Night Wear");
				System.out.print("Enter your dresstype:");
				
				int dresstype = sc.nextInt();
				
				if(dresstype==1)
				{
					System.out.println("1.Frock-Rs.900");
				}
				else if(dresstype==2)
				{
					System.out.println("2.Shorts-Rs.600");
				}
				else if(dresstype==3)
				{
					System.out.println("3.Night wear-Rs.1000");
				}
				else
				{
					System.out.println("Not Available");
				}
				break;
			}
				default:
				   System.out.println("Not Available this category");
				
				
			
			
		}
        
	}
}