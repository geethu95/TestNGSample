package TestNGSample.TestNGSample;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationSample {

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("this is before method");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("this is before class");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("this is before test");
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("this is before suite");
	}

	@Test(priority=0)
	public void test() {
		System.out.println("this is test 1");
	}
	
	@Test(priority=1)
	public void test2() {
		System.out.println("this is test 2");
	}
	@Test(priority=2)
	public void test3() {
		System.out.println("this is test 3");
	}
	@Test(priority=3)
	public void test4() {
		System.out.println("this is test 4");
	}
	@AfterSuite
	public void afterSuite() {
		System.out.println("this is after suite");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("this is before test");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("this is after class");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("this is after method");
	}
}
