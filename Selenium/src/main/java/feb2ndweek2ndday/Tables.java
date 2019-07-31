package feb2ndweek2ndday;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tables {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://testingpool.com/data-types-in-java/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		List<WebElement> rows=driver.findElementsByXPath("//div[@class='su-table']/table/tbody/tr");
		int rowcount=rows.size();
		System.out.println(rowcount);

	}

}
