import java.util.Scanner;
class LibraryManagement
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
	
		Book books[] = new Book[100];
		int count = 0;
		int choice;
		
		do
		{
			System.out.println("    LIBRARY    "   );
			System.out.println("1.Add a New Book");
			System.out.println("2.Display All Books");
			System.out.println("3.Borrow a Book");
			System.out.println("4.Return a Book");
			System.out.println("5.Exit");
			System.out.println("Enter your choice(1-5)");
			
			choice = sc.nextInt();
			
			switch(choice)
			{
				case 1:// add a book
				{
					System.out.println("Enter Book ID: ");
					int id = sc.nextInt();
					sc.nextLine();
					System.out.println("Enter Title: ");
					String title = sc.nextLine();
					System.out.println("Enter Author Name: ");
					String author = sc.nextLine();
					
					books[count] = new Book(id,title,author);
					count++;
					
					System.out.println("Book Added Successfully");
					break;
				}
				case 2: // display
				{
					for(int i = 0;i<count;i++)
					{
						books[i].display();
					}
					break;
				}
				case 3: // borrow
				{
					System.out.println("Enter Book ID to Borrow: ");
					int buy = sc.nextInt();
					
					for(int i = 0;i<count;i++)
					{
						if(books[i].bookId == buy)
						{
							books[i].borrowBook();
						}
					}
					break;
				}
				case 4: // return
				{
					System.out.println("Enter Book ID to Return: ");
					int ret = sc.nextInt();
					
					for(int i = 0;i<count;i++)
					{
						if(books[i].bookId == ret)
						{
							books[i].returnBook();
						}
					}
					break;
				}
				case 5: // exit
				{
					System.out.println("Exiting Program..... ");
					break;
				}
				default:
				{
					System.out.println("Invalid Choice ");
				}
				
				
			}
		}while(choice!=5);
	}
	
}