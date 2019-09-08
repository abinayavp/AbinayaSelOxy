package week4.day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertLearn {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
	//	driver.switchTo().frame(driver.findElementById("iframeResult"));
		driver.switchTo().frame("iframeResult");
		
		driver.findElementByXPath("//button[text()='Try it']").click();
		Alert tryIt = driver.switchTo().alert();
		tryIt.sendKeys("Abinaya");
		tryIt.accept();
		WebElement text1 = driver.findElementById("demo");
	String text2 = text1.getText();
	if(text2.contains("Abinaya"))
	{
		System.out.println("True");
	}
	else
	{
		System.out.println("Fail");
	}

}
	
}

