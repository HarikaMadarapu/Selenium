package Week5day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.testng.listener.ExtentITestListenerClassAdapter;

import Week5Excel.ReadExcel1;
@Listeners(ExtentITestListenerClassAdapter.class)
public class BaseUtil {
	 public ChromeDriver driver;
	 public String fileName;
	 @BeforeMethod
	 @Parameters({"url","username","password"})
	
	public void login(String url,String name,String pw ){
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(url);
		driver.findElementById("username").sendKeys(name);
		driver.findElementById("password").sendKeys(pw);
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();

	}
	@AfterMethod
	public void closeApp() {
		driver.close();
	}
	@DataProvider(name="harika")
	public String[][] getData(){

		return ReadExcel1.getData(fileName);
	}

}
