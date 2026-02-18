import java.util.Scanner;

class CalculateArea 
{

    
    double rectangleArea(double length, double width) 
	{
        return length * width;
    }

    
    double circleArea(double radius) 
	{
        return 3.14159 * radius * radius; 
    }

   
    double squareArea(double side) 
	{
        return side * side;
    }

    
    double triangleArea(double base, double height) 
	{
        return 0.5 * base * height;
    }

    
    void displayMenu() 
	{
        System.out.println(" Select an option:");
        System.out.println("1 .Area of Rectangle");
        System.out.println("2 .Area of Circle");
        System.out.println("3 .Area of Square");
        System.out.println("4 .Area of Triangle");
        System.out.println("5 .Exit");
    }

    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        CalculateArea cal = new CalculateArea(); 
        int choice;

        do 
		{
            cal.displayMenu();
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) 
			{
                case 1:
                    System.out.print("Enter length of rectangle: ");
                    double length = sc.nextDouble();
                    System.out.print("Enter width of rectangle: ");
                    double width = sc.nextDouble();
                    double rectArea = cal.rectangleArea(length, width);
                    System.out.println("Area of Rectangle: " + rectArea);
                    break;

                case 2:
                    System.out.print("Enter radius of circle: ");
                    double radius = sc.nextDouble();
                    double circArea = cal.circleArea(radius);
                    System.out.println("Area of Circle: " + circArea);
                    break;

                case 3:
                    System.out.print("Enter side of square: ");
                    double side = sc.nextDouble();
                    double sqArea = cal.squareArea(side);
                    System.out.println("Area of Square: " + sqArea);
                    break;

                case 4:
                    System.out.print("Enter base of triangle: ");
                    double base = sc.nextDouble();
                    System.out.print("Enter height of triangle: ");
                    double height = sc.nextDouble();
                    double triArea = cal.triangleArea(base, height);
                    System.out.println("Area of Triangle: " + triArea);
                    break;

                case 5:
                    System.out.println("Exiting program. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice! Please select 1-5.");
            }

        } while (choice != 5);

        sc.close();
    }
}