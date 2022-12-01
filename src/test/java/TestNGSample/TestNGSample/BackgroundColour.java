package TestNGSample.TestNGSample;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BackgroundColour extends Base {

	@Test
	public void getAttribute() {
		String ID, className, type,expID="button-one",expClass="btn btn-primary",expType="button";
		className = driver.findElement(By.xpath("//button[@id='button-one']")).getAttribute("class");
		Assert.assertEquals(className, expClass);
		ID = driver.findElement(By.xpath("//button[@id='button-one']")).getAttribute("id");
		Assert.assertEquals(ID, expID);
		type = driver.findElement(By.xpath("//button[@id='button-one']")).getAttribute("type");
		Assert.assertEquals(type, expType);
	}
	@Test
	public void getSize() {
		Dimension size;
		String expSize="(136, 38)";
		size = driver.findElement(By.xpath("//button[@id='button-one']")).getSize();
		Assert.assertEquals(size, expSize);
	}

	@Test
	public void button() {
		Boolean enabled, displayed, selected;
		enabled = driver.findElement(By.xpath("//button[@id='button-one']")).isEnabled(); // button is enabled?
		Assert.assertTrue(true, "is enabled");
		displayed = driver.findElement(By.xpath("//button[@id='button-one']")).isDisplayed(); // text displayed
		Assert.assertTrue(true, "is displayed");
		selected = driver.findElement(By.xpath("//button[@id='button-one']")).isSelected();
		Assert.assertTrue(true, "is selected");
	}
	
	@Test(description= "home work")
	public void inputMessage() {
		String type,expType="input",output,input="new message";
		Boolean enabled,flag=false;
		type = driver.findElement(By.xpath("//input[@id='single-input-field']")).getTagName();
		if(type.equals(expType)) {
			flag=true;
			driver.findElement(By.xpath("//input[@id='single-input-field']")).sendKeys(input);
		}
		Assert.assertTrue(flag, "not input");
		
		enabled = driver.findElement(By.xpath("//button[@id='button-one']")).isEnabled(); 
		if(enabled==true) {
		 driver.findElement(By.xpath("//button[@id='button-one']")).click();
		}
		Assert.assertTrue(enabled, "not enabled");
		output=driver.findElement(By.xpath("//div[@id='message-one']")).getText();
		if(output.equals("Your message :"+input)) {
			flag=true;
		}
		Assert.assertTrue(flag, "message different");
	}
}
