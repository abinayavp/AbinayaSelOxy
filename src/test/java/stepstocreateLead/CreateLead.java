package stepstocreateLead;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class CreateLead {
	
	public ChromeDriver driver;
	
	@Given("Open the Chrome Browser")
	public void openTheChromeBrowser() {
		
//		System.out.println("BACKGROUND");
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");	
		driver= new ChromeDriver();
	    	}

	@Given("Maximize the Browser")
	public void maximizeTheBrowser() {
		driver.manage().window().maximize();
	}

	@Given("Set the timeout")
	public void setTheTimeout() {
	    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}

	@Given("Load the URL")
	public void loadTheURL() {
	   driver.get("http://leaftaps.com/opentaps/control/main");
	}

	@Given("Enter the User (.*) in the Login page")
	public void enterTheUserDemoSalesManagerInTheLoginPage(String username) {
		driver.findElementById("username").sendKeys(username);
	}

	@Given("Enter the password (.*) in the Login page")
	public void enterThePasswordCrmsfaInTheLoginPage(String password) {
		driver.findElementById("password").sendKeys(password);
	}

	@When("click on the Logic button in the login page")
	public void clickOnTheLogicButtonInTheLoginPage() {
		driver.findElementByClassName("decorativeSubmit").click();
			}	

	@When("click on the CRM\\/SFA")
	public void clickOnTheCRMSFA() {
		driver.findElementByLinkText("CRM/SFA").click();
	}

	@When("click on the Create Lead")
	public void clickOnTheCreateLead() {
		driver.findElementByLinkText("Create Lead").click();
	}

	@When("Enter the FirstName (.*)")
	public void enterTheFirstName(String fName) {
		
		driver.findElementById("createLeadForm_firstName").sendKeys(fName);
	}

	@When("Enter the Last Name (.*)")
	public void enterTheLastName(String lName) {
		driver.findElementById("createLeadForm_lastName").sendKeys(lName);	    
	}
	
	@When("Enter the Company Name (.*)")
	public void enterTheCompanyName(String cName) {
		driver.findElementById("createLeadForm_companyName").sendKeys(cName);
	}

	@When("Click on the CreteLead")
	public void clickOnTheCreteLead() {
		driver.findElementByClassName("smallSubmit").click();
	}





}
