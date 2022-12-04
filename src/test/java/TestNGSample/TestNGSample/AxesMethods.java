package TestNGSample.TestNGSample;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AxesMethods extends Base {
	
	@Test()
	public void containsMethods() {
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
	
	@Test()
	public void textMethod() {
		String input="testing";
		String actualMessage,expectedMessage="Your Message : "+input;
		driver.findElement(By.xpath("//label[text()='Enter Message']")).sendKeys(input);
		driver.findElement(By.xpath("//button[text()='Show Message']")).click();
		actualMessage=driver.findElement(By.xpath("//div[contains(text(),'Your Message')]")).getText();
		Assert.assertEquals(actualMessage, expectedMessage);	
	}
	@Test()
	public void startsWith() {
		String input="startswith";
		String actualMessage,expectedMessage="Your Message : "+input;
		driver.findElement(By.xpath("//input[starts-with(@id,'single-input')]")).sendKeys(input);
		driver.findElement(By.xpath("//button[starts-with(text(),'Show')]")).click();
		actualMessage=driver.findElement(By.xpath("//div[starts-with(text() ,'Your')]")).getText();    //not able to locate
		Assert.assertEquals(actualMessage, expectedMessage);	
	}
	
	@Test()
	public void childMethod() {
		String input="child";
		String actualMessage,expectedMessage="Your Message : "+input;
		driver.findElement(By.xpath("//div[@class='form-group']//child::input[@id='single-input-field']")).sendKeys(input);
		driver.findElement(By.xpath("//div[@class='card-body']//child::button[@id='button-one']")).click();
		actualMessage=driver.findElement(By.xpath("//div[@class='card-body']//child::div[@id='message-one']")).getText();    
		Assert.assertEquals(actualMessage, expectedMessage);	
	}
	
	@Test()
	public void parentMethod() {
		String input="parent";
		String actualMessage,expectedMessage="Your Message : "+input;
		driver.findElement(By.xpath("//div[@class='form-group']//child::input[@id='single-input-field']")).sendKeys(input);
		driver.findElement(By.xpath("//button[@id='button-one']//parent::button")).click();
		actualMessage=driver.findElement(By.xpath("//div[@id='message-one']//parent::div")).getText();    
		Assert.assertEquals(actualMessage, expectedMessage);	
	}
	
	@Test()
	public void ancestorsMethod() {
		
		driver.findElement(By.xpath("//input[@id='single-input-field']//ancestor::div"));
		driver.findElement(By.xpath("//button[@id='button-one']//ancestor::div"));
		driver.findElement(By.xpath("//div[@id='message-one']//ancestor::div"));
	}
	
	@Test()
	public void followingMethod() {
	
		driver.findElement(By.xpath("//input[@id='single-input-field']//following::input"));
		driver.findElement(By.xpath("//button[@id='button-one']//following::div"));
		driver.findElement(By.xpath("//div[@id='message-one']//following::div"));    
	}
	
	@Test()
	public void precedingMethod() {
		
		driver.findElement(By.xpath("//input[@id='single-input-field']//preceding::div"));
		driver.findElement(By.xpath("//button[@id='button-one']//preceding::div"));
		driver.findElement(By.xpath("//div[@id='message-one']//preceding::div"));    
			
	}
	
	@Test()
	public void selfMethod() {
		String input="self";
		String actualMessage,expectedMessage="Your Message : "+input;
		driver.findElement(By.xpath("//input[@id='single-input-field']//self::input")).sendKeys(input);
		driver.findElement(By.xpath("//button[@id='button-one']//self::button")).click();
		actualMessage=driver.findElement(By.xpath("//div[@id='message-one']//self::div")).getText();    
		Assert.assertEquals(actualMessage, expectedMessage);	
	}
	
}
