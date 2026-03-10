class PrimeCheck
{

    void checkPrime(int n)
	{

        int count = 0;

        for(int i = 1; i <= n; i++) 
		{

            if(n % i == 0) 
			{
                count++;
            }

        }

        if(count == 2)
            System.out.println(n + " is Prime");
        else
            System.out.println(n + " is Not Prime");
    }

}