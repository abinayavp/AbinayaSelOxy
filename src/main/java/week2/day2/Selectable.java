package week2.day2;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selectable {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/selectable/");
		WebElement drop1 = driver.findElementByLinkText("Item 1");
		WebElement drop2 = driver.findElementByLinkText("Item 3");
		WebElement drop3 = driver.findElementByLinkText("Item 5");
		Actions builder = new Actions(driver);
		builder.keyDown(Keys.ARROW_DOWN).click(drop1).click(drop2).click(drop3).keyUp(Keys.ARROW_UP).perform();
	}

}
