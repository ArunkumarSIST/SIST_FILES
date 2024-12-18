package org.tnsif.capgemimi.c2tc.oops;


class Book
{
	String title;
	int page;
	
	Book() ///constructor with no parameter
	
	{
		title= "unknow";
		page=0;
	}
	
	Book(String title) ///constructor with one parameter
	{
		this.title=title;
		page=0;
	}
	
	Book(String title, int page)
	{
		this.title=title;
		this.page=page;
	}
	void display()
	{
		System.out.println("title  :" + title + "page :" + page );
	}
	
}
public class constructor_overloading {

	public static void main(String[] args) {
		Book book1=new Book();
		Book book2= new Book("Java Programing");
		Book book3= new Book("Python Programing"  ,700);
		
		
		book1.display();
		book2.display();
		book3.display();
		
	}

}


