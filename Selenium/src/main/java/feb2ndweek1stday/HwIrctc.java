package feb2ndweek1stday;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HwIrctc {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		WebElement findElementById1 = driver.findElementById("userRegistrationForm:userName");
		findElementById1.sendKeys("HarikaMadarapu");
		driver.findElementById("userRegistrationForm:password").sendKeys("snithik@16");
		driver.findElementById("userRegistrationForm:confpasword").sendKeys("snithik@16");
		WebElement findElementById11 = driver.findElementById("userRegistrationForm:securityQ");
		Select dd1=new Select (findElementById11);
		dd1.selectByVisibleText("What is your pet name?");
		driver.findElementById("userRegistrationForm:securityAnswer").sendKeys("doggy");
		WebElement id = driver.findElementById("userRegistrationForm:prelan");
		Select dd2=new Select(id);
		dd2.selectByIndex(0);
		driver.findElementById("userRegistrationForm:firstName").sendKeys("Harika");
		driver.findElementByXPath("(//input[@name='userRegistrationForm:gender'])[2]").click();
		driver.findElementByXPath("(//input[@name='userRegistrationForm:gender'])[2]").click();
		driver.findElementByXPath("//label[text()=' Unmarried']").click();
		WebElement findElementById3 = driver.findElementById("userRegistrationForm:dobDay");
		Select dd3=new Select(findElementById3);
		dd3.selectByVisibleText("29");
		WebElement findElementById4 = driver.findElementById("userRegistrationForm:dobMonth");
		Select dd4=new Select(findElementById4);
		dd4.selectByVisibleText("DEC");
		WebElement findElementById5 = driver.findElementById("userRegistrationForm:dateOfBirth");
		Select dd5=new Select(findElementById5);
		dd5.selectByVisibleText("1995");
		WebElement findElementById10 = driver.findElementById("userRegistrationForm:occupation");
		Select dd10=new Select(findElementById10);
		dd10.selectByVisibleText("Government");
		WebElement findElementById6 = driver.findElementById("userRegistrationForm:countries");
		Select dd6=new Select(findElementById6);
		dd6.selectByIndex(1);
		driver.findElementById("userRegistrationForm:email").sendKeys("harikarao6@gmail.com");
		driver.findElementById("userRegistrationForm:mobile").sendKeys("9701351651");
		
		WebElement findElementById7 = driver.findElementById("userRegistrationForm:nationalityId");
		Select dd7=new Select(findElementById7);
		dd7.selectByIndex(0);
		driver.findElementById("userRegistrationForm:address").sendKeys("dhjdjsjdj");
		driver.findElementById("userRegistrationForm:pincode").sendKeys("600125");
		driver.findElementById("userRegistrationForm:pincode").sendKeys(Keys.TAB);
		Thread.sleep(3000);
		driver.findElementById("userRegistrationForm:statesName").sendKeys("TamilNadu");
		WebElement findElementById8 = driver.findElementById("userRegistrationForm:cityName");
		Select dd8=new Select(findElementById8);
		List<WebElement> options = dd8.getOptions();
		dd8.selectByIndex(0);
		WebElement findElementById9 = driver.findElementById("userRegistrationForm:postofficeName");
		Select dd9=new Select(findElementById8);
		//List<WebElement> options = dd9.getOptions();
		dd8.selectByIndex(1);
		driver.findElementById("userRegistrationForm:landline").sendKeys("9701351651");
		driver.findElementByXPath("(//label[text()=' Yes'])[1]");
		
		
		
		
		
	}

}
;