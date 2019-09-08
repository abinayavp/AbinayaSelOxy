package week3.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.swing.plaf.synth.SynthSeparatorUI;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnList {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElementById("txtStationFrom").clear();
		WebElement eleSource = driver.findElementById("txtStationFrom");
		eleSource.sendKeys("Mgr Chennai Ctr");
		eleSource.sendKeys(Keys.TAB);
		driver.findElementById("txtStationTo").clear();
		WebElement eleDestination = driver.findElementById("txtStationTo");
		eleDestination.sendKeys("Ksr Bengaluru");
		eleDestination.sendKeys(Keys.TAB);
		driver.findElementById("chkSelectDateOnly").click();
		List<String> trains = new ArrayList<String>();
		List<WebElement> listofTrains = driver.findElementsByXPath("//table[@class='DataTable TrainList TrainListHeader']//tr//td[2]/a");
		System.out.println(listofTrains.size());
		for (WebElement eachElement : listofTrains) {
			trains.add(eachElement.getText());
			}
		System.out.println(trains);
	int trainssize = trains.size();
	System.out.println(trainssize);
	
	if(listofTrains.size()==trainssize)
	{
		System.out.println("true");
	}
	else
	{
		System.out.println("False");
	}
	
}}