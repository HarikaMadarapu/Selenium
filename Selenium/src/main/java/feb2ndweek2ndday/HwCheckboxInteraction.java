package feb2ndweek2ndday;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HwCheckboxInteraction {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/checkbox.html");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		List<WebElement> CheckboxElements = driver.findElementsByXPath("//input[@type='checkbox']");
		
		//System.out.println(CheckboxElements.size());
		for(WebElement CheckboxElements1:CheckboxElements) {
			if(CheckboxElements1.isSelected()) {
				CheckboxElements1.click();
			}
			
		}
	}

}
