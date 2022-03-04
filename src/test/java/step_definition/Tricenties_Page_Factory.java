package step_definition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Tricenties_Page_Factory 
{
	WebDriver driver;

	public Tricenties_Page_Factory(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how=How.XPATH, using="/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a") 
	WebElement Register;    

	@FindBy(how=How.ID, using="gender-male") 
	WebElement gender_male;

	@FindBy(how=How.ID, using="FirstName")
	WebElement fname;

	@FindBy(how=How.ID, using="LastName")
	WebElement lname;

	@FindBy(how=How.ID, using="Email")
	WebElement setemail;

	@FindBy(how=How.ID, using="Password")
	WebElement passwd;

	@FindBy(how=How.ID, using="ConfirmPassword")
	WebElement cnfpasswd;

	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[2]/form/div/div[2]/div[3]/div[2]/div[2]/span[2]/span")
	WebElement pwdError;
	
	@FindBy(xpath="//*[@id='register-button']")
	WebElement Regbutton;
	
	
	
	@FindBy(xpath=" /html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]")
	WebElement AccntCreationMsg;
	 
	@FindBy(xpath="/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")
	WebElement LoginPage;
	@FindBy(how=How.ID, using="Email")
	WebElement Login_Email;
	@FindBy(how=How.ID, using="Password")
	WebElement Login_Pwd;
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")
	WebElement LoginBtn;
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[1]/div")
	WebElement LoginFailMsg;
	@FindBy(xpath="/html/body/div[4]/div[1]/div[2]/ul[1]/li[2]/a")
	WebElement H_Computer;
	@FindBy(xpath="/html/body/div[4]/div[1]/div[2]/ul[1]/li[2]/ul/li[1]/a")
	WebElement H_Desktop;
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[1]/div/div[2]/h2/a")
	WebElement First_Product;
	@FindBy(how=How.ID, using="add-to-cart-button-72")
	WebElement Add_to_Cart;
	@FindBy(xpath="//*[@id='bar-notification']/p")
	WebElement AddToCart_Msg;
	@FindBy(xpath="//*[@id='topcartlink']/a")
	WebElement Shopping_Cart;
	
	public void Register() 
	{
		Register.click();

	}
	public void gender_male() 
	{
		gender_male.click();
	}

	public void fname(String firstname) 
	{
		fname.sendKeys(firstname);
	}

	public void lname(String lastname) 
	{
		lname.sendKeys(lastname);
	}

	public void setemail(String email)
	{
		setemail.sendKeys(email);
	}

	public void passwd(String pwd) 
	{
		passwd.sendKeys(pwd);
	}

	public void cnfpasswd(String cnfpwd) 
	{
		cnfpasswd.sendKeys(cnfpwd);
	}

	public void Regbutton() 
	{
		Regbutton.click();
	}
	public void pwdError()
	{
		String passwdError = pwdError.getText();
		System.out.println(passwdError);	
	}
	public void AccntCreationMsg() 
	{
		String msg=AccntCreationMsg.getText();
		System.out.println(msg);

	}
	public void LoginPage() 
	{
		LoginPage.click();

	}
	public void Login_Email(String email) 
	{
		Login_Email.sendKeys(email);

	}
	public void Login_Pwd(String pwd) 
	{
		Login_Pwd.sendKeys(pwd);

	}
	public void LoginBtn() 
	{
		LoginBtn.click();
	}
	public void LoginFailMsg() 
	{
		String FailMsg=LoginFailMsg.getText();
		System.out.println(FailMsg);
	}
	public void H_Computer()
	{	
		Actions act = new Actions(driver);
		act.moveToElement(H_Computer).moveToElement(H_Desktop).click().build().perform();
	}
	public void First_Product()
	{
		First_Product.click();		
	}
	public void Add_to_Cart()
	{
		Add_to_Cart.click();		
	}
	public void AddToCart_Msg()
	{
		String Product_msg=AddToCart_Msg.getText();
		System.out.println(Product_msg);
	}
	public void Shopping_Cart()
	{
		Actions act = new Actions(driver);
		act.moveToElement(Shopping_Cart).click().build().perform();
	}
}