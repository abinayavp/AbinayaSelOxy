package org.testleaf.createlead.pages;

import org.testleaf.leaftaps.base.ProjectSpecificMethods;
import org.testleaf.leaftaps.pages.HomePage;
import org.testleaf.leaftaps.pages.LoginPage;

public class CreateLeadLoginPage extends ProjectSpecificMethods{
	
	public CreateLeadLoginPage enterUsername() {
		driver.findElementById("username").sendKeys("DemosalesManager");
		return this;
	}

	public CreateLeadLoginPage enterPassword() {
		driver.findElementById("password").sendKeys("crmsfa");
		return this;
	}

	public CreateLeadHomePage clickLogin() {
		driver.findElementByClassName("decorativeSubmit").click();
		//HomePage page = new HomePage();
		return new CreateLeadHomePage();
	}


}
