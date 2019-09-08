package org.testleaf.zoomcar.pages;

import org.testleaf.leaftaps.base.ProjectSpecificMethods;

public class StartPage extends ProjectSpecificMethods{
	
	public StartPage clickThuraipakam()
	{
		driver.findElementByXPath("(//div[@class='items'])[1]").click();
		return this;
	}
	public PickupPage clickNext()
	{
		driver.findElementByXPath("//button[text()='Next']").click();
		return new PickupPage();
	}

}
