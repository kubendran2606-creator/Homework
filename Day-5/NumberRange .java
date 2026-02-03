class NumberRange 
{
    public static void main(String[] args) 
	{

        int number = 35;

        
        boolean inRange = (number >= 10) && (number <= 50);

        
        System.out.println(inRange && true ? "Number is in range" : "Number is out of range");
    }
}