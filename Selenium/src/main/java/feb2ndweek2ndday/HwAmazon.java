package feb2ndweek2ndday;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HwAmazon {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/?ie=UTF8&tag=googinabkkenshoo-21&ascsubtag=_k_EAIaIQobChMImr6OsIPK4AIVyBWPCh0BqAx4EAAYASAAEgJGo_D_BwE_k_&gclid=EAIaIQobChMImr6OsIPK4AIVyBWPCh0BqAx4EAAYASAAEgJGo_D_BwE");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//((JavascriptExecutor)driver).executeScript("scrollBy(0,3000)");
		//Thread.sleep(5000);
		
		driver.findElementById("twotabsearchtextbox").sendKeys("Induction Cookware");
		driver.findElementByXPath("(//input[@type='submit'])[1]").click();
		
		List<WebElement> CookWareList = driver.findElementsByXPath("//h2[@class='a-size-medium s-inline  s-access-title  a-text-normal']");
		Thread.sleep(500);
		System.out.println(CookWareList);
		
//		for(WebElement e: CookWareList)
//		{
//			System.out.println(e.getText());
//		}
//		
//		CookWareList.get(0).click();
		
		
		//((JavascriptExecutor)driver).executeScript("scrollBy(0,6000)");
		
		
		//driver.close();
		

		
		

	}

}
