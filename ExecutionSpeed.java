package TestNGSample.TestNGSample;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ExecutionSpeed extends Base{

	@Test
	public void idSpeed() {
		driver.findElement(By.id("twotabsearchtextbox"));
	}
	@Test
	public void classSpeed() {
		driver.findElement(By.className("nav-input nav-progressive-attribute"));
	}
	@Test
	public void cssSpeed() {
		driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"));
	}
	@Test
	public void xpathSpeed() {
		driver.findElement(By.xpath("//input[@type='text']"));
	}
}
