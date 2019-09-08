package week2.assignment;

import org.testng.annotations.Test;

import week5.day1.ProjectSpecificFunction;

public class EditLead extends ProjectSpecificFunction {
	@ Test 
	public void editLead() throws InterruptedException {	
		driver.findElementByLinkText("Leads").click();		
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("//span[text()='Email']").click();
		driver.findElementByName("emailAddress").sendKeys("test");
		driver.findElementByXPath("//button[text()='Find Leads']");
		Thread.sleep(5000);
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a").click();
		System.out.println(driver.getTitle());
		if(driver.getTitle().contains("View Lead | opentaps CRM"))
		{
			System.out.println("Title contains View Lead | opentaps CRM");
		}
		else
		{
			System.out.println("Title does not contain View Lead | opentaps CRM");
		}
		driver.findElementByLinkText("Edit").click();
		driver.findElementById("updateLeadForm_companyName").clear();
		driver.findElementById("updateLeadForm_companyName").sendKeys("Cognizant");		
		driver.findElementByName("submitButton").click();
		driver.findElementByName("companyName").getAttribute("value");
		if(driver.findElementByName("companyName").getAttribute("value").contains("Cognizant"))
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
		
		driver.close();
		}

}

