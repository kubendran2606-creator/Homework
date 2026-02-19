import java.util.Scanner;

class DailyExpenseTracker 
{

    double[] expenses = new double[100];  // store expenses
    int count = 0;                       // number of expenses added

    // 1. Add Expense
    void addExpense(Scanner sc) 
	{
        if (count >= expenses.length) 
		{
            System.out.println("Storage Full!");
            return;
        }

        System.out.print("Enter expense amount: ");
        expenses[count] = sc.nextDouble();
        count++;

        System.out.println("Expense Added Successfully!");
    }

    // 2. View All Expenses
    void viewExpenses() 
	{
        if (count == 0) 
		{
            System.out.println("No expenses added.");
            return;
        }

        System.out.println("All Expenses:");
        for (int i = 0; i < count; i++) 
		{
            System.out.println(expenses[i]);
        }
    }

    // 3. Calculate Total Expense
    void calculateTotal() 
	{
        if (count == 0) 
		{
            System.out.println("No expenses to calculate.");
            return;
        }

        double total = 0;

        for (int i = 0; i < count; i++) 
		{
            total += expenses[i];
        }

        System.out.println("Total Expense: " + total);
    }

    // 4. Find Highest Expense
    void findHighest() 
	{
        if (count == 0) 
		{
            System.out.println("No expenses available.");
            return;
        }

        double max = expenses[0];

        for (int i = 1; i < count; i++) 
		{
            if (expenses[i] > max) 
			{
                max = expenses[i];
            }
        }

        System.out.println("Highest Expense: " + max);
    }

    public static void main(String[] args) 
	{

        Scanner sc = new Scanner(System.in);
        DailyExpenseTracker obj = new DailyExpenseTracker();

        int choice;

        do {
            System.out.println("\n--- Daily Expense Tracker ---");
            System.out.println("1. Add Expense");
            System.out.println("2. View All Expenses");
            System.out.println("3. Calculate Total Expense");
            System.out.println("4. Find Highest Expense");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) 
			{

                case 1:
                    obj.addExpense(sc);
                    break;

                case 2:
                    obj.viewExpenses();
                    break;

                case 3:
                    obj.calculateTotal();
                    break;

                case 4:
                    obj.findHighest();
                    break;

                case 5:
                    System.out.println("Exiting Program...");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 5);

        sc.close();
    }
}