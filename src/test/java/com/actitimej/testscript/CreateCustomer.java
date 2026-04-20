package com.actitimej.testscript;



import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitimej.generic.BaseClass;
import com.actitimej.generic.FileLib;
import com.actitimej.generic.randomNum;
import com.actitimej.pom.Homepage;
import com.actitimej.pom.TaskPage;


@Listeners(com.actitimej.generic.ListnerImplementation.class)
public class CreateCustomer extends BaseClass {
	
	@Test
	public void testCreateCustomer() throws InterruptedException, IOException {
		Reporter.log("CreateCustomer", true);
		
		int num = randomNum.getRandomNum();
		FileLib f=new FileLib();
		String customername = f.getExcelData("Create Customer", 1, 3);
		String finalCustomerName = customername + num;
		String customerDescription = f.getExcelData("Create Customer", 1, 4);
		Homepage e= new Homepage(driver);
		 e.setTaskbtn();
		 
		 TaskPage t=new TaskPage(driver);
         t.getAddnewbtn().click();
         t.getNewcustomerbtn().click();
         t.getCustomername().sendKeys(finalCustomerName);
         t.getCustomerdescp().sendKeys(customerDescription);
         t.getCustomerdropdown().click();
         t.getOurcompnaybtn().click();
         Thread.sleep(2000);
         t.getCreatecustomerbtn().click();
         WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
         wait.until(ExpectedConditions.textToBePresentInElement(t.getactualcustomer(),finalCustomerName ));
         String actualcustomer=t.getactualcustomer().getText();
         Assert.assertEquals(actualcustomer, finalCustomerName);

	}
	
}
