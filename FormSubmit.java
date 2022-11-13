package TestNGSample.TestNGSample;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class FormSubmit extends Base{

	@Test
	public void submitForm() {
		driver.findElement(By.xpath("//a[text()='Form Submit']")).click();
		driver.findElement(By.xpath("//input[@id='validationCustom01']")).sendKeys("Geethu");
		driver.findElement(By.xpath("//input[@id='validationCustom02']")).sendKeys("A");
		driver.findElement(By.xpath("//input[@id='validationCustomUsername']")).sendKeys("geethua");
		driver.findElement(By.xpath("//input[@id='validationCustom03']")).sendKeys("kochi");
		driver.findElement(By.xpath("//input[@id='validationCustom04']")).sendKeys("kerala");
		driver.findElement(By.xpath("//input[@id='validationCustom05']")).sendKeys("685124");
		driver.findElement(By.xpath("//input[@id='invalidCheck']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
	}
}
