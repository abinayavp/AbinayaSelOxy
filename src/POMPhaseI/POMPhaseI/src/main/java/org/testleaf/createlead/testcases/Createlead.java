package org.testleaf.createlead.testcases;

import org.testleaf.createlead.pages.CreateLeadLoginPage;
import org.testleaf.leaftaps.base.ProjectSpecificMethods;
import org.testng.annotations.Test;

@Test
public class Createlead extends ProjectSpecificMethods{
	
	@Test
	public void runCreateLead()
	{
		new CreateLeadLoginPage().enterUsername().enterPassword().clickLogin().
		clickCRMSFA().clickLeads().clickCreateLead().enterCompany().enterFirstName().
		enterLastName().clickCreateLead().clickEdit();
		
	}



	

}
