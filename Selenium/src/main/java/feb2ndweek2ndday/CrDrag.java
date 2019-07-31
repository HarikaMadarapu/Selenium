package feb2ndweek2ndday;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By.ByName;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CrDrag {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://jqueryui.com/draggable/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//driver.findElement(ByName.)
		driver.switchTo().frame(0);
		WebElement drag = driver.findElementById("draggable");
		int x=drag.getLocation().getX();
		int y=drag.getLocation().getY();
		Actions builder=new Actions(driver);
		builder.dragAndDropBy(drag, x+50, y+50).perform();
		
		

	}

}
