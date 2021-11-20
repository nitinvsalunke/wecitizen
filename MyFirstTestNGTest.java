package scripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

public class MyFirstTestNGTest {
	WebDriver driver; // It is an Interface in Java
	
	// With @BeforeMethod and @AfterMethod
	
	/*@BeforeMethod
	public void beforeMethod() {
		System.out.println("I am in Before Method");
		System.setProperty("webdriver.chrome.driver","F:\\MyWorkspace\\WebdriverTraining\\test\\resources\\chromedriver - 93.exe");
		driver = new ChromeDriver();
	}
	

	@Test
	public void testNicheThyselfLogin() {
		
		System.out.println("I am in testNicheThyselfLogin Method");
		
		driver.get("https://nichethyself.com/tourism/home.html");

		WebElement user = driver.findElement(By.name("username"));
		user.sendKeys("stc123");

		driver.findElement(By.name("password")).sendKeys("12345"); // Method Chaining in Java
		driver.findElement(By.name("password")).submit(); // Submit the form
		
		String expectedTitle = "My account";
		String actualTitle = driver.getTitle();
		
		if(expectedTitle.equals(actualTitle))
			System.out.println("Test Case Pass");
		else
			System.out.println("Test Case Fail");
		
		assertEquals(expectedTitle,actualTitle);
	}
	

	@AfterMethod
	public void afterMethod() {
		System.out.println("I am in Before Method");
		driver.quit();
	}*/
	
	
	
	// With @BeforeClass and @AfterClass
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("I am in Before Method");
		System.setProperty("webdriver.chrome.driver","F:\\MyWorkspace\\WebdriverTraining\\test\\resources\\chromedriver - 93.exe");
		driver = new ChromeDriver();
	}
	

	@BeforeSuite
	public void beforeSuitMethod(){
		System.out.println("Inside Before Suite Test 2 ");
	}
	
	@AfterSuite
	public void afterSuitMethod(){
		System.out.println("Inside After Suite Test 2 ");
	}
	
	@BeforeTest
	public void beforeTestMethod(){
		System.out.println("Inside Before Test Test 2 ");
	}
	
	@AfterTest
	public void afterTestMethod(){
		System.out.println("Inside After Test Test 2 ");
	}
	
	@Test
	public void testNicheThyselfLogin1() {
		
		System.out.println("I am in testNicheThyselfLogin Method");
		
		driver.get("https://nichethyself.com/tourism/home.html");

		WebElement user = driver.findElement(By.name("username"));
		user.sendKeys("stc123");

		driver.findElement(By.name("password")).sendKeys("12345"); // Method Chaining in Java
		driver.findElement(By.name("password")).submit(); // Submit the form
		
		String expectedTitle = "My account";
		String actualTitle = driver.getTitle();
		
		assertEquals(expectedTitle,actualTitle);
	}
	
	
	@Test
	public void googleLaunch() {
		System.out.println("I am in google Launch Method");
		
		driver.get("https://www.google.com/");
		
	}

	@AfterClass
	public void afterClass() {
		System.out.println("I am in Before Method");
		driver.quit();
	}
	

}
