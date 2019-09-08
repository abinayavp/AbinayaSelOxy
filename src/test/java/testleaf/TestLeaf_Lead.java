package testleaf;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class TestLeaf_Lead {

	public ChromeDriver driver;
	
@Given("Open the Chrome Browser")
public void openTheChromeBrowser() {
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
public void enterTheUserDemoSalesManagerInTheLoginPage(String UserName) {
	driver.findElementById("username").sendKeys(UserName);
}

@Given("Enter the password (.*) in the Login page")
public void enterThePasswordCmrsfaInTheLoginPage(String password) {
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
public void enterTheFirstNameAbi(String fName) {
	driver.findElementById("createLeadForm_firstName").sendKeys(fName);
}

@When("Enter the Last Name (.*)")
public void enterTheLastNameVP(String lName) {
	driver.findElementById("createLeadForm_lastName").sendKeys(lName);	   
}

@When("Enter the Company Name (.*)")
public void enterTheCompanyNameCTS(String cName) {
	driver.findElementById("createLeadForm_companyName").sendKeys(cName);
}

@When("Click on the CreteLead")
public void clickOnTheCreteLead() {
	driver.findElementByClassName("smallSubmit").click();
}

@When("click on the Leads")
public void clickOnTheLeads() {
	driver.findElementByLinkText("Leads").click();
}

@When("click on the first Lead")
public void clickOnTheFirstLead() throws InterruptedException {
	Thread.sleep(2000);
	driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a").click();
}

@When("Click on the Edit")
public void clickOnTheEdit() {
    driver.findElementByLinkText("Edit").click();
}

@When("edit the Company Name")
public void editTheCompanyName() {
  driver.findElementByName("companyName").sendKeys("CTS");
}

@When("Click on Update")
public void clickOnUpdate() {
driver.findElementByName("submitButton").click();
}

@When("click on Merge Leads")
public void clickOnMergeLeads() {
	driver.findElementByLinkText("Merge Leads").click();
}

@When("click on From Lead Icon")
public void clickOnFromLeadIcon() {
	driver.findElementByXPath("(//img[@alt='Lookup'])[1]").click();
}

@When("Enter the Lead ID")
public void enterTheLeadID() {
	Set<String> allWin = driver.getWindowHandles();
	List<String> listWin = new ArrayList <String>(allWin);
	String primary = listWin.get(0);
	String Window1 = listWin.get(1);
	driver.switchTo().window(Window1);	
	driver.findElementByName("id").sendKeys("101");
}

@When("click on Find Leads")
public void clickOnFindLeads() {
	driver.findElementByXPath("//button[text()='Find Leads']").click();
}

@When("Select the first record")
public void selectTheFirstRecord() throws InterruptedException {
	Thread.sleep(5000);
	driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a").click();
}

@When("click on To Lead Icon")
public void clickOnToLeadIcon() {
	Set<String> allWin = driver.getWindowHandles();
	List<String> listWin = new ArrayList <String>(allWin);
	String primary = listWin.get(0);
	driver.switchTo().window(primary);
	driver.findElementByXPath("(//img[@alt='Lookup'])[2]").click();
}

@When("click on the Merge")
public void clickOnTheMerge()
{
	Set<String> allWin1 = driver.getWindowHandles();
	List<String> listWin1 = new ArrayList <String>(allWin1);
	String primary1 = listWin1.get(0);	
	driver.switchTo().window(primary1);
	driver.findElementByLinkText("Merge").click();
	Alert alert = driver.switchTo().alert();
	alert.accept();
}

}
