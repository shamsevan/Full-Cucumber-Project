package Step_Definitions;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_StepDef {
	public static WebDriver driver; 
	
	
	@Given("I navigate to login page")
	public void i_navigate_to_login_page() {
	    driver= DriverFactory.getDriver();
	    driver.findElement(By.xpath("//span[text()='My Account']")).click();
	    driver.findElement(By.linkText("Login")).click();    
	}
	
	

	@When("I enter valid email id {string} in the email field")
	public void i_enter_valid_email_id_in_the_email_field(String Validemail) {
	  driver.findElement(By.id("input-email")).sendKeys(Validemail);
	}

	@When("I enter the valid password {string} in the password field")
	public void i_enter_the_valid_password_in_the_password_field(String ValidPass) {
	   driver.findElement(By.name("password")).sendKeys(ValidPass);
	}

	@When("I click on the Login button")
	public void i_click_on_the_login_button() {
	  driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
	}

	@Then("i am successfully logged in")
	public void i_am_successfully_logged_in() {
	  WebElement editYourAcInfo= driver.findElement(By.linkText("Edit your account information"));
	  Assert.assertTrue(editYourAcInfo.isDisplayed(),"Supposed to Display edit your account info ");
	  
	}

	@When("I enter Invalid email id {string} in the email field")
	public void i_enter_invalid_email_id_in_the_email_field(String Invalidemail) {
		 driver.findElement(By.id("input-email")).sendKeys(Invalidemail);
	   
	}

	@When("I enter the Invalid password {string} in the password field")
	public void i_enter_the_invalid_password_in_the_password_field(String Invalidpass) {
		driver.findElement(By.name("password")).sendKeys(Invalidpass); 
	}

	@Then("i get a warning message aboud credential mismatch")
	public void i_get_a_warning_message_aboud_credential_mismatch() {
	   WebElement warningalert=driver.findElement(By.xpath("//div[contains(@class, 'alert-dismissible')]"));
	   Assert.assertTrue(warningalert.getText().contains("Warning: No match for E-Mail Address and/or Password."));
	   
	}

	@When("I do not enter any email in the email field")
	public void i_do_not_enter_any_email_in_the_email_field() {
		driver.findElement(By.id("input-email")).sendKeys("");
	}

	@When("I do not enter any password in the password Field")
	public void i_do_not_enter_any_password_in_the_password_field() {
		driver.findElement(By.name("password")).sendKeys("");
	}
}
