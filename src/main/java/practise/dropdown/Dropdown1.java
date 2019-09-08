package practise.dropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown1 {	
	
	public static void main(String args[])
	{
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://erail.in/");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElementById("txtStationFrom").clear();
		WebElement eleSource = driver.findElementById("txtStationFrom");
		eleSource.sendKeys("tbm");
		eleSource.sendKeys(Keys.TAB);
		driver.findElementById("txtStationTo").clear();
		WebElement eleDestination = driver.findElementById("txtStationTo");
		eleDestination.sendKeys("tj");
		eleDestination.sendKeys(Keys.TAB);
		WebElement table = driver.findElementByXPath("//table[@class = 'DataTable TrainList TrainListHeader']");
		List<WebElement> allRows = table.findElements(By.tagName("tr"));
		System.out.println(allRows.size());
		WebElement secondRow = allRows.get(0);
		List<WebElement> allColumn = secondRow.findElements(By.tagName("td"));
		String secondTrainName = allColumn.get(1).getText();
		System.out.println(secondTrainName);		
		
		
		
		

	}

}
