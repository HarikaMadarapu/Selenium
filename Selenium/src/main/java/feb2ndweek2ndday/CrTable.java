package feb2ndweek2ndday;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CrTable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/table.html");
		List<WebElement> columns = driver.findElementsByXPath("//tr/th");
		int ncol=columns.size();
		System.out.println(ncol);
		List<WebElement> elements = driver.findElementsByXPath("//tr/td");
		int desc=elements.size();
		int nrow=desc/ncol;
		System.out.println(nrow);



		WebElement des = driver.findElementByXPath("//font[contains(text(),'Learn to interact with')]/following::td");
		System.out.println(des.getText());
		List<WebElement> elements1 = driver.findElementsByXPath("//font[contains(text(),'%')]");
		System.out.println(elements1.size());
		int in = 0;
		int min = 0;
		int count = 0;
		for(int i = 1;i<=elements1.size();i++) {
			String s=elements1.get(i-1).getText();
			String se=s.replaceAll("%","" );
			System.out.println(se);
			 in=Integer.parseInt(se);
		}
			System.out.println(in);
		
				/*if(i==1)
					{
						min=in;
						System.out.println(min);
					}
					if(in<min)
						{
							min=in;
							count=i;
					}
			
					}*/

					//driver.findElementByXPath("//font[contains(text(),'%')])["+count+"]/following::td").click();
		}


		
	}




	

