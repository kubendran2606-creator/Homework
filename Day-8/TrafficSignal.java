class TrafficSignal
{
	public static void main(String[] args)
	{
		char signal = 'G';
		
		switch (signal)
		{
			case 'R'->
				System.out.println("STOP");
				
			case 'Y'->
				System.out.println("STOP");
				
			case 'G'->
				System.out.println("STOP");
				
			default ->
				System.out.println("Invalid Signal");
				
		}
	}
}