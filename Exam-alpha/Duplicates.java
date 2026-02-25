import java.util.Scanner;

class Duplicates
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array length: ");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		
		System.out.println("Enter " + n + " integer elements:");
        for (int i =0; i<arr.length; i++) 
		{
            arr[i] = sc.nextInt();     
        }
		
		System.out.println("Elements without Duplicates");
		
		for(int i = 0;i<arr.length;i++)
		{
			boolean duplicate = false;
			
			for(int j=0;j<i;j++)
			{
				if(arr[i]==arr[j])
				{
					duplicate=true;
					break;
				}
			}
			if(!duplicate)
			{
				System.out.println(arr[i] +" ");
			}
		}
		sc.close();
		
	}
}