package org.testleaf.zoomcar.pages;

import org.openqa.selenium.WebElement;
import org.testleaf.leaftaps.base.ProjectSpecificMethods;

public class BookCarPage extends ProjectSpecificMethods {
	public BookCarPage clickHightoLow() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElementByXPath("(//div[@class='item'])[7]").click();
		return this;
	}

	public BookCarPage getFirstcarName() {
		WebElement carName = driver.findElementByXPath("(//div[@class='details'])[1]/h3");
		System.out.println(carName.getText());
		return this;

	}
}
