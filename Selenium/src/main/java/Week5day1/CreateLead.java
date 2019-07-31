package Week5day1;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Week5Excel.ReadExcel1;

public class CreateLead extends BaseUtil{
    
	@Test(dataProvider="harika")
	
	public  void createLead(String off,String fname,String lname ) {
		
		
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys(off);
		driver.findElementById("createLeadForm_firstName").sendKeys(fname);
		driver.findElementById("createLeadForm_lastName").sendKeys(lname);
		driver.findElementByName("submitButton").click();
		String title=driver.getTitle();
		System.out.println("Page title is "+title);
		driver.findElementByLinkText("Edit").click();
		//Drop Down
		WebElement industry = driver.findElementById("updateLeadForm_industryEnumId");
		Select dd1=new Select(industry);
		dd1.selectByVisibleText("Computer Software");//Select by visible text
		WebElement ownership = driver.findElementById("updateLeadForm_ownershipEnumId");
		Select dd2=new Select(ownership);
		List<WebElement> dropDown = dd2.getOptions();
		dd2.selectByIndex(dropDown.size()-1);//Select by index
		WebElement submitButton = driver.findElementByClassName("smallSubmit");
		WebElement currency = driver.findElementById("updateLeadForm_currencyUomId");
		Select dd3=new Select(currency);
		dd3.selectByValue("INR");//select by value
		submitButton.click();
	//WebElement userName=driver.findElementById("username",Keys.TAB);
		//Thread.sleep(3000);
	}
	@DataProvider(name="harika")
public String[][] getData() throws IOException{
//		String[][] data=new String[3][3];
//		data[0][0]="IBM";
//		data[0][1]="aa";
//		data[0][2]="a1";
//		data[1][0]="IBM";
//		data[1][1]="bb";
//		data[1][2]="b1";
//		data[2][0]="IBM";
//		data[2][1]="cc";
//		data[2][2]="c1";
		
		
		return ReadExcel1.getData(CreateLead);
		
	}

}
