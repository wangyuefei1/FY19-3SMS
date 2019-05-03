package com.neuedu.jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

public class Updatedata {

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
	public void Updateonedata()
	{
		String sql = "Update stu SET name = '李柳'  Where  id = 2";
		try (Connection con =  DriverManager.getConnection(prop.getProperty("url"),prop.getProperty("username"), prop.getProperty("password"));
				PreparedStatement preparedStatement = con.prepareStatement(sql);)
		{
			int executeUpdate = preparedStatement.executeUpdate();
			if (executeUpdate != 0 ) 
			{
				System.out.println("修改成功");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
