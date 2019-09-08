package org.testleaf.createlead.pages;

import org.testleaf.leaftaps.base.ProjectSpecificMethods;

public class CreateLeadMyHomePage extends ProjectSpecificMethods {
	public CreateLeadMyHomePage clickLeads()
	{
		driver.findElementByLinkText("Leads").click();
		return this;
	}
	public CreateLeadPage clickCreateLead()
	{
		driver.findElementByLinkText("Create Lead").click();
		return new CreateLeadPage();
	}
	

}
