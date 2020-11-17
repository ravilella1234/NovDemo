package pom;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.project.SeptemberSelenium12PMMaven.BaseTest;

public class TC_007 extends BaseTest
{
 
  @BeforeMethod
  public void startprocess() throws Exception 
  {
	  init();
	  launch("chromebrowser");
	  navigateUrl("automationurl");
  }
  
  @Test(enabled = false)
  public void loginTest() throws Exception 
  {
	  LoginPage p = new LoginPage(driver);
	  p.userLogin();
	  Assert.assertEquals(p.getLoginError(), "Authentication failed.");
  }
  
  @Test
  public void registration() throws Exception
  {
	  CustomerRegistrationPage cust = new CustomerRegistrationPage(driver);
	  cust.customerRegistration();
  }

  @AfterMethod
  public void endProcess() 
  {
	  //driver.quit();
  }

}
