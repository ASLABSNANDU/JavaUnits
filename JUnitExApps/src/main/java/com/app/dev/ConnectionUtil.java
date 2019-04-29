package com.app.dev;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

import com.app.prop.LoadPropertices;

public class ConnectionUtil {
	public static LoadPropertices loadPropertices = new LoadPropertices();
	private static Connection con = null;

	static {
		try {
			Properties prop = loadPropertices.getProperticesObject();
			Class.forName(prop.getProperty("dc"));
			con = DriverManager.getConnection(prop.getProperty("url"), prop.getProperty("un"), prop.getProperty("pwd"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static Connection getSingleTonConnection() {
		return con;
	}
}
