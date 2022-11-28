package TestNGSample.TestNGSample;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropdownAssignment extends Base {
	@Test
	public void multiSelect() {
		driver.navigate().to("https://selenium.obsqurazone.com/jquery-select.php");
		Select multiSelected = new Select(driver.findElement(
				By.xpath("(//select[@class='js-states-multiple form-control select2-hidden-accessible'])")));
		if(multiSelected.isMultiple()) {
			multiSelected.selectByIndex(1);
			multiSelected.selectByIndex(2);
		}
	}
	@Test
	public void singleSelect() {
		driver.navigate().to("https://selenium.obsqurazone.com/jquery-select.php");
		Select singleSelected = new Select(driver.findElement(
				By.xpath("(//select[@class='js-states form-control select2-hidden-accessible'])")));
		singleSelected.selectByIndex(2);
}
}