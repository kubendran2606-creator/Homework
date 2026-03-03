class SwapPassbyRef
{
	void swap(int x,int y)
	{
		int temp = x;
		x = y;
		y = temp;
		
		System.out.println("After Swapping");
		System.out.println("a=" +x);
		System.out.println("b=" +y);
		
	}
	
	public static void main(String[] args)
	{
		int a = 10;
		int b = 20;
		
		SwapPassbyRef obj = new SwapPassbyRef();
		obj.swap(a,b);
	}
}