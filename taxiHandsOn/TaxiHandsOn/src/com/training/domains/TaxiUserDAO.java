/**
 * 
 */
package com.training.domains;

import java.sql.*;

import com.training.ifaces.IMyDAO;
import com.training.utils.MySQLConnection;
/**
 * @author nsin87
 *
 */
public class TaxiUserDAO implements IMyDAO<TaxiUser>{
	
	private Connection con = null;

	/**
	 * @param con
	 */
	public TaxiUserDAO(Connection con) {
		super();
		this.con = con;
	}

	/**
	 * 
	 */
	public TaxiUserDAO() {
		super();
		// TODO Auto-generated constructor stub
		con = MySQLConnection.getMyOracleConnection();
	}

	@Override
	public int add(TaxiUser object) {
		// TODO Auto-generated method stub
		int rowAdded =0;
		
		try {
			String sql = "insert into TaxiCustomer values(?,?,?,?,?)";
			PreparedStatement pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, object.getUserEmail());
			pstmt.setString(2, object.getUserPassWord());
			pstmt.setLong(3, object.getUserPhoneNumber());
			pstmt.setString(4, object.getUserCity());
			pstmt.setString(5, object.getUserName());
			
			rowAdded = pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return rowAdded;
	}

	@Override
	public int delete(String email, String passWord) {
		// TODO Auto-generated method stub
		int rowDeleted = 0;
		
		try {
			String sql = "delete from TaxiCustomer where email = ? and password = ?";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, email);
			pstmt.setString(2, passWord);
			
			rowDeleted = pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return rowDeleted;
	}

	@Override
	public TaxiUser find(String email) {
		// TODO Auto-generated method stub
		TaxiUser obj = null;
		String taxiUserName;
		long taxiUserPhoneNumber;
		String taxiUserCity;
		String taxiUserPassWord;
		
		try {
			String sql = "select * from TaxiCustomer where Email = ?";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, email);
			
			ResultSet resultSet = pstmt.executeQuery();
			while(resultSet.next()){
				taxiUserName = resultSet.getString("name");
				taxiUserPhoneNumber = resultSet.getLong("telephone");
				taxiUserCity = resultSet.getString("city");
				taxiUserPassWord = resultSet.getString("password");
				
				obj = new TaxiUser(email, taxiUserPassWord, taxiUserPhoneNumber, taxiUserCity, taxiUserName);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return obj;
	}

	@Override
	public int update(final String userEmail, final String userPassWord, final long userPhoneNumber,
			  final String userCity, final String userName) {
		// TODO Auto-generated method stub
		int rowUpdated = 0;
		
		try {
			String sql = "update TaxiCustomer set name = ?, telephone = ? , city = ? where email =? and password =?";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(4, userEmail);
			pstmt.setString(1, userName);
			pstmt.setString(3, userCity);
			pstmt.setLong(2, userPhoneNumber);
			pstmt.setString(5, userPassWord);
			
			rowUpdated = pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return rowUpdated;
	}

	@Override
	public String findPasswordForEmail(String email) {
		// TODO Auto-generated method stub
		String userPassword = null;
		
		try {
			String sql = "select password from taxicustomer where email =?";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, email);
			ResultSet resultSet = pstmt.executeQuery();
			
			while (resultSet.next()) {
				userPassword = resultSet.getString("password");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return userPassword;
	}





}
