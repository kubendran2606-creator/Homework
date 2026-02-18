class AverageArray
{
	public static void main(String[] args)
	{
		int marks[] ={88,91,95,90,85};
		int sum=0;
		
		for(int i=0;i<marks.length;i++)
		{
			sum+=marks[i];
		}
		
		int avg = sum/marks.length;
		System.out.print("THE AVERAGE IS: "+avg+"%");
	}
}