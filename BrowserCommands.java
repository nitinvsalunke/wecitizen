package scripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class BrowserCommands {
	WebDriver driver; 

	@BeforeClass
	public void preConditionsForAllTest() {
		System.out.println("Inside Before Class");
		System.setProperty("webdriver.chrome.driver","test\\resources\\chromedriver - 93.exe");
		driver = new ChromeDriver();
	}
	

	@Test
	public void browserCommands() {
		System.out.println("Inside Test ");
		
		driver.manage().window().maximize();
		
		driver.get("https://nichethyself.com/tourism/customised.html");
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Current URL : " + currentUrl);
		
		String getPageSourceCode = driver.getPageSource();
		System.out.println("Page Source by getPageSource webDriver Method : " + getPageSourceCode);
		
		driver.navigate().refresh();
		driver.get("http://www.google.com");
		
		driver.navigate().back();
		System.out.println("Current URL aftr driver.navigate().back() webDriver Method : " + driver.getCurrentUrl());
		
		driver.navigate().forward();
		System.out.println("Current URL aftr driver.navigate().forward() webDriver Method : " + driver.getCurrentUrl());
		
		driver.navigate().to("http://www.mevan.com/");
		System.out.println("Current URL aftr driver.navigate().to() webDriver Method : " + driver.getCurrentUrl());
	
		Dimension newDimension = new Dimension(700, 600);
		driver.manage().window().setSize(newDimension);
		
		//Thread.sleep(1000);

		Point newPoint = new Point(300, 500);
		driver.manage().window().setPosition(newPoint);
		
		//driver.manage().window().getPosition();
		System.out.println("Browser (x) Position : " + driver.manage().window().getPosition().x);
		System.out.println("Browser (getX) Position : " + driver.manage().window().getPosition().getX());
		System.out.println("Browser (y) Position : " + driver.manage().window().getPosition().y);
		System.out.println("Browser (getY) Position : " + driver.manage().window().getPosition().getY());
	}

	
	@AfterClass
	public void cleanUpAfterAllTestsAreExecuted() {
		System.out.println("Inside After Class");
		driver.quit();
	}

}
