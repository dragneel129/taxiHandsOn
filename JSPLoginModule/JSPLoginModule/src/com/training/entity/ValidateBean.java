/**
 * 
 */
package com.training.entity;

import java.util.HashMap;

/**
 * @author nsin87
 *
 */
public class ValidateBean {
	
	private HashMap<String,String> userPassPair;

	/**
	 * 
	 */
	public ValidateBean() {
		super();
		// TODO Auto-generated constructor stub
		userPassPair = new HashMap<String, String>();
	}
	
	public void init(){
		userPassPair.put("abhinav", "kaul");
		userPassPair.put("narendra", "singh");
		userPassPair.put("Ankit", "Gupta");
		userPassPair.put("Surabhi", "Jindal");
		userPassPair.put("Radhika", "khandelwal");
		
	}
	
	public boolean validator(String userName, String passWord) {
		boolean valid=false;
		init();
		if(passWord.equals(userPassPair.get(userName))){
			valid = true;
		}
				
		return valid;
		
	}
	
	

}
