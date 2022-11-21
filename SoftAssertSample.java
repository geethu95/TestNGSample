package TestNGSample.TestNGSample;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertSample extends Base{
	@Test
	public void softAssert() {
		String actualTitle,expectedTitle="Obsqura Testing",actualUrl,expUrl="https://selenium.obsqurazone.com/simple-form-demo.php";
		actualTitle = driver.getTitle();  
		actualUrl=driver.getCurrentUrl();
		SoftAssert softAssert=new SoftAssert();
		softAssert.assertEquals(actualTitle, expectedTitle);
		softAssert.assertEquals(actualUrl, expUrl);
		softAssert.assertAll();
	}

}
