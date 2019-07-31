package Feb3rdweek2ndday;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CrErail {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://erail.in/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementById("txtStationFrom").clear();
		driver.findElementById("txtStationFrom").sendKeys("MAS",Keys.TAB);
		driver.findElementById("txtStationTo").clear();
		driver.findElementById("txtStationTo").sendKeys("TVR",Keys.TAB);
		driver.findElementById("chkSelectDateOnly").click();
		driver.navigate().refresh();
		//driver.manage().window().
		List<WebElement> Trains = driver.findElementsByXPath("//table[@class='DataTable TrainList']/tbody/tr/td[1]");
		int j=Trains.size();
		System.out.println(Trains.size());
		Set<WebElement> TrainsList=new HashSet<WebElement>();
		TrainsList.addAll(Trains);
		int a=TrainsList.size();
		if(j==a)
		{
			System.out.println("Train nums are unique");
		}

		//		for(int i=0;i<Trains.size();i++)
		//		{
		//			System.out.println(Trains.get(i).getText());
		//		
		//		}

		//		for(int k=0;k<TrainsList.size();k++)
		//		{
		//			System.out.println(TrainsList.get(k));
		//		}
		List<WebElement> TrainNames = driver.findElementsByXPath("//table[@class='DataTable TrainList']/tbody/tr/td[2]");
		Set<WebElement> TrainNamesList=new TreeSet<WebElement>();
		TrainNamesList.addAll(TrainNames);

		for(int p=0;p<TrainNames.size();p++) {
			String s=TrainNames.get(p).getText();

			System.out.println(s);
		}

		//System.out.println(TrainNamesList);

	}

}
