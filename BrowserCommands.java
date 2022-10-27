package TestNGSample.TestNGSample;

import org.testng.annotations.Test;

public class BrowserCommands extends Base {

	@Test
	public void basicCommands() {
		String actualTitle, actualURL, pagesource, expectedTitle = "Obsqura Tesng";
		actualTitle = driver.getTitle(); // to get the page title
		actualURL = driver.getCurrentUrl(); // to get current page url
		pagesource = driver.getPageSource(); // to get page source
	}

	@Test
	public void navigateCommands() throws InterruptedException {
		// Thread.sleep(2000);
		driver.navigate().to("https://selenium.obsqurazone.com/radio-button-demo.php");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh(); // will refresh the page
	}

}
