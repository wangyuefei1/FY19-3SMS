package com.neuedu.jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.sql.PreparedStatement;

public class Adddata {

	private static Properties prop;
	static
	{
		prop = new Properties();
		try {
			prop.load(JDBCDemo.class.getResourceAsStream("/settings.properties"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	public void Addonedata(Account account)
	{
		String sql = "INSERT INTO stu VALUES(?,?,?)";
		try (Connection con =  DriverManager.getConnection(prop.getProperty("url"),prop.getProperty("username"), prop.getProperty("password"));
				PreparedStatement preparedStatement = con.prepareStatement(sql);)
		{
			preparedStatement.setInt(1, account.getId());
			preparedStatement.setString(2, account.getName());
			preparedStatement.setInt(3, account.getSalary());
			int executeUpdate = preparedStatement.executeUpdate();
			if (executeUpdate != 0 ) 
			{
				System.out.println("Ìí¼Ó³É¹¦");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
