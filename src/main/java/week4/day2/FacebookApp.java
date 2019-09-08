package week4.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FacebookApp {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(
				"https://www.facebook.com/?stype=lo&jlou=AfczF_VQwsaobheOZXJMwB4YBIZruDEnI6c2Alku59D7uahYlFdab4a24ILzDArwYLlif9bA-3wKulCJOQhwyHG1OCD7jrfE1z8nRmxHlbhdbg&smuh=9694&lh=Ac8i1q9jFJPCDmTz");
		driver.findElementById("email").sendKeys("abi.121288@gmail.com");
		driver.findElementById("pass").sendKeys("abipravi1222");
		driver.findElementByXPath("//input[@value='Log In']").click();
		Thread.sleep(3000);
		driver.findElementByName("q").sendKeys("TestLeaf");
		Thread.sleep(10000);
		driver.findElementByXPath("//button[@aria-label='Search']").click();
		Thread.sleep(10000);
		driver.findElementByXPath("(//div[text()='Places'])").click();
		Thread.sleep(1000);
		driver.findElementByLinkText("TestLeaf").equals("TestLeaf");
		System.out.println("Text TestLeaf is displayed");
		//driver.findElementByXPath("(//button[contains(@class,'likeButton')] )[1]");
	//	driver.findElementByXPath("//button[text()='Like']").click();
		Thread.sleep(10000);
		driver.findElementByXPath("//div[text()='All']").click();
		String text = driver.findElementByXPath("//button[contains(@class,'PageLikeButton')]").getText();
		System.out.println(text);
		if(text.equals("Like"))
		{
			driver.findElementByXPath("//button[contains(@class,'PageLikeButton')]").click();
		}
		else if (text.equals("Liked"))
		{
			System.out.println("You already liked this page");
		}
		Thread.sleep(10000);
		driver.findElementByLinkText("TestLeaf").click();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		if(driver.getTitle().contains("TestLeaf"))
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
		Thread.sleep(5000);
		WebElement NoofLikes = driver.findElementByXPath("//[@id='PagesProfileHomeSecondaryColumnPagelet']/div/div[2]/div/div[2]/div[3]/div/div[2]/div");
		System.out.println(NoofLikes);
		
		

		
		
		
		
		

	}
}
