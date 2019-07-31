package feb4thweek1stclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		ChromeOptions op=new ChromeOptions();
		op.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(op);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementById("email").sendKeys("9701351651");
		driver.findElementById("pass").sendKeys("snithik@16");
		driver.findElementByXPath("//input[@value='Log In']").click();
		driver.findElementByXPath("//input[@name='q']").sendKeys("TestLeaf");
		driver.findElementByXPath("//button[@aria-label='Search']").click();
		String text = driver.findElementByXPath("//a[text()='TestLeaf'][1]").getText();
		if(text.equalsIgnoreCase("testleaf")) {
			System.out.println("testleaf is present");
		}
		else {
			System.out.println("no");
		}
		Thread.sleep(1000);
		String like = driver.findElementByXPath("(//button[@type='submit'])[4]").getText();
		if(like.equalsIgnoreCase("like")) {
			driver.findElementByXPath("(//button[@type='submit'])[4]").click();
		}
		else{
			System.out.println("it is already liked");
		}
		driver.findElementByXPath("//a[@href='https://www.facebook.com/TestleafSolutionsIncChennai/?ref=br_rs']").click();
		String title = driver.getTitle();
		if(title.contains("TestLeaf")) {
			System.out.println("title:"+title);
		}
		else {
			System.out.println("it is different page");
		}
		String text1=driver.findElementByXPath("(//div[@class='_4bl9'])[3]").getText();
		System.out.println(text1);
	}

	
}
