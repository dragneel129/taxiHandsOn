/**
 * 
 */
package com.training.utils;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

/**
 * @author nsin87
 *
 */
public class MySQLConnection {
	
	public static Connection getMyOracleConnection(){
		
		Connection con = null;
		Properties prop = new Properties();
		try {
//			FileInputStream in = new FileInputStream(new File("DbConnection.properties"));
			InputStream in = Thread.currentThread().getContextClassLoader().getResourceAsStream("DbConnection.properties");
			prop.load(in);
			Class.forName(prop.getProperty("db.driverClass"));
			
			con = DriverManager.getConnection(prop.getProperty("db.driverURL"),prop.getProperty("db.username"), prop.getProperty("db.password") );
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return con;
	}
	
	public static void main(String[] ar) {
		System.out.println(MySQLConnection.getMyOracleConnection());
	}

}
