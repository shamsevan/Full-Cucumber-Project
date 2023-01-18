package factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DriverFactory {
  public static WebDriver driver=null;//new ChromeDriver()
  
  public static void ibrowsers(String BrowserName) {
	  if(BrowserName.equalsIgnoreCase("Chrome")) {
		  driver=new ChromeDriver();
	  }
	  else if (BrowserName.equalsIgnoreCase("Edge")) {
		  driver=new EdgeDriver();
	  }  
	  
	
  }
	
  
  public static WebDriver getDriver() {
	  return driver;
  }
	
	
}
