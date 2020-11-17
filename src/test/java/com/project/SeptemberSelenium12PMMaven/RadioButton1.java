package com.project.SeptemberSelenium12PMMaven;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

public class RadioButton1 extends BaseTest
{


	
	@BeforeMethod
	 @Parameters("browser")
	  public void beforeMethod(String bType) throws Exception 
	  {
		
		init();
		test = report.startTest("RadioButton1");
		test.log(LogStatus.INFO, " ***********************   TC_003 Started  *************************");
		test.log(LogStatus.INFO, "Initializing the Properties files...");
		
		
		launch(bType);
		test.log(LogStatus.INFO, "Opening the browser : " + p.getProperty("chromebrowser"));
		
		navigateUrl("radiourl");
		test.log(LogStatus.PASS, "Navigating the Url : " + childProp.getProperty("radiourl"));
			
	  }
	
	
	@Test
	public void radioButtonTest()
	{
		WebElement radio=driver.findElement(By.xpath("(//td[@class='table5'])[2]"));
		List<WebElement> rbutton=radio.findElements(By.name("group1"));
		for(int i=0;i<rbutton.size();i++)
		{
			System.out.println(rbutton.get(i).getAttribute("value")+ "----" + rbutton.get(i).getAttribute("checked"));
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
