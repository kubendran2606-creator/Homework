import java.util.Scanner;

class Dowhileloop
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Number:");
		
		int num = sc.nextInt();
		int i = 1;
		
		do
		{
			System.out.println(i);
			if(i==num)
			{
				
				break;
			}
			i++;
			
		}while(true);
		
		sc.close();
	}
}