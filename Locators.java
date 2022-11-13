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
		
		//homework
		/*
		 * driver.navigate().to("https://www.flipkart.com/");
		 * driver.findElement(By.xpath("//input[@class='_3704LK']"));
		 * driver.findElement(By.xpath("//span[text()='Plus']")).click();
		 * driver.findElement(By.xpath("//img[@title='Flipkart']")).click();
		 * driver.findElement(By.xpath("//a[@xpath='1']")).click(); //view button
		 * driver.findElement(By.xpath("(//div[@class='_2Brcj4']/div)[2]")); //help in
		 * footer driver.navigate().to("https://www.ixigo.com/");
		 * driver.findElement(By.xpath("(//div[@title='Search. Book. Go.']"));
		 * driver.findElement(By.xpath("(//img[@title='assured']"));
		 * driver.navigate().to(
		 * "https://sp.booking.com/index.html?aid=2274635&label=U2FsdGVkX1/6DiE6hgrm09GxYAEMJFJDCz/ZZfsWKAY+hARc2/dzcKRAaSw/gYwT"
		 * ); driver.findElement(By.xpath("(//input[@name='ss']"));
		 * driver.findElement(By.
		 * xpath("(//a[@aria-labelledby='late_escape_cta late_escape_title']"));
		 * driver.findElement(By.
		 * xpath("(//div[@style='background-image: url(\"https://cf.bstatic.com/xdata/images/xphoto/540x405/167616822.webp?k=31bae8840b12db441ce925b86f3f5149fda3f9851de6dfbd48cfff89a6680b74&o=\");']"
		 * ));
		 */


		
		
	}

}
