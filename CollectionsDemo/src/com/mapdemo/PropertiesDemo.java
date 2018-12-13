package com.mapdemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {

	public static void main(String[] args) throws IOException {
		
		Properties p=new Properties();
		FileInputStream fis =new FileInputStream("abc.properties");
		p.load(fis);
		System.out.println(p);
		String s= p.getProperty("username");
		System.out.println("printing username..."+s);
		p.setProperty("key", "value");
		FileOutputStream fos=new FileOutputStream("abc.properties");
		p.store(fos, "updated by mitul");

	}

}
