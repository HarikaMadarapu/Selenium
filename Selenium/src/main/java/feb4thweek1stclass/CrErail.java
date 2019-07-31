package feb4thweek1stclass;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class CrErail {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementByLinkText("Contact Us").click();

		Set<String> Handles = driver.getWindowHandles();
		List<String> list=new ArrayList<String>();


		list.addAll(Handles);
		driver.switchTo().window(list.get(1));
		String title = driver.getTitle();
		System.out.println(title);
		driver.switchTo().window(list.get(0));
		driver.close();
		Thread.sleep(5000);
		driver.switchTo().window(list.get(1));
		driver.close();
	}

}
