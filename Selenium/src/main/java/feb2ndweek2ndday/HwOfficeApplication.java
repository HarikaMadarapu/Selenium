package feb2ndweek2ndday;

import java.awt.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HwOfficeApplication {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://w3.ibm./");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


		WebElement findElementByLinkText = driver.findElementByLinkText("Professional Marketplace");
		findElementByLinkText.click();

		Set<String> winlist = driver.getWindowHandles();
		List<String> wind = new ArrayList<String>();





		driver.findElementByXPath("//input[@id='mobile']").sendKeys("hmadarap@in.ibm.com");
		driver.findElementByName("password").sendKeys("feb12345rauary");

	}

}
