import java.util.Scanner;

class PbvPbr
{
	int marks;
	
	void passByValue(int a)
	{
		a+=10;
		System.out.println("Inside Method call: "+a);
	}
	void passByRef(PbvPbr s)
	{
		s.marks+=10;
		System.out.println("Inside Method call: "+s.marks);
	}
	void passByValue1(String name)
	{
		name+="raj";
		System.out.println("Inside Method call: "+name);
	}
	void passByRef1(int br[])
	{
		br[1]=77;
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		
		PbvPbr obj = new PbvPbr();
		
		int choice;
		
		do
		{
			System.out.println("   MENU OPTIONS  ");
            System.out.println("1. PBV-INCREASE MARKS");
            System.out.println("2. PBR-UPDATE STUDENT MARKS");
            System.out.println("3. PBV1-CHANGE STRING");
            System.out.println("4. PBR1-MODIFY ARRAY");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) 
			{
                case 1:
				{
					System.out.print("Enter the marks: ");
					int marks = sc.nextInt();
					
					System.out.println("Before Method call: "+marks);
                    obj.passByValue(marks);
					System.out.println("After Method call: "+marks);
                    break;
				}
                case 2:
				{
					PbvPbr stu = new PbvPbr();
					System.out.print("Enter Student Marks: ");
					stu.marks = sc.nextInt();
					
					System.out.println("Before Method call: "+stu.marks);
                    obj.passByRef(stu);
					System.out.println("After Method call: "+stu.marks);
                    break;
				}
                case 3:
				{
					System.out.println("Enter the Name: ");
					String str = sc1.nextLine();
					
					System.out.println("Before Method call: "+str);
                    obj.passByValue1(str);
					System.out.println("After Method call: "+str);
                    break;
				}
                case 4:
				{
					int arr[]= new int[3];
					for(int i=0;i<arr.length;i++)
					{
						System.out.println("Enter the" +i+" Index value: ");
						arr[i]=sc.nextInt();
					}
					System.out.println("Before Method call:");
					for(int i=0;i<arr.length;i++)
					{
						System.out.println(arr[i]+",");
					}
				
                    obj.passByRef1(arr);
					System.out.println();
					
					System.out.println("After Method call:");
					for(int i=0;i<arr.length;i++)
					{
						System.out.println(arr[i]+",");
					}
					System.out.println();
                    break;
				}
                case 5:
                    System.out.println("Program Exited Successfully...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
		}while(choice!=5);
		
		sc.close();
		sc1.close();
	}
}