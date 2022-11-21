package TestNGSample.TestNGSample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class GuruBase {
	public WebDriver driver; 
	@BeforeMethod
		public void initializeBrowser() {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\geeth\\eclipse-workspace\\TestNGSample\\src\\main\\java\\Resourses\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://demo.guru99.com/test/ajax.html");
			driver.manage().window().maximize(); 
		}
		
		  @AfterMethod 
		  public void browserQuit() { 
			  driver.quit(); 
			  }
		  
		  public void browserClose() { 
			  driver.close();
			  }
}
