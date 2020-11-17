package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	@FindBy(linkText="Sign in")WebElement login;
	@FindBy(id="email")WebElement emailAddress;
	@FindBy(id="passwd")WebElement emailPassword;
	@FindBy(id="SubmitLogin")WebElement signIn;
	@FindBy(xpath="//li[contains(text(),'Authentication failed.')]")WebElement loginError;
	
	public LoginPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}

	public void userLogin() throws Exception
	{
		//Thread.sleep(3000);
		login.click();
		emailAddress.sendKeys("qatest76565@gmail.com");
		emailPassword.sendKeys("password");
		signIn.click();
	}
	
	public  String getLoginError()
	{
		return loginError.getText();
	}
	

}
