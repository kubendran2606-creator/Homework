import java.util.Scanner;

class ExamScoreAnalyzer 
{

    int[] scores = new int[100];   // store exam scores
    int count = 0;                 // number of scores added

    // 1. Add Exam Score
    void addScore(Scanner sc) 
	{
        if (count >= scores.length) 
		{
            System.out.println("Storage Full!");
            return;
        }

        System.out.print("Enter exam score: ");
        scores[count] = sc.nextInt();
        count++;

        System.out.println("Score Added Successfully!");
    }

    // 2. Display All Scores
    void displayScores() 
	{
        if (count == 0) 
		{
            System.out.println("No scores available.");
            return;
        }

        System.out.println("All Scores:");
        for (int i = 0; i < count; i++) 
		{
            System.out.println(scores[i]);
        }
    }

    // 3. Count Pass Scores (>= 50)
    void countPass() 
	{
        if (count == 0) 
		{
            System.out.println("No scores available.");
            return;
        }

        int passCount = 0;

        for (int i = 0; i < count; i++) 
		{
            if (scores[i] >= 50) 
			{
                passCount++;
            }
        }

        System.out.println("Number of Pass Scores: " + passCount);
    }

    // 4. Count Fail Scores (< 50)
    void countFail() 
	
	{
        if (count == 0) 
		{
            System.out.println("No scores available.");
            return;
        }

        int failCount = 0;

        for (int i = 0; i < count; i++) 
		{
            if (scores[i] < 50) 
			{
                failCount++;
            }
        }

        System.out.println("Number of Fail Scores: " + failCount);
    }

    public static void main(String[] args) 
	{

        Scanner sc = new Scanner(System.in);
        ExamScoreAnalyzer obj = new ExamScoreAnalyzer();

        int choice;

        do {
            System.out.println("\n--- Exam Score Analyzer ---");
            System.out.println("1. Add Exam Score");
            System.out.println("2. Display All Scores");
            System.out.println("3. Count Pass Scores");
            System.out.println("4. Count Fail Scores");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) 
			{

                case 1:
                    obj.addScore(sc);
                    break;

                case 2:
                    obj.displayScores();
                    break;

                case 3:
                    obj.countPass();
                    break;

                case 4:
                    obj.countFail();
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