package week5.day1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Merge {
	
	public class MergeLead extends ProjectSpecificFunction {
		
			public void mergeLead() throws InterruptedException {
			driver.findElementByLinkText("Leads").click();
			driver.findElementByLinkText("Merge Leads").click();
			driver.findElementByXPath("(//img[@alt='Lookup'])[1]").click();
			Set<String> allWin = driver.getWindowHandles();
			List<String> listWin = new ArrayList <String>(allWin);
			String primary = listWin.get(0);
			String Window1 = listWin.get(1);
			driver.switchTo().window(Window1);	
			driver.findElementByName("id").sendKeys("100");
			System.out.println(driver.getCurrentUrl());
			driver.findElementByXPath("//button[text()='Find Leads']").click();
			Thread.sleep(5000);
			driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a").click();
			driver.switchTo().window(primary);
			driver.findElementByXPath("(//img[@alt='Lookup'])[2]").click();
			Set<String> allWin1 = driver.getWindowHandles();
			List<String> listWin1 = new ArrayList <String>(allWin1);
			String primary1 = listWin1.get(0);
			String Window2 = listWin1.get(1);
			driver.switchTo().window(Window2);	
			System.out.println(driver.getCurrentUrl());	
			driver.findElementByName("id").sendKeys("102");
			driver.findElementByXPath("//button[text()='Find Leads']").click();
			Thread.sleep(3000);
			driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a").click();
			driver.switchTo().window(primary1);
			/* driver.findElementByXPath("(//img[@alt='Lookup'])[1]").click();
			Set<String> allWin2 = driver.getWindowHandles();
			List<String> listWin2 = new ArrayList <String>(allWin2);
			String primary2 = listWin2.get(0);
			String Window3 = listWin2.get(1);
			driver.switchTo().window(Window3);	
			System.out.println(driver.getCurrentUrl());	
			driver.findElementByName("id").sendKeys(lName1);
			driver.findElementByXPath("//button[text()='Find Leads']").click();
			Thread.sleep(3000); */
			//WebElement fromLead = driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a");
			//String text2 = fromLead.getText();
			//System.out.println(text2);
		//	fromLead.click();
		//	driver.switchTo().window(primary2);		
			driver.findElementByLinkText("Merge").click();
			Alert alert = driver.switchTo().alert();
			alert.accept();
			driver.findElementByLinkText("Find Leads").click();
		//	driver.findElementByName("id").sendKeys(text2);
			driver.findElementByXPath("//button[text()='Find Leads']").click();
		//String text = driver.findElementByXPath("//div[text()='No records to display']").getText();
		//	System.out.println(text);
			
			//
			

}

	}
}