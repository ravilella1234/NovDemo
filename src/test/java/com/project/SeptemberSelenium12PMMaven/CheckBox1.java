package com.project.SeptemberSelenium12PMMaven;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

public class CheckBox1 extends BaseTest
{
  
	@BeforeMethod
	 @Parameters("browser")
	  public void beforeMethod(String bType) throws Exception 
	  {
		init();
		test = report.startTest("CheckBox1");
		test.log(LogStatus.INFO, " ***********************   TC_003 Started  *************************");
		test.log(LogStatus.INFO, "Initializing the Properties files...");
		
		
		launch(bType);
		test.log(LogStatus.INFO, "Opening the browser : " + p.getProperty("chromebrowser"));
		
		navigateUrl("checkboxurl");
		test.log(LogStatus.PASS, "Navigating the Url : " + childProp.getProperty("checkboxurl"));
			
	  }
	  
	  
	@Test
	public void checkboxTest()
	{
		List<WebElement> check=driver.findElements(By.xpath("//td[@class='table5']/input[@type='checkbox']"));
		for(int i=0;i<check.size();i++)
		{
			System.out.println(check.get(i).getAttribute("value")+"--"+check.get(i).getAttribute("checked"));
			//System.out.println(check.get(i).isSelected());
		}
	}
 

  @AfterMethod
  public void afterMethod() 
  {
	  driver.quit();
	  
	  report.endTest(test);
	  report.flush();
  }

}
