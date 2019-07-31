package feb4thweek1stclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class Anusha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/tasks/tasklist.do");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementById("username").sendKeys("admin");
		driver.findElementByName("pwd").sendKeys("manager");
		driver.findElementById("loginButton").click();
		driver.findElementByXPath("//div[.='3D modelling']/../../../../..//div[@class='img']").click();
		
	}

}
