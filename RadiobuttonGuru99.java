package TestNGSample.TestNGSample;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class RadiobuttonGuru99 extends GuruBase {
	
	
	@Test(description="radio buttons deselected by default")
	public void noRadioButtonsDeselected() {
	Boolean radioYes,radioNo;
	radioYes=driver.findElement(By.xpath("//input[@id='yes']")).isSelected();
	radioNo=driver.findElement(By.xpath("//input[@id='no']")).isSelected();
	if(radioNo==false) {
		driver.findElement(By.xpath("(//input[@name='name'])[2]")).click();
	}
	}
}
