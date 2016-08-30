/**
 * 
 */
package com.training.ifaces;

/**
 * @author nsin87
 *
 */
public interface IMyDAO<T> {
	
	public int add(T object);
	public int delete(String email, String passWord);
	public T find(String email);
	public int update(final String userEmail, final String userPassWord, final long userPhoneNumber,
			  final String userCity, final String userName);
	public String findPasswordForEmail(String email);
	

}
