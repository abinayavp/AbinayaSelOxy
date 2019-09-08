package week4.day2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import week5.day1.ProjectSpecificFunction;
import week5.day1.ReadExcel;

public class MergeLead extends ProjectSpecificFunction {
	@DataProvider(name ="fetchData")
	public Object[][] sendData() throws IOException{
		return ReadExcel.readData("MergeLead");
		}	
	@Test(dataProvider="fetchData") 
	public void mergeLead(String lName1,String lName2) throws InterruptedException {
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Merge Leads").click();
		driver.findElementByXPath("(//img[@alt='Lookup'])[1]").click();
		Set<String> allWin = driver.getWindowHandles();
		List<String> listWin = new ArrayList <String>(allWin);
		String primary = listWin.get(0);
		String Window1 = listWin.get(1);
		driver.switchTo().window(Window1);	
		driver.findElementByName("id").sendKeys(lName1);
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
		driver.findElementByName("id").sendKeys(lName2);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(3000);
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a").click();
		driver.switchTo().window(primary1);
		/* driver.findElementByXPath("(//img[@alt='Lookup'])[1]").click();
		Set<String> allWin2 = driver.getWindowHandles();s
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