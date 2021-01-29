package com.Utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	private Properties prop;
	
	public Properties init_prop() {
		prop = new Properties();
		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\151508\\git\\Cucumber\\Cucumber\\src\\test\\resources\\Config\\config.properties");
			prop.load(fis);	
			
			}catch(FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
		}			
		return prop;		
	}}
