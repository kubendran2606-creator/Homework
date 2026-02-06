class MobileBatteryStatus
{
	public static void main(String[] args)
	{
		int bp = 25;
		
		if(bp>=80)
		{
			System.out.println("Battery full");
		}
		else if((bp>=30)&&(bp<=79))
		{
			System.out.println("Battery full");
		}
		else if(bp<30)
		{
			System.out.println("Low Battery-Charge Now");
		}
		else
		{
			System.out.println("Invalid Battery Percentage");
		}
	}
}