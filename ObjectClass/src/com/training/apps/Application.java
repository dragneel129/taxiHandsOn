package com.training.apps;

import com.training.domains.Book;
import com.training.exceptions.RangeCheckException;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b1;
		Book b2;
		Book b3;
		try {
			b1 = new Book(101,"Head First Java","Kathy Sierra",1500.00);
			b2 = new Book(1002, "Thinking in java", "Bruce Erikel", 560.00);
			b3 = new Book(1002,"Thinking in java","Bruce Erikel",560.00);
			
			System.out.println(b2.equals(b3));
			System.out.println("book 2 :"+b2.hashCode());
			System.out.println("book 3 :"+b3.hashCode());
			
			String s = new String("Hari");
			System.out.println("comparing objects of different classes :"+s.equals(b2));
			Book b4 = null;
			System.out.println("comparing null objects :"+b3.equals(b4));
			
			Book b5 = b1;
			System.out.println("comparing identity :"+b1.equals(b5));
		} catch (RangeCheckException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		


	}

}
