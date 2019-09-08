package org.testleaf.zoomcar.pages;

import org.testleaf.leaftaps.base.ProjectSpecificMethods;

public class HomePage extends ProjectSpecificMethods{
	public StartPage clickStart()
	{
		driver.findElementByLinkText("Start your wonderful journey").click();
		return new StartPage();
	}

}
