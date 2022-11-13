package TestNGSample.TestNGSample;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GetCSSValue extends Base{
	@Test
	public void getBackgroundColour() {
		String backgroundColor,expColour="rgba(0, 123, 255, 1)";
		backgroundColor=driver.findElement(By.xpath("//button[@id='button-one']")).getCssValue("background-color");
		Assert.assertEquals(expColour, backgroundColor);
	}
	@Test
	public void getCssColour() {
		String colour,expcolour="rgba(255, 255, 255, 1)";
		colour=driver.findElement(By.xpath("//button[@id='button-one']")).getCssValue("color");
		Assert.assertEquals(expcolour, colour);
	}
	
	@Test
	public void getLocation() {
		int buttonLocation,messageLocation;
		boolean flag=false;
		buttonLocation=driver.findElement(By.xpath("//button[@id='button-one']")).getLocation().getY();
		messageLocation=driver.findElement(By.xpath("//div[@id='message-one']")).getLocation().getY();
		if(messageLocation>buttonLocation) {
			flag=true;
		}
		Assert.assertTrue(flag, "Your message text is located above the show message button");
	}
}
