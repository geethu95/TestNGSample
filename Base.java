package TestNGSample.TestNGSample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base {
	public WebDriver driver; // declared globally as driver is used globally
@BeforeMethod
	public void initializeBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\geeth\\eclipse-workspace\\TestNGSample\\src\\main\\java\\Resourses");
		driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
		driver.manage().window().maximize(); // maximize the driver
	}
@AfterMethod
	public void browserQuit() {
		driver.quit();
	}

	public void browserClose() {
		driver.close(); // to close the browser
	}
}

//here browser initialization and loading is done, this can be called in other classes