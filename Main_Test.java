package com.test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.base.Base_Page;
import com.pages.Home_Page;
import com.pages.Login_page;



public class Main_Test extends Base_Page{
	Login_page loginpage;
	Base_Page basepage;


	@BeforeTest
	public void BeforeTest() throws IOException {
	
	basepage = new Base_Page();
	loginpage = new Login_page();	
	basepage.driver();
			
		
	}
	
	@Test
	public void test1() {
		loginpage.getUsernametextbox().sendKeys("vijaysoundar1");
	}
	

	
}
