package recallingTopics;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTables {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		/*driver.get("http://testleaf.herokuapp.com/pages/table.html");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		List<WebElement> ele=driver.findElementsByXPath("//tbody/tr");
		System.out.println(ele.size());
		List<WebElement> ele1=driver.findElementsByXPath("//tbody/tr[2]/td");
		System.out.println(ele1.size());*/
		driver.get("http://testleaf.herokuapp.com/pages/Window.html");
		String parentwindow=driver.getWindowHandle();
		driver.findElementByXPath("//button[text()='Open Home Page']").click();
		 Set<String> s1=driver.getWindowHandles();		
	        Iterator<String> i1=s1.iterator();		
	        		
	        while(i1.hasNext())			
	        {		
	            String ChildWindow=i1.next();		
	            		
	            if(!parentwindow.equalsIgnoreCase(ChildWindow))			
	            {    		
	                 
	                    // Switching to Child window
	                    driver.switchTo().window(ChildWindow);	                                                                                                           
	                    
	            }            			
		
		
		//driver.switchTo().window(parentwindow);


	}
	        driver.close();
}
}