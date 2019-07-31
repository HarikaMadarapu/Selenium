package feb4thweek1stclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CrAlert {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.switchTo().frame("iframeResult");
	    driver.findElementByXPath("//button[text()='Try it']").click();
		Alert alert1 = driver.switchTo().alert();
		alert1.sendKeys("harika");
		//System.out.println(alert1.getText());
		driver.switchTo().alert().accept();
		String ids= driver.findElementById("demo").getText();
		if(ids.contains("harika"))
		{
			System.out.println("verified");
		}
		else {
			System.out.println("wrong");
		}
		

	}

}
