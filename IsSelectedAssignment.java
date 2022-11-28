package TestNGSample.TestNGSample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class IsSelectedAssignment extends GuruBase {
	
	@Test
	public void buttonEnabled() {
		Boolean selected = null;
		WebElement redCheckbox;
		redCheckbox = driver.findElement(By.xpath("//input[@value='red']"));
		Boolean enabled = redCheckbox.isEnabled();
		if (enabled) {
			selected = redCheckbox.isSelected();
		}
		Assert.assertTrue(selected,"Checkbox is nselected");
	}

	@Test
	public void operaButton() {
		WebElement operaButton=driver.findElement(By.xpath("//input[@value='Opera']"));
		operaButton.click();
		Boolean result=operaButton.isSelected();
		Assert.assertTrue(result,"Selected");
		}
	}

