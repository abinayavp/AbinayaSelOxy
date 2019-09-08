package org.testleaf.createlead.pages;

import org.testleaf.leaftaps.base.ProjectSpecificMethods;

public class CreateLeadHomePage extends ProjectSpecificMethods{
	public CreateLeadMyHomePage clickCRMSFA()
	{
		driver.findElementByLinkText("CRM/SFA").click();
		return new CreateLeadMyHomePage();
		
	}

}
