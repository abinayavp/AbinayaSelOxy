package org.testleaf.zoomcar.testcases;

import org.testleaf.leaftaps.base.ProjectSpecificMethods;
import org.testleaf.zoomcar.pages.HomePage;
import org.testng.annotations.Test;

public class TC001_CarBooking extends ProjectSpecificMethods {
	
	@Test
	public void runTC001() throws InterruptedException
	{
		new HomePage()
		.clickStart()
		.clickThuraipakam()
		.clickNext()
		.clickTomorrow()
		.clickNext()
		.clickDone()
		.clickHightoLow()
		.getFirstcarName();
	}
	

}
