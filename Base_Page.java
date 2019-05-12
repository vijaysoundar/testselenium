package com.base;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

 
public class Base_Page {
	public static WebDriver driver;
	public static Properties pro;
	
	
//	public void rfp() throws IOException {
//		String location = "C:\\Users\\visounda\\eclipse-workspace\\fw1\\src\\main\\java\\com\\util\\pro.properties";
//		FileInputStream fis = new FileInputStream(location);
//		pro.load(fis);
//		
//	}
	
	public void driver() throws IOException {
		Properties pro = new Properties();
		String location = "C:\\Users\\visounda\\eclipse-workspace\\fw1\\src\\main\\java\\com\\util\\pro.properties";
		FileInputStream fis = new FileInputStream(location);
		
		pro.load(fis);
		
		if(pro.get("browser")=="chrome") {
			
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\visounda\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		}else {
			System.out.println("error");
		}
		driver.get(pro.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			

	}
	
	
}


