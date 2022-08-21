package com.cg.client;

import com.cg.service.BookService;
import com.cg.service.BookServiceImpl;

public class Client {

	public static void main(String[] args) {
		BookService obj=new BookServiceImpl();
		System.out.println("Total No. of Books ");
		System.out.println("Total Books: "+obj.getBookCount());
		
		System.out.println("Book with Id-123");
		System.out.println("Total Books: "+obj.getBookbyId(123));
		
		System.out.println("All books");
		System.out.println("Total Books: "+obj.getAllBooks());
		
		System.out.println("Book by Yashwant");
		System.out.println("Total Books: "+obj.getAuthorBooks("yashwant"));
		
		System.out.println("Book by title-python");
		System.out.println("Total Books: "+obj.getBookByTitle("c++"));
		
		System.out.println("Books between price range 200 to 500 ");
		System.out.println("Total Books: "+obj.getBookInPriceRange(300, 500));
		

	}

}
