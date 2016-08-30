/**
 * 
 */
package com.training.domains;

/**
 * @author nsin87
 *
 */
public class TaxiUser {

  private String userEmail;
  private String userPassWord;
  private long userPhoneNumber;
  private String userCity;
  private String userName;
  /**
   * 
   */
  public TaxiUser() {
    super();
    // TODO Auto-generated constructor stub
  }
  /**
   * @param userEmail
   * @param userPassWord
   * @param userPhoneNumber
   * @param userCity
   * @param userName
   */
  public TaxiUser(final String userEmail, final String userPassWord, final long userPhoneNumber,
		  final String userCity, final String userName) {
    super();
    this.userEmail = userEmail;
    this.userPassWord = userPassWord;
    this.userPhoneNumber = userPhoneNumber;
    this.userCity = userCity;
    this.userName = userName;
  }
  /**
   * @return the userEmail
   */
  public String getUserEmail() {
    return userEmail;
  }
  /**
   * @param userEmail the userEmail to set
   */
  public void setUserEmail(final String userEmail) {
    this.userEmail = userEmail;
  }
  /**
   * @return the userPassWord
   */
  public String getUserPassWord() {
    return userPassWord;
  }
  /**
   * @param userPassWord the userPassWord to set
   */
  public void setUserPassWord(final String userPassWord) {
    this.userPassWord = userPassWord;
  }
  /**
   * @return the userPhoneNumber
   */
  public long getUserPhoneNumber() {
    return userPhoneNumber;
  }
  /**
   * @param userPhoneNumber the userPhoneNumber to set
   */
  public void setUserPhoneNumber(final long userPhoneNumber) {
  	this.userPhoneNumber = userPhoneNumber;
  }
  /**
   * @return the userCity
   */
  public String getUserCity() {
  	return userCity;
  }
  /**
   * @param userCity the userCity to set
   */
  public void setUserCity(final String userCity) {
  	this.userCity = userCity;
  }
  /**
   * @return the userName
   */
  public String getUserName() {
  	return userName;
  }
  /**
   * @param userName the userName to set
   */
  public void setUserName(final String userName) {
  	this.userName = userName;
  }
  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    return "TaxiUser [userEmail=" + userEmail + ",  userPhoneNumber=" + userPhoneNumber + ", userCity=" + userCity + ", userName=" + userName + "]";
}
  
  

}
