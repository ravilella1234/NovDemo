package com.project.SeptemberSelenium12PMMaven;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterMethod;

public class TC_006 extends BaseTest
{
	
 
  @BeforeMethod
  @Parameters("browser")
  public void beforeMethod(String bType) throws Exception 
  {
	  	init();
		test = report.startTest("TC_006");
		test.log(LogStatus.INFO, " ***********************   TC_003 Started  *************************");
		test.log(LogStatus.INFO, "Initializing the Properties files...");
		
		
		launch(bType);
		test.log(LogStatus.INFO, "Opening the browser : " + p.getProperty("chromebrowser"));
		
		navigateUrl("amazonurl");
		test.log(LogStatus.PASS, "Navigating the Url : " + childProp.getProperty("amazonurl"));
  }
  
  
  @Test
  public void f() 
  {
	    selectItem("amazondropbox_id","Books");
		test.log(LogStatus.INFO, "Selected the item Books By using the locator :- " + orProp.getProperty("amazondropbox_id"));
		
		type("amazonsearchtext_id","Harry potter");
		test.log(LogStatus.INFO, "Entered the Harry Potter By using locator :- " +orProp.getProperty("amazonsearchtext_id"));
				
		elementClick("amazonsearchbutton_xpath");
		test.log(LogStatus.INFO, "Clicked on SearchButton By using locator :- " + orProp.getProperty("amazonsearchbutton_xpath"));	
  }
  

  @AfterMethod
  public void afterMethod() 
  {
	  driver.quit();
	  
	  report.endTest(test);
	  report.flush();
  }

}
