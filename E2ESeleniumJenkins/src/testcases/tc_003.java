package testcases;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class tc_003{
	
		
@Test
public void testcase()
{
	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/Driver/chromedriver");
	ChromeDriver driver  = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.findElementById("email").sendKeys("ganesan");
	driver.findElementById("pass").sendKeys("ganesh");
	driver.quit();
	
			
}



}
