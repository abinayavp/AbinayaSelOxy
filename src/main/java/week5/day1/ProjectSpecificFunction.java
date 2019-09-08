package week5.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class ProjectSpecificFunction {
	public ChromeDriver driver;
@Parameters({"url","username","password"})
	@BeforeMethod
	public void startApp(String url,String username,String password)
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");		
		driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get(url);
		WebElement eleUsername = driver.findElementById("username");
		eleUsername.sendKeys(username);
		driver.findElementById("password").sendKeys(password);
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();

	}
	@AfterMethod
	public void closeApp()
	{
		driver.close();
	}

}
