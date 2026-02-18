	import java.util.Scanner;

	class Calculator 
	{

		
		int add(int a, int b) 
		{
			return a + b;
		}

		
		int subtract(int a, int b) 
		{
			return a - b;
		}

		
		int multiply(int a, int b) 
		{
			return a * b;
		}

		
		int divide(int a, int b) 
		{
			if (b == 0) 
			{
				System.out.println("Error: Division by zero is not allowed!");
				return 0; 
			}
			return a / b;
		}

		
		void displayMenu() 
		{
			System.out.println(" Select an operation:");
			System.out.println("1 .Addition");
			System.out.println("2 .Subtraction");
			System.out.println("3 .Multiplication");
			System.out.println("4 .Division");
			System.out.println("5 .Exit");
		}

		public static void main(String[] args) 
		{
			Scanner sc = new Scanner(System.in);
			Calculator cal = new Calculator(); // create object to call non-static methods
			int choice;

			do 
			{
				cal.displayMenu();
				System.out.print("Enter your choice: ");
				choice = sc.nextInt();

				if (choice >= 1 && choice <= 4) 
				{
					System.out.print("Enter first number: ");
					int num1 = sc.nextInt();
					System.out.print("Enter second number: ");
					int num2 = sc.nextInt();

					int result = 0;

					switch (choice) 
					{
						case 1:
							result = cal.add(num1, num2);
							System.out.println("Result: " + result);
							break;
						case 2:
							result = cal.subtract(num1, num2);
							System.out.println("Result: " + result);
							break;
						case 3:
							result = cal.multiply(num1, num2);
							System.out.println("Result: " + result);
							break;
						case 4:
							result = cal.divide(num1, num2);
							if (num2 != 0) 
							{
								System.out.println("Result: " + result);
							}
							break;
					}
				} 
				else if (choice == 5) 
				  {
					System.out.println("Exiting calculator. Goodbye!");
				  }
				  else 
				  {
					System.out.println("Invalid choice! Please select 1-5.");
				  }

			} while (choice != 5);

			sc.close();
		}
	}