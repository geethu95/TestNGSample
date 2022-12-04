package TestNGSample.TestNGSample;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Locators extends Base {
	@Test(description = "locating by Id,amazon site")
	public void locateById() {
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 14 pro max case");
		driver.findElement(By.id("nav-search-submit-text")).click();
	}

	@Test(description = "locate class obsqura")
	public void locatingByClass() {
		driver.findElement(By.className("top-logo")).click(); // logo of obsqurazone

	}

	@Test(priority=2)
	public void locateByClass() throws InterruptedException {
		driver.findElement(By.className("hm-icon-label")).click(); // all option in header tab\
		// driver.findElement(By.className("icp-nav-flag icp-nav-flag-in
		// icp-nav-flag-discoverability-t1r")).click();
	}

	@Test(priority=1)
	public void locateByName() {
		driver.findElement(By.name("field-keywords")); // search box after searching
	}

	@Test(description = "locate by CSS Id")
	public void locateByCssID() {
		driver.findElement(By.cssSelector("input#twotabsearchtextbox")).click(); // search box

	}

	@Test(priority=0)
	public void locateByCssClass() {
		driver.findElement(By.cssSelector("span.hm-icon-label")).click(); // all in header

	}

	@Test(description = "locate by CSS tag")
	public void locateByCssTag() {
		driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']")).click();
	}

	@Test(description = "locate by Xpath")
	public void locateByXpath() {
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).click();
		driver.findElement(By.xpath("//span[text()='All']"));
		driver.findElement(By.xpath("(//span[text()='All'])[2]")); //to find element in 2nd index for multiple result
	}
	
	@Test(description="Locate by link text")
	public void linkText() {
		driver.findElement(By.linkText("Radio Buttons Demo")).click();
		
	}
	
	@Test(description="Locate by partial link  text")
	public void partiallinkText() {
		driver.findElement(By.partialLinkText("Radio Buttons")).click();
	}
	
	@Test()
	public void axesMethods() {
		driver.findElement(By.xpath("//input[contains(@id,'single-input')]")).sendKeys("test");
	}
	
	@Test()
	public void orAndANDmethod() {
		driver.findElement(By.xpath("//input[@id='single-input' or @placeholder='Message' ]")).sendKeys("test");
		driver.findElement(By.xpath("//input[@class='form-control' and @id='single-input-field' ]")).sendKeys("test");
		
	}
	
	@Test()
	public void startsWith() {
		driver.findElement(By.xpath("//input[starts-with(@id,'single-input')]")).sendKeys("test");
		
		//text
		driver.findElement(By.xpath("//label[text()='Enter Message']"));
		
		//child
		driver.findElement(By.xpath("//div[@class='form-group']//child::input[@id='single-input-field']"));
		
		//locate parent from child xpath
		driver.findElement(By.xpath("//input[@id='single-input-field']//parent::div"));
		
		//locate ancestors
		driver.findElement(By.xpath("//input[@id='single-input-field']//ancestor::div"));   //locate all ancestors
		driver.findElement(By.xpath("//input[@id='single-input-field']//ancestor::div[@class='container page']"));  //locate the ancestor with class container page
		
		//following
		driver.findElement(By.xpath("//input[@id='single-input-field']//following::input"));   //all the input labels following the current node will be located
		driver.findElement(By.xpath("//input[@id='single-input-field']//following::input[@id='value-b']"));
		
		//preceding
		driver.findElement(By.xpath("//input[@id='single-input-field']//preceding::div"));
		driver.findElement(By.xpath("//input[@id='single-input-field']//preceding::div[@class='container']"));
		
		//siblings
		driver.findElement(By.xpath("//input[@id='single-input-field']//following-sibling::button"));
		
		//self
		driver.findElement(By.xpath("//input[@id='single-input-field']//self::input"));
	}
}
