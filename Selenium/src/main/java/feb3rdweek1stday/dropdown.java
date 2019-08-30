package feb3rdweek1stday;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.globalsqa.com/demo-site/select-dropdown-menu/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		/*WebElement tn = driver.findElementByXPath("//p//child::select");
		Select dd=new Select(tn);
		dd.selectByIndex(0);
	
        List<WebElement> options = dd.getOptions();
        for (WebElement webElement : options) {
			System.out.println(webElement);
		}*/
	}

}
