import java.util.Scanner;

class FibonacciMain 
{

    public static void main(String args[]) 
	{

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        Fibonacci f = new Fibonacci();

        f.printSeries(n);

    }

}