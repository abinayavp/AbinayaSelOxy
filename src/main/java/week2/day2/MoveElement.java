package week2.day2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveElement {

	
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/draggable/");
		driver.switchTo().frame(0);
		
	    WebElement drag = driver.findElementById("draggable");
	    
		Actions builder = new Actions(driver);
		//int x = drag.getLocation().getX();	
		builder.dragAndDropBy(drag, 50,50).perform();

	
		
	}
}
