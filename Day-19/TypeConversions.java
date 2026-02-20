import java.util.Scanner;
class TypeConversions
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int choice;
		
		do
		{
			System.out.println("   MENU   ");
			System.out.println("1.int -> double");
			System.out.println("2.double -> int");
			System.out.println("3.char -> int");
			System.out.println("4.int -> char");
			System.out.println("5.Exit");
			System.out.print("Enter your choice: ");
			
			choice = sc.nextInt();
			
			switch(choice)
			{
				case 1:
				System.out.print("Enter a int value: ");
				int a = sc.nextInt();
				double b = a;
				System.out.println("Converted double value: "+b);
				break;
				
				case 2:
				System.out.print("Enter a double value: ");
				double c = sc.nextDouble();
				int d =(int)c;
				System.out.println("Converted int value: "+d);
				break;
				
				case 3:
				System.out.print("Enter a character: ");
				char e = sc.next().charAt(0);
				int f = e;
				System.out.println("Converted int value: "+f);
				break;
				
				case 4:
				System.out.print("Enter a int value: ");
				int g = sc.nextInt();
				char h =(char)g;
				System.out.println("Converted char value: "+h);
				break;
				
				case 5:
				System.out.println("Exiting....");
				break;
				
				default:
				System.out.println("Invalid choice");
				
				
			}
			
		}while(choice!=5);
		sc.close();
	}
}