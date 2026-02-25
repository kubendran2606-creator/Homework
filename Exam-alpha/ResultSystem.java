import java.util.Scanner;

class ResultSystem
{
	int mark1;
	int mark2;
	int mark3;
	int total;
	int percentage;
	
	Scanner sc1 = new Scanner(System.in);
	
	void inputMarks() 
	{
        System.out.print("Enter marks for Subject 1: ");
        mark1 = sc1.nextInt();

        System.out.print("Enter marks for Subject 2: ");
        mark2 = sc1.nextInt();

        System.out.print("Enter marks for Subject 3: ");
        mark3 = sc1.nextInt();
    }
	
	void calculateTotal() 
	{
        total = mark1 + mark2 + mark3;
        System.out.println("Total Marks = " + total);
    }
	
	void calculatePercentage() 
	{
        total = mark1 + mark2 + mark3;
        percentage = total / 3;
        System.out.println("Percentage = " + percentage + "%");
    }
	
	void displayResult() 
	{
        

        if (mark1 >= 40 && mark2>=40 && mark3>=40)
            System.out.println("Result: Pass");
        else
            System.out.println("Result: Fail");
    }
	
	void displayGrade() 
	{
        total = mark1 + mark2 + mark3;
        percentage = total / 3;

        if (percentage >= 75)
            System.out.println("Grade: A");
        else if (percentage >= 60)
            System.out.println("Grade: B");
        else if (percentage >= 40)
            System.out.println("Grade: C");
        else
            System.out.println("Grade: F");
    }
	
	public static void main(String[] args) 
	{

        ResultSystem obj = new ResultSystem();
        Scanner sc = new Scanner(System.in);

        int choice;

        
        obj.inputMarks();

        do 
		{
            System.out.println("   MENU   ");
            System.out.println("1. Display Total");
            System.out.println("2. Display Percentage");
            System.out.println("3. Display Result");
            System.out.println("4. Display Grade");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) 
			{
                case 1:
                    obj.calculateTotal();
                    break;
                case 2:
                    obj.calculatePercentage();
                    break;
                case 3:
                    obj.displayResult();
                    break;
                case 4:
                    obj.displayGrade();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 5);
		sc.close();
    }
	
	
	
		
	
}