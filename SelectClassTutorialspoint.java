package TestNGSample.TestNGSample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SelectClassTutorialspoint extends GuruBase {
	@Test
	public void selectContinent() {
		Boolean continentIsDisplayed;
		String inputContinent = "Australia";
		continentIsDisplayed = driver.findElement(By.xpath("//select[@name='continents']")).isDisplayed();
		if (continentIsDisplayed) {
			Select continent = new Select(driver.findElement(By.xpath("//select[@name='continents']")));
			continent.selectByIndex(3);
			String selectedContinent = driver.findElement(By.xpath("//select[@name='continents']/option[4]")).getText();
			System.out.println("Selected continent is " + selectedContinent);
			Assert.assertEquals(inputContinent, selectedContinent);
		}
	}

	@Test
	public void prinAll() {
		Select objSelected = new Select(driver.findElement(By.xpath("//select[@name='continents']")));
		List<WebElement> element = objSelected.getOptions();
		int listCount = element.size();
		String continentValues = driver.findElement(By.xpath("//select[@name='continents']")).getText();
		System.out.println("All dropdown values are " + continentValues);
	}
}
