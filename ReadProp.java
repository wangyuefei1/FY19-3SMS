package com.neuedu.jdbc;

import java.io.IOException;
import java.util.Properties;

public class ReadProp {

	public static void main(String[] args) {
		
	
	Properties properties = new Properties();
	try {
		properties.load(ReadProp.class.getResourceAsStream("/settings.properties"));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
}
