/**
 * 
 */
package com.training.domains;

/**
 * @author nsin87
 *
 */
public class ValidateBean {
	
	private TaxiUserDAO  userDAO;

	/**
	 * 
	 */
	public ValidateBean() {
		super();
		// TODO Auto-generated constructor stub
		userDAO = new TaxiUserDAO();
	}

	/**
	 * @param userDAO
	 */
	public ValidateBean(TaxiUserDAO userDAO) {
		super();
		this.userDAO = userDAO;
	}
	
	private void init(){
		
	}
	
	public boolean validate(String email, String passWord) {
		init();
		boolean valid = false;
		if(passWord.equals(userDAO.findPasswordForEmail(email))){
			valid = true;
		}
		
		return valid;
		
	}
	
	
	

}
