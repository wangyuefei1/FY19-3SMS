package com.neuedu.util;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DButil {
	
	private static Properties prop;
	static
	{
		prop = new Properties();
		try {
			prop.load(DButil.class.getResourceAsStream("/mysql.properties"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	public static Connection getConnection()
	{	
		Connection co = null;
		try 
		{
			co = DriverManager.getConnection(prop.getProperty("url"), prop.getProperty("username"), prop.getProperty("password"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return co;
	}
}
