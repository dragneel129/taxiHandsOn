package com.training.apps;

import com.training.domains.Book;
import com.training.exceptions.RangeCheckException;

public class GCApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book bk;
		try {
			bk = new Book(101,"A","B",10.00);
			System.out.println(bk);
			
			bk=null;
			System.gc();
			System.out.println("Look at the console for special message");
			System.out.println("Bye");

		} catch (RangeCheckException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
