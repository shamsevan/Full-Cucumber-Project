package hooks;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

import factory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class myhooks {
	public static WebDriver driver;
	
	
	@Before
	public void setup() {
		
		DriverFactory.ibrowsers("chrome");
		driver=DriverFactory.getDriver();//new chromedriver() 
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.get("http://tutorialsninja.com/demo/");		
	}
	
	@After
	public void teardown() {
		driver.quit();
	}
	

}
