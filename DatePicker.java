package TestNGSample.TestNGSample;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DatePicker extends Base {

	@Test(priority = 0)
	public void navigate() {
		String actualHeader = "Date Picker", expHeader;
		driver.findElement(By.xpath(" //a[contains(text(),'Date Pickers')]")).click();
		expHeader = driver.findElement(By.xpath("(//div[@class='card-header'])[2]")).getText();
		Assert.assertEquals(expHeader, actualHeader, "Page loaded Successfully");
	}

	@Test(priority = 1)
	public void datePicker() {
		String inMessage = "02/11/2022";
		driver.findElement(By.xpath(" //a[contains(text(),'Date Pickers')]")).click();
		driver.findElement(By.xpath("//input[@id='single-input-field']")).click();
		driver.findElement(By.xpath("//div[@class='datepicker-days']/table/tbody/tr[1]/td[4]")).click();
		driver.findElement(By.xpath("//button[@id='button-one']")).click();
		String outMessage = driver.findElement(By.xpath("//div[@id='message-one']")).getText();
		Assert.assertEquals(outMessage, "Date : " + inMessage, "date is same");
	}

}
