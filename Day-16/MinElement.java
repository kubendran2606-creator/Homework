import java.util.Scanner;
class MinElement
{
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the Array length: ");
		int length = sc.nextInt();
		
		int arr[]= new int[length];
		
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print("ENTER THE "+i+ "th INDEX VALUE: ");
			arr[i]=sc.nextInt();
		}
		int min =arr[0];
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
			min=arr[i];
		}
		System.out.print("Minimum Element is : "+min);
	}
}