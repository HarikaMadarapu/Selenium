package seleniumImp;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Links {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/Link.html");
		driver.findElementByLinkText("Go to Home Page").click();
		Thread.sleep(5000);
		driver.navigate().back();
		
		Actions act=new Actions(driver);
		Thread.sleep(5000);
		act.moveToElement(driver.findElementByLinkText("Go to Home Page")).click().perform();
		driver.navigate().back();
		Thread.sleep(5000);
		List<WebElement> findElementsByTagName = driver.findElementsByTagName("link");
		WebElement webElement = findElementsByTagName.get(0);
		webElement.click();
	}



}
