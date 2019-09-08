package org.testleaf.zoomcar.pages;

import org.testleaf.leaftaps.base.ProjectSpecificMethods;

public class DropoffPage extends ProjectSpecificMethods {
	public BookCarPage clickDone()
	{
		driver.findElementByXPath("//button[@class='proceed']").click();
		return new BookCarPage();
	}

}
