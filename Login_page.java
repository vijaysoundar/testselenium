package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base_Page;

public class Login_page extends Base_Page {
	
		WebDriver driver;
		
		@FindBy (id="loginForm:userName")
		private WebElement usernametextbox;
		
		@FindBy(id="loginForm:password")
		private WebElement passwordtextbox;
		
		@FindBy(id="loginForm:submit")
		private WebElement loginbutton;

		public WebElement getUsernametextbox() {
			return usernametextbox;
		}

		public WebElement getPasswordtextbox() {
			return passwordtextbox;
		}

		public WebElement getLoginbutton() {
			return loginbutton;
		}
		
		public Login_page() {
			PageFactory.initElements(driver, this);
		}
		
		
		
	}


