package seleniumImp;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class LearningWindows {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.toolsqa.com/automation-practice-switch-windows/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementById("button1").click();
		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);

		Set<String> windowHandles = driver.getWindowHandles();
		int count=windowHandles.size();
		Iterator<String> i1=windowHandles.iterator();
		while(i1.hasNext()){
			driver.switchTo().window(i1.next());
			System.out.println(driver.getTitle());
			driver.manage().window().maximize();

			driver.findElementByXPath("//a[@href='http://toolsqa.com/selenium-tutorial/']/img").click();
		}
		//Thread.sleep(6000);
		//driver.close();

		//driver.switchTo().window(windowHandle);
	}

}
