package TestNGSample.TestNGSample;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FormSubmit extends Base{
	
	

	@Test
	public void submitForm() {
		boolean selected,flag=false;
		String message,actualMsg="Form has been submitted successfully!";
		driver.findElement(By.xpath("//a[text()='Form Submit']")).click();
		driver.findElement(By.xpath("//input[@id='validationCustom01']")).sendKeys("Geethu");
		driver.findElement(By.xpath("//input[@id='validationCustom02']")).sendKeys("A");
		driver.findElement(By.xpath("//input[@id='validationCustomUsername']")).sendKeys("geethua");
		driver.findElement(By.xpath("//input[@id='validationCustom03']")).sendKeys("kochi");
		driver.findElement(By.xpath("//input[@id='validationCustom04']")).sendKeys("kerala");
		driver.findElement(By.xpath("//input[@id='validationCustom05']")).sendKeys("685124");
		selected=driver.findElement(By.xpath("//input[@id='invalidCheck']")).isSelected();
		if(selected) {
			driver.findElement(By.xpath("//input[@id='invalidCheck']")).click();
		}
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		message=driver.findElement(By.xpath("//div[@id='message-one']")).getText();
		if(message.equals(actualMsg)) {
			flag=true;
		}
		Assert.assertTrue(flag, "submitted successfully");
			}
	
}
