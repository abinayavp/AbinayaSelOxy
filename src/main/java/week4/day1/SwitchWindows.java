package week4.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchWindows {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_win_open");
		driver.switchTo().frame("iframeResult");
		driver.findElementByXPath("//button[text()='Try it']").click();
		Set<String> allWin = driver.getWindowHandles();
		List<String> listWin = new ArrayList<String>(allWin);
		String window2 = listWin.get(1);
		driver.switchTo().window(window2);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());		
		String win1 = listWin.get(0);
		driver.switchTo().window(win1);
		driver.close(); 
}
}

