package com.training;

public class FirstExample {
	
	public static String understandFinally(){
		String number = "Four";
		
		try {
			int val = Integer.parseInt(number);
			System.out.println("Value"+val);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			return "Caught";
		}
		finally{
			System.out.println("*********Inside finally block********");
		}
		System.out.println("Method End");
		return null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=null;
		understandFinally();
		try{
			System.out.println("String Length"+s.length());
			
			
		}
		catch(NullPointerException e){
			System.err.println("String value is null -Check");
			System.err.println(e.getMessage());
		}
		finally{
			System.out.println("Inside Finally");
		}
		System.out.println("Bye!");

	}

}
