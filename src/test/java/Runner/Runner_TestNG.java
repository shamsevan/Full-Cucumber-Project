package Runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"src/test/resources/features"},
		glue= {"factory","hooks","Step_Definitions"},
		plugin = {"pretty","html:target/htmlreports/CucumberReport.html","json:target/cucumberjson/json"},
		tags = ""		
		)





public class Runner_TestNG extends AbstractTestNGCucumberTests {
	
	
	
	

}
