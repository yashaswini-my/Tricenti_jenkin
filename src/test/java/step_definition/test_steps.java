package step_definition;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class test_steps 
{
	public static WebDriver driver;
	Tricenties_Page_Factory tricent;
	

	@Before
	public void Open_Browser() throws IOException
	{
		//launching web browser....
		System.setProperty("webdriver.chrome.driver","C:\\selenium_all_jars\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		tricent =new Tricenties_Page_Factory(driver);
		driver.manage().window().maximize();
		tricent=PageFactory.initElements(driver, Tricenties_Page_Factory.class);

	}
	
	
	
	
	@Given("User is on Home Page")
	public void user_is_on_Home_Page() 
	{
		driver.get("http://demowebshop.tricentis.com/");
		System.out.println("User is on Home Page");
	}
	@When("User Navigate to Account Creation Page")
	public void user_navigate_to_register_page()
	{
		//driver.navigate().to("Register");
		//driver.findElement(By.linkText("Register")).click();
		tricent.Register();
		System.out.println("User is on account creation page");
	}

	@And("User enters First name, Last Name, Email creates password")
	public void enter_valid_details() throws InterruptedException
	{
		Thread.sleep(2000);
		tricent.gender_male();
		tricent.fname("hemanth");
		tricent.lname("harsha");
		tricent.setemail("hemanth1111@gmail.com");
		tricent.passwd("hemanth");
		tricent.cnfpasswd("hemanth");
		tricent.Regbutton();
		
	}

	@Then("Message displayed Account created successfully")
	public void registration_message()
	{
		
		tricent.AccntCreationMsg();
	}

	@When("User Navigate to LogIn Page")
	public void user_Navigate_to_LogIn_Page() 
	{
		driver.navigate().to("http://demowebshop.tricentis.com/login");
		System.out.println("user_Navigate_to_LogIn_Page()");

	}

	@When("User enters inavalid UserName and Password")
	public void user_enters_UserName_and_Password() 
	{
		tricent.Login_Email("");
		tricent.Login_Pwd("");
		tricent.LoginBtn();
		
	}

	@Then("Message displayed Login failed")
	public void message_displayed_Login_Successfully()
	{
		tricent.LoginFailMsg();
		System.out.println("Enter valid credentials");
	}


	@When("User enters Valid UserName and Password")
	public void user_enters_Valid_UserName_and_Password() throws InterruptedException 
	{
		Thread.sleep(2000);
		System.out.println("user_enters_UserName_and_Password()");
		tricent.Login_Email("hemanth1111@gmail.com");
		tricent.Login_Pwd("hemanth");
		Thread.sleep(2000);
		tricent.LoginBtn();	
	}

	@Then("Message displayed Login Successfull")
	public void message_displayed_Login_Successfull()
	{
	
		System.out.println("Loginned succesfully");
	}


	@Given("User hovers on Computer category and clicks on Desktop")
	public void user_hovers_on_Computer_category_and_clicks_on_Desktop() 
	{
		tricent.H_Computer();
		//tricent.H_Desktop();
		tricent.First_Product();
	}

	@When("user clicks on Add to Cart for the first desktop")
	public void user_clicks_on_Add_to_Cart_for_the_first_desktop() throws InterruptedException 
	{
		tricent.Add_to_Cart();
	}

	@Then("user should be able to add the same item into cart and get confirmation message")
	public void user_should_be_able_to_add_the_same_item_into_cart_and_get_confirmation_message() 
	{
		tricent.AddToCart_Msg();
		System.out.println("------------The product added succesffully-------------");
	}


	@And("clicks on shopping cart link.")
	public void clicks_on_shopping_cart_link()
	{
		tricent.Shopping_Cart();
	}
	@When("User Logout from the Application")
	public void user_Logout_from_the_Application() 
	{

	}


	@Then("Message displayed Logout Successfully")
	public void message_displayed_Logout_Successfully() 
	{

	}
}
