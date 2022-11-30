package TestNGSample.TestNGSample;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AxesMethods extends Base {
	
	@Test()
	public void axesMethods() {
		String input="test";
		String actualMessage,expectedMessage="Your Message : "+input;
		driver.findElement(By.xpath("//input[contains(@id,'single-input')]")).sendKeys(input);
		driver.findElement(By.xpath("//button[contains(@id,'button-one')]")).click();
		actualMessage=driver.findElement(By.xpath("//div[contains(@id,'message-one')]")).getText();
		Assert.assertEquals(actualMessage, expectedMessage);	
	}
	
	@Test()
	public void orMethod() {
		String input="sample";
		String actualMessage,expectedMessage="Your Message : "+input;
		driver.findElement(By.xpath("//input[@id='single-input' or @placeholder='Message' ]")).sendKeys(input);
		driver.findElement(By.xpath("//button[@id='button-one' or @class='btn btn-primary']")).click();
		actualMessage=driver.findElement(By.xpath("//div[@id='message-one' or @class='my-2']")).getText();
		Assert.assertEquals(actualMessage, expectedMessage);	
	}
	
	@Test()
	public void andMethod() {
		String input="testing";
		String actualMessage,expectedMessage="Your Message : "+input;
		driver.findElement(By.xpath("//input[@class='form-control' and @id='single-input-field' ]")).sendKeys(input);
		driver.findElement(By.xpath("//button[@id='button-one' and @class='btn btn-primary']")).click();
		actualMessage=driver.findElement(By.xpath("//div[@id='message-one' and @class='my-2']")).getText();
		Assert.assertEquals(actualMessage, expectedMessage);	
	}
}
