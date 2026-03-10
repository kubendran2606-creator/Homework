class Book
{
	int bookId;
	String title;
	String author;
	boolean isAvailable;
	
	Book(int id,String t,String a)
	{
		bookId = id;
		title = t;
		author = a;
		isAvailable = true;
	}
	void display()
	{
		System.out.println("Book ID: "+bookId);
		System.out.println("Title : "+title);
		System.out.println("Author: "+author);
		
		if(isAvailable)
		{
			System.out.println("Available");
		}
		else
		{
			System.out.println("Borrowed ");
		}
		
	}
	void borrowBook()
	{
		if(isAvailable)
		{
			isAvailable = false;
			System.out.println("Borrowed Successfully");
		}
		else
		{
			System.out.println("Already Borrowed");
		}
		
	}
	void returnBook()
	{
		isAvailable = true;
		System.out.println("Returned Successfully");
		
	}
	
}

