package org.testleaf.zoomcar.pages;

import org.testleaf.leaftaps.base.ProjectSpecificMethods;

public class PickupPage extends ProjectSpecificMethods {
	public PickupPage clickTomorrow()
	{
		driver.findElementByXPath("(//div[@class='day low-price'])[2]").click();
		return this;
	}
	public DropoffPage clickNext()
	{
		driver.findElementByClassName("proceed").click();
		return new DropoffPage();
	}

}

