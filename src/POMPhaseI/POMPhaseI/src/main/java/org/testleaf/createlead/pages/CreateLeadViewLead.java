package org.testleaf.createlead.pages;

import org.testleaf.leaftaps.base.ProjectSpecificMethods;

public class CreateLeadViewLead extends ProjectSpecificMethods{
	public void clickEdit()
	{
		 driver.findElementByLinkText("Edit").click();
		 
	}

}
