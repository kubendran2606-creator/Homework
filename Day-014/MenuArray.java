import java.util.Scanner;
class MenuArray
{
    public static void main(String[] args) 
	{

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        int choice;

        do {
            System.out.println("1. Insert elements");
            System.out.println("2. Display elements");
            System.out.println("3. Count Even numbers");
            System.out.println("4. Count Odd numbers");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) 
			{

                case 1:
                    System.out.println("Enter elements:");
                    for (int i = 0; i < size; i++)
					{
                        arr[i] = sc.nextInt();
                    }
                    break;

                case 2:
                    System.out.println("Array elements:");
                    for (int i = 0; i < size; i++) 
					{
                        System.out.print(arr[i] + " ");
                    }
                    System.out.println();
                    break;

                case 3:
                    int even = 0;
                    for (int i = 0; i < size; i++) 
					{
                        if (arr[i] % 2 == 0) 
						{
                            even++;
                        }
                    }
                    System.out.println("Even count: " + even);
                    break;

                case 4:
                    int odd = 0;
                    for (int i = 0; i < size; i++) 
					{
                        if (arr[i] % 2 != 0) 
						{
                            odd++;
                        }
                    }
                    System.out.println("Odd count: " + odd);
                    break;

                case 5:
                    System.out.println("Program ended.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 5);

        sc.close();
    }
}