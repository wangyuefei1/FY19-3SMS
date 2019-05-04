package com.neuedu.jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;


public class JDBCDemo {

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
	public List<Account> query() {
		String url = prop.getProperty("url");
		List<Account> accounts = new ArrayList<>();	
		String str = "SELECT * FROM stu";
		try(	
				Connection co = DriverManager.getConnection(url, prop.getProperty("username"), prop.getProperty("password"));
				PreparedStatement ps  =  co.prepareStatement(str);
				ResultSet  rs = ps.executeQuery();
			)
		{
			while (rs.next()) {
				int int1 = rs.getInt("id");
				String str1 = rs.getString("name");
				int int2 = rs.getInt("salary");
				Account account = new Account(int1,str1,int2);
				accounts.add(account);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return accounts;
	}
	
	public static void main(String[] args) {
		//查询
		List<Account> query = new JDBCDemo().query();
		System.out.println(query);
		//添加
		//Account ac = new Account(3,"王五",1000);
		//new Adddata().Addonedata(ac);
		//删除
		new Deletedata().Deleteonedata(2);
		//修改
		//new Updatedata().Updateonedata(2);
	}
}
