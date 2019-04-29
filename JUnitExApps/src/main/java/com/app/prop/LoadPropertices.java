package com.app.prop;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLDecoder;
import java.util.Properties;

public class LoadPropertices {
	public static Properties prop = null;
	public static String path = "";

	public static void main(String[] args) throws Exception {
		LoadPropertices loadPropertices = new LoadPropertices();
		prop = loadPropertices.getProperticesObject();
		System.out.println(prop.getProperty("HostKey"));
	}

	public Properties getProperticesObject() throws Exception {
		try {
			path = getPath();
			path = path.replace("test-classes", "classes");
			System.out.println(path);
			prop = new Properties();
			InputStream input = null;
			input = new FileInputStream(path);

			prop.load(input);
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		return prop;
	}

	private String getPath() throws Exception {
		String path = getClass().getClassLoader().getResource("").getPath();
		String fullPath = URLDecoder.decode(path, "UTF-8");
		return new File(fullPath).getPath() + File.separatorChar + "app.properties";

	}
}
