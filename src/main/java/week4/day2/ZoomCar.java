package week4.day2;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



public class ZoomCar {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--disable-notifications");
	ChromeDriver driver = new ChromeDriver(options);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	Date date = new Date();
	DateFormat sdf = new SimpleDateFormat("dd");
	String today = sdf.format(date);
	int tomorrow=Integer.parseInt(today)+1;
	System.out.println(tomorrow);
	
	driver.get("https://www.zoomcar.com/chennai/");
	driver.findElementByLinkText("Start your wonderful journey").click();
	driver.findElementByXPath("(//div[@class='items'])[1]").click();
	driver.findElementByXPath("//button[text()='Next']").click();
	driver.findElementByXPath("//div[contains(text(),'"+tomorrow+"')]").click();
	driver.findElementByClassName("proceed").click();
	System.out.println(driver.findElementByXPath("(//div[@class='label time-label'])[1]").getText());
	driver.findElementByXPath("//button[@class='proceed']").click();
	Map<String,Integer>cost = new LinkedHashMap<String, Integer>();
	List<WebElement> price = driver.findElementsByXPath("//div[@class='price']");
	List<WebElement> model = driver.findElementsByXPath("//div[@class='details']");
	
	
		cost.put(model, price);
	}
	for(Entry<String, Integer> eachprice:cost.entrySet())
	{
			System.out.println(eachprice.getKey());
			System.out.println(eachprice.getValue());
	}
	}
		
	{
    
	
	
	
	
	
	
	
	
	
			

}
}

