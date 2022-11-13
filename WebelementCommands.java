package TestNGSample.TestNGSample;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class WebelementCommands  extends Base{
	@Test
	public void sendKeys() {
		driver.findElement(By.xpath("(//a[@class='nav-link'])[2]")).click();
		driver.findElement(By.xpath("//input[@id='single-input-field']")).sendKeys("sample");
		driver.findElement(By.xpath("//button[@id='button-one']")).click();
				}

}
