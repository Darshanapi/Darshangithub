package com.actitimej.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitimej.generic.BaseClass;

public class Loginpage extends BaseClass {
	
	@FindBy (id="username")
	private WebElement unTbx;
	
	@FindBy (name="pwd")
	private WebElement pwTbx;
	
 	@FindBy (xpath="//div[text()='Login ']")
	private WebElement loginTbx;
	
	
	public Loginpage (WebDriver driver) {
	PageFactory.initElements(driver, this);}
	
	public void setlogin (String un,String pwd) {
	unTbx.sendKeys(un);
	pwTbx.sendKeys(pwd);
	loginTbx.click();
}
	
}
