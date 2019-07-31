package feb2ndweek1stday;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.get("http://leaftaps.com/opentaps/");
WebElement userName=driver.findElementById("username");
userName.sendKeys("DemoSalesManager");
driver.findElementById("password").sendKeys("crmsfa");
driver.findElementByClassName("decorativeSubmit").click();
driver.findElementByLinkText("CRM/SFA").click();
driver.findElementByLinkText("Create Lead").click();
driver.findElementById("createLeadForm_companyName").sendKeys("abcd");
driver.findElementById("createLeadForm_firstName").sendKeys("ab");
driver.findElementById("createLeadForm_lastName").sendKeys("cd");
driver.findElementByName("submitButton").click();
driver.findElementByLinkText("Edit").click();

WebElement findElementById1 = driver.findElementById("updateLeadForm_industryEnumId");
Select dd1=new Select (findElementById1);
dd1.selectByVisibleText("Computer Software");
WebElement findElementById2 = driver.findElementById("updateLeadForm_ownershipEnumId");
Select dd2=new Select(findElementById2);
List<WebElement> options = dd2.getOptions();
dd2.selectByIndex(options.size()-1);

//dd2.selectByIndex(index);
//String title = driver.getTitle();
//System.out.println(title);
	}
}