@TutorialsNinja_Login
Feature: login functionality of tutorialsNinja


@ValidCredentials
Scenario: Login with valid Credentials 
Given I navigate to login page 
When I enter valid email id "seleniumshams@gmail.com" in the email field 
And I enter the valid password "abc123" in the password field
And I click on the Login button 
Then i am successfully logged in 


@InvalidCredentials
Scenario: Login with Invalid Credentials 
Given I navigate to login page 
When I enter Invalid email id "abc@gmail.com" in the email field
And I enter the Invalid password "abc154" in the password field
And I click on the Login button
Then i get a warning message aboud credential mismatch 


@ValidEmailInvalidPassword 
Scenario: Login with Valid email and Invalid Password Credentials 
Given I navigate to login page 
When I enter valid email id "seleniumshams@gmail.com" in the email field 
And I enter the Invalid password "abc154" in the password field
And I click on the Login button
Then i get a warning message aboud credential mismatch 


@InvalidEmailValidPassword
Scenario: Login with Invalid email and valid Password Credentials 
Given I navigate to login page 
When I enter Invalid email id "abc@gmail.com" in the email field
And I enter the valid password "abc123" in the password field
And I click on the Login button
Then i get a warning message aboud credential mismatch 


@NoCredentials 
Scenario: Login without Credentials 
Given I navigate to login page 
When I do not enter any email in the email field
And I do not enter any password in the password Field
And I click on the Login button
Then i get a warning message aboud credential mismatch 




