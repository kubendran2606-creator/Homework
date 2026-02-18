import java.util.Scanner;
class MaxElement
{
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the Array length: ");
		int length = sc.nextInt();
		
		int arr[]= new int[length];
		int max =0;
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print("ENTER THE "+i+ "th INDEX VALUE: ");
			arr[i]=sc.nextInt();
		}
		
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			max=arr[i];
		}
		System.out.print("Maximum Element is : "+max);
	}
}