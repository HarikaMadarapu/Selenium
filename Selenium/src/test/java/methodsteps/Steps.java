package methodsteps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {
	public ChromeDriver driver;
	@Given("Open the Browser")
	public void openTheBrowser() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver=new ChromeDriver();
//	  throw new cucumber.api.PendingException();
	}

	@Given("Max the Browser")
	public void maxTheBrowser() {
		driver.manage().window().maximize();
	    //throw new cucumber.api.PendingException();
	}

	@Given("Set the Timeout")
	public void setTheTimeout() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    //throw new cucumber.api.PendingException();
	}

	@Given("Navigate to URL")
	public void navigateToURL() {
		driver.get("http://leaftaps.com/opentaps/control/main");
	    //throw new cucumber.api.PendingException();
	}

	@Given("Enter the UserName as Demosalesmanager")
	public void enterTheUserNameAsDemosalesmanager() {
		driver.findElementById("username").sendKeys("demosalesmanager");
		
		
		
	    //throw new cucumber.api.PendingException();
	}

	@Given("Enter the pw as crmsfa")
	public void enterThePwAsCrmsfa() {
		driver.findElementById("password").sendKeys("crmsfa");
	    //throw new cucumber.api.PendingException();
	}

	@When("Click on Login Button")
	public void clickOnLoginButton() {
		driver.findElementByClassName("decorativeSubmit").click();
	    //throw new cucumber.api.PendingException();
	}

	@Then("Verify Login is successful")
	public void verifyLoginIsSuccessful() {
	    System.out.println("Login is successful");
	    //throw new cucumber.api.PendingException();
	}
	
	@Then("Click on crmsfa")
	public void clickOnCrmsfa() {
		driver.findElementByLinkText("CRM/SFA").click();
	    //throw new cucumber.api.PendingException();
	}

	@Then("Click on Leads")
	public void clickOnLeads() {
		driver.findElementByLinkText("Leads").click();
	    //throw new cucumber.api.PendingException();
	}

	/*@Then("Click on CreateLead")
	public void clickOnCreateLead() {
		driver.findElementByLinkText("Create Lead").click();
	    //throw new cucumber.api.PendingException();
	}*/

//	@Then("Enter details")
//	public void enterDetails() {
//		driver.findElementById("createLeadForm_companyName").sendKeys("ibm");
//		driver.findElementById("createLeadForm_firstName").sendKeys("harika");
//		driver.findElementById("createLeadForm_lastName").sendKeys("rao");
//	    //throw new cucumber.api.PendingException();
//	}
	/*@Then("companyName as (.*)")
	public void companyname_as_ibm(String cName) {
		driver.findElementById("createLeadForm_companyName").sendKeys(cName);
	}

	@Then("firstName as (.*)")
	public void firstname_as_harika(String fName) {
		driver.findElementById("createLeadForm_firstName").sendKeys(fName);
	}

	@Then("lastName as (.*)")
	public void lastname_as_rao(String lname) {
		driver.findElementById("createLeadForm_lastName").sendKeys(lname);
	}

	@Then("Submit")
	public void submit() {
		driver.findElementByName("submitButton").click();
	    //throw new cucumber.api.PendingException();
	}
	@Then("LeadCreated")
	public void leadcreated() {
	    System.out.println("Lead created");
	//    throw new cucumber.api.PendingException();
	}*/
	

	@Then("Click on Find Leads")
	public void click_on_Find_Leads() {
		driver.findElementByXPath("(//div[@class='frameSectionBody']//a)[3]").click();
	}

	@Then("Goto Email")
	public void goto_Email() {
		driver.findElementByXPath("(//span[@class='x-tab-strip-text '])[3]").click();
	}

	@Then("Enter email")
	public void enter_email() {
		driver.findElementByName("emailAddress").sendKeys("@gmail.com");
	}

	@Then("Click on FindLead")
	public void click_on_FindLead() throws InterruptedException {
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(5000);
	}

	@Then("Click on TopLead")
	public void click_on_TopLead() {
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").click();
	}

	@Then("Click on Editbutton")
	public void click_on_Editbutton() {
		driver.findElementByLinkText("Edit").click();
	}

	@Then("Clear companyName")
	public void clear_companyName() {
		driver.findElementById("updateLeadForm_companyName").clear();
	}

	@Then("Enter companyName")
	public void enter_companyName() {
		driver.findElementById("updateLeadForm_companyName").sendKeys("TestLeaf");
	}

	@Then("Click on Update")
	public void click_on_Update() {
		driver.findElementByXPath("//input[@value='Update']").click();	}

	@Then("updated")
	public void updated() {
		String attribute = driver.findElementById("viewLead_companyName_sp").getText();
		System.out.println("Comapny Name "+attribute);
		if(attribute.contains("TestLeaf"))
			System.out.println("Company name Updated");
		else
			System.out.println("Company name not updated");
		driver.close();
	}

}
