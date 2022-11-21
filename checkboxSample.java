package TestNGSample.TestNGSample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class checkboxSample extends Base {

	@Test
	public void checkboxPage() {
		String actMessage,expmessage="Success - Check box is checked";
		driver.navigate().to("https://selenium.obsqurazone.com/check-box-demo.php");
		WebElement checkbox=driver.findElement(By.xpath("//input[@id='gridCheck']"));
		Boolean enabled=checkbox.isEnabled();
		if(enabled==false) {
			checkbox.click();
			if(checkbox.isSelected()) {
			actMessage=driver.findElement(By.xpath("//div[@id='message-one']")).getText();
			Assert.assertEquals(actMessage, expmessage);
		}
		Assert.assertTrue(checkbox.isSelected(), "button not selected");
	}
		Assert.assertTrue(enabled==false, "already selected");
}
}
