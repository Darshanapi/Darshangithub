package com.actitimej.generic;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.actitimej.pom.Loginpage;



public class BaseClass {
	
	public  static WebDriver driver;
	
	
	@BeforeClass
	public void openBrowser()  {
		Reporter.log("Open Browser",true);
		driver=new ChromeDriver(); 
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			//driver.get("http://localhost/login.do");
			
					
		}
	@AfterClass
	public void closeBrowser()  {
	Reporter.log("Open Browser",true);
	driver.close();
	}
	
	
	@BeforeMethod
	public void login() throws IOException  {
		Reporter.log("Open Browser",true);
		FileLib f=new FileLib();
		String url= f.getPropertyData("url");
		String un= f.getPropertyData("username");
		String pw= f.getPropertyData("password");
		driver.get(url);
	Loginpage l = new Loginpage(driver);
	l.setlogin(un, pw);
	}
		
		 
		
		
//	@AfterMethod
//	public void logout() {
//		Reporter.log("Open Browser",true);
//		Homepage h= new Homepage(driver);
//		h.setlogout();
//		Reporter.log("logout",true);
		

}





