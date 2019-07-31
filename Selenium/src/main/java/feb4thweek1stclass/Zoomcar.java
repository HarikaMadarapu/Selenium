package feb4thweek1stclass;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import bsh.Capabilities;

public class Zoomcar {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zoomcar.com/chennai/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementByLinkText("Start your wonderful journey").click();
		//driver.executeScript("document.body.style.zoom='80%'");
		driver.findElementByXPath("//div[contains(text(),'Thuraipakkam')]").click();
		driver.findElementByXPath("//button[contains(text(),'Next')]").click();
		Date date=new Date();
		DateFormat sdf=new SimpleDateFormat("dd");
		String today=sdf.format(date);
		Integer tomorrow=Integer.parseInt(today)+1;
		//System.out.println(tomorrow);
		String s = tomorrow.toString();
		System.out.println(s);
		driver.findElementByXPath("//div[@class='days']/div[2]").click();
		driver.findElementByXPath("//button[contains(text(),'Next')]").click();
		driver.findElementByXPath("//button[contains(text(),'Done')]").click();
		Thread.sleep(5000);
		
//		List<WebElement> elements1 = driver.findElementsByXPath("//div[@class='details']/h3");
		List<WebElement> elements1 = driver.findElementsByXPath("//div[@class='price']");
		List<String> allcars=new ArrayList<String>();
		int j=elements1.size();
		System.out.println(j);
		
		for (int i=0;i<j;i++) {
			allcars.add(elements1.get(i).getText());
			System.out.println(elements1.get(i).getText());
			//System.out.println(allcars);
		}
		Object obj=Collections.max(allcars);
		System.out.println(obj);
		driver.findElementByXPath("//div[contains(text(),' Price: High to Low ')]").click();
		
		
		
		
	  
	    //String s1;
	  /*  for(int p=0;p<elements1.size();p++) {
	    	 s1=elements1.get(p).getText();
	    	System.out.println(s1);
	    	}*/
	  //  String
	    

	}

}
