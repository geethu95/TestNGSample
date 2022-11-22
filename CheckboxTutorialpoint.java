package TestNGSample.TestNGSample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckboxTutorialpoint extends GuruBase{
@Test
public void checkboxSelected() {
	WebElement RC,IDE,webDriver;
	RC=driver.findElement(By.xpath("//input[@value='RC']"));
	RC.isDisplayed();
	RC.isSelected();
	IDE=driver.findElement(By.xpath("//input[@value='Manual Tester']"));
	IDE.isDisplayed();
	IDE.isSelected();
	webDriver=driver.findElement(By.xpath("//input[@value='Selenium Webdriver']"));
	webDriver.isDisplayed();
	webDriver.isSelected();
}
@Test
public void selectOption() throws InterruptedException {
	WebElement webDriver=driver.findElement(By.xpath("((//span[@style='margin-right:8px'][3])[2])"));
	webDriver.click();
	Assert.assertTrue(webDriver.isSelected());
}
}
