package seleniumImp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnabledCheck {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		//WebDriver driver=new ChromeDriver();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in");
		driver.manage().window().maximize();
		
		String expectedTitle="Google";
		String actualTitle=driver.getTitle();
		if(expectedTitle.contains(actualTitle)) {
			System.out.println("Verification successful");
		}
		else {
			System.out.println("Verification failed");
		}
		//boolean enabled=driver.findElementByXPath("//input[@value='Google Search']").isEnabled();
		boolean enabled=driver.findElementById("gsr").isDisplayed();
			System.out.println(enabled);
			/*driver.findElementById("gsr").sendKeys("selenium");
	
		boolean displayed=driver.findElementByXPath("//input[@value='Google Search']").isDisplayed();
		boolean enabled1=driver.findElementByXPath("//input[@value='Google Search']").isEnabled();
		System.out.println(displayed);
		System.out.println(enabled1);*/
	}

}
