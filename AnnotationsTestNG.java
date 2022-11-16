package TestNGSample.TestNGSample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationsTestNG {
	public WebDriver driver;
	public String url = "https://www.amazon.in/";

	@BeforeSuite
	public void initializeBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\geeth\\eclipse-workspace\\TestNGSample\\src\\main\\java\\Resourses\\chromedriver.exe");
		driver = new ChromeDriver();
		System.out.println("initialize Browser");
	}

	@BeforeTest
	public void manageBrowser() {
		driver.manage().window().maximize();
		System.out.println("Maximize the browser");
	}

	@BeforeClass
	public void siteUrl() {
		driver.get(url);
		System.out.println("redirect to given url");
	}

	@BeforeMethod
	public void Login() {
		driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']")).click();
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("geethua95@gmail.com");
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("Geethu@2001");
		driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
	}

	@Test
	public void urlVerify() {
		String actualUrl = "https://www.amazon.in/?ref_=nav_ya_signin", expurl;
		expurl = driver.getCurrentUrl();
		Assert.assertEquals(expurl, actualUrl);
	}

	@AfterMethod
	public void logo() {
		driver.findElement(By.xpath("//a[@id='nav-logo-sprites']")).click();
		System.out.println("click logo");
	}

	@AfterClass
	public void closeBrowser() {
		driver.close();
		System.out.println("browser close");
	}

	@AfterTest
	public void generateReport() {
		System.out.println("generate report of the test");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("after suite method");
	}
}
