package com.actitimej.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitimej.generic.BaseClass;

public class Homepage extends BaseClass{
	
	@FindBy (id="logoutLink")
	private WebElement logoutbtn;
	
	@FindBy (xpath="//div[text()='TASKS']")
    private WebElement Taskbtn;
	
	public Homepage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void setTaskbtn() {
		Taskbtn.click();
	}
//	public void setlogout() {
//		logoutbtn.click();
//	}
}
