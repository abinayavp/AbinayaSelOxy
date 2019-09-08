package week2.day1;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import week5.day1.ProjectSpecificFunction;
import week5.day1.ReadExcel;

public class CreateLead extends ProjectSpecificFunction{
	@DataProvider(name ="fetchData")
	public Object[][] sendData() throws IOException{
		return ReadExcel.readData("CreateLead");
	}
	
	@Test(dataProvider="fetchData")
	public void createLead(String cName,String fName,String lName,String pNumber) throws InterruptedException
	{
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys(cName);
		driver.findElementById("createLeadForm_firstName").sendKeys(fName);
		driver.findElementById("createLeadForm_lastName").sendKeys(lName);
		driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys(pNumber);
		WebElement eleSource = driver.findElementById("createLeadForm_dataSourceId");
		Select sel = new Select(eleSource);
		sel.selectByIndex(8);		
		WebElement mc = driver.findElementById("createLeadForm_marketingCampaignId");
		Select sele = new Select(mc);
		List<WebElement> options = sele.getOptions();
		System.out.println(options.size());
		sele.selectByIndex(options.size()-2);
		WebElement owner = driver.findElementById("createLeadForm_ownershipEnumId");
    	Select slt = new Select(owner);
    	List<WebElement> options1 = slt.getOptions();
    	System.out.println(options1.size());
    	slt.selectByIndex(options1.size()-6);	
    	driver.findElementByClassName("smallSubmit").click();
    	
	}
	

}
