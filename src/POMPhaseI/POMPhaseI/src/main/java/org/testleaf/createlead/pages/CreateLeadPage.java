package org.testleaf.createlead.pages;

import org.testleaf.leaftaps.base.ProjectSpecificMethods;

public class CreateLeadPage extends ProjectSpecificMethods {
	public CreateLeadPage enterCompany()
	{
		driver.findElementById("createLeadForm_companyName").sendKeys("CTS");
		return this;
	}
	public CreateLeadPage enterFirstName()
	{
		driver.findElementById("createLeadForm_firstName").sendKeys("VP");
		return this;
	}
	public CreateLeadPage enterLastName()
	{
		driver.findElementById("createLeadForm_lastName").sendKeys("Abinaya");
		return this;
	}
	public CreateLeadViewLead clickCreateLead()
	{
		driver.findElementByClassName("smallSubmit").click();
		return new CreateLeadViewLead();
	}

}
