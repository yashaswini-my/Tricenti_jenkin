#gherkin 
@all
Feature: Login Action
@account_Creation
Scenario: Create account with valid Email and create password
Given User is on Home Page
When User Navigate to Account Creation Page
And User enters First name, Last Name, Email creates password
Then Message displayed Account created successfully

@unsuccesful_login
Scenario: Login with invalid Credentials
Given User is on Home Page
When User Navigate to LogIn Page
And User enters inavalid UserName and Password
Then Message displayed Login failed

@succesful_login
Scenario: Login with Valid Credentials
Given User is on Home Page
When User Navigate to LogIn Page
And User enters Valid UserName and Password
Then Message displayed Login Successfull

@hover1
Scenario: Search for product by clicking on product and add the first item to the cart
Given User is on Home Page
When User Navigate to LogIn Page
And User enters Valid UserName and Password
Given User hovers on Computer category and clicks on Desktop
When user clicks on Add to Cart for the first desktop
Then user should be able to add the same item into cart and get confirmation message

@shopping_cart
Scenario: Product Details 
Given User is on Home Page
When User Navigate to LogIn Page
And User enters Valid UserName and Password
Given User hovers on Computer category and clicks on Desktop
When user clicks on Add to Cart for the first desktop
Then user should be able to add the same item into cart and get confirmation message
And clicks on shopping cart link.

@succesful_logout
Scenario: Successful Logout
When User Logout from the Application
Then Message displayed Logout Successfully