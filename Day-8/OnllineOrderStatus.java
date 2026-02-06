class OnllineOrderStatus
{
	public static void main(String[] args)
	{
		char Order = 'D';
		
		switch(Order)
		{
		case 'P'->
		System.out.println("Order Placed");
		
		case 'S'->
		System.out.println("Shipped");
		
		case 'D'->
		System.out.println("Delivered");
		
		case 'C'->
		System.out.println("Cancelled");
		
		default->
		System.out.println("Invalid Order");
		}
	}
}