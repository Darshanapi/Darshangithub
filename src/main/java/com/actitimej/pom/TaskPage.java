package com.actitimej.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitimej.generic.BaseClass;

public class TaskPage extends BaseClass {
	
	
	@FindBy (xpath="//div[text()='Add New']")
    private WebElement Addnewbtn;
	
	@FindBy (xpath="//div[text()='+ New Customer']")
    private WebElement Newcustomerbtn;
	
	@FindBy (id="customerLightBox_nameField")
    private WebElement customername;
	
	@FindBy (id="customerLightBox_descriptionField")
    private WebElement customerdescp;
	
	@FindBy (xpath="//button[contains(text(),'active customer')]")
    private WebElement customerdropdown;
	
	@FindBy (xpath="//a[text()='Our Company']")
    private WebElement ourcompnaybtn;
	
	@FindBy (xpath="//span[text()='Create Customer']")
    private WebElement createcustomerbtn;
	
	@FindBy (xpath="//div[@class='navigationLinks']/../div[@class='title ellipsis']")
    private WebElement actualcustomer;
	
	public TaskPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	public WebElement getAddnewbtn() {
		return Addnewbtn;
	}

	public WebElement getNewcustomerbtn() {
		return Newcustomerbtn;
	}

	public WebElement getCustomername() {
		return customername;
	}

	public WebElement getCustomerdescp() {
		return customerdescp;
	}

	public WebElement getCustomerdropdown() {
		return customerdropdown;
	}

	public WebElement getOurcompnaybtn() {
		return ourcompnaybtn;
	}

	public WebElement getCreatecustomerbtn() {
		return createcustomerbtn;
	}

	public WebElement getactualcustomer() {
		return actualcustomer;
	}

}

//	public void getAddnewbtn() {
//		return Addnewbtn;
//	}
//
//	public void getNewcustomerbtn() {
//		Newcustomerbtn.click();
//	}
//
//	public void getCustomername() {
//		customername.sendKeys(customername);
//	}
//
//	public void getCustomerdescp() {
//		customerdescp.sendKeys("Banking Project");
//	}
//
//	public void getCustomerdropdown() {
//		customerdropdown.click();
//	}
//
//	public void getOurcompnaybtn() {
//		ourcompnaybtn.click();
//	}
//
//	public void getCreatecustomerbtn() {
//		createcustomerbtn.click();
//	}
//	
//	public void getcustomercreatred() {
//		customercreatredbtn.click();
		
		

	


