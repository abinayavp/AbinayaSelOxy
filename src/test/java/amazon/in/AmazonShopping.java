package amazon.in;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class AmazonShopping {
	
	public ChromeDriver driver;

@Given("Open the Chrome Browser")
public void openTheChromeBrowser() {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");	
	driver= new ChromeDriver();
    
}

@Given("Maximize the Browser")
public void maximizeTheBrowser() {
	driver.manage().window().maximize();
   
}

@Given("Set the timeout")
public void setTheTimeout() {
  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
}

@Given("Load the URL")
public void loadTheURL() {
    driver.get("https://www.amazon.in/");
    System.out.println(driver.getCurrentUrl());
}

@When("click on the All")
public void clickOnTheAll() {
	WebElement categoryAll = driver.findElementById("searchDropdownBox");
   Select sc = new Select(categoryAll);
   List<WebElement> itemChosen = sc.getOptions();
   System.out.println(itemChosen); 
   System.out.println(itemChosen.size());   
   sc.selectByIndex(itemChosen.size()-25);    
   WebElement Electronics = driver.findElementById("searchDropdownBox");
   Actions builder = new Actions(driver);
   builder.moveToElement(Electronics).perform();
   driver.findElementById("twotabsearchtextbox").sendKeys("Honor 6X");
   driver.findElementByXPath("(//input[@class='nav-input'])[1]").click();
   
   
}


}
