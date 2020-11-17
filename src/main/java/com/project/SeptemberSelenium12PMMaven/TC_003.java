package com.project.SeptemberSelenium12PMMaven;

import com.relevantcodes.extentreports.LogStatus;

public class TC_003 extends BaseTest
{
	
	
	public static void main(String[] args) throws Exception 
	{
		
		
		init();
		test = report.startTest("TC_003");
		test.log(LogStatus.INFO, " ***********************   TC_003 Started  *************************");
		test.log(LogStatus.INFO, "Initializing the Properties files...");
		
		
		launch("chromebrowser");
		test.log(LogStatus.INFO, "Opening the browser : " + p.getProperty("chromebrowser"));
		
		navigateUrl("amazonurl");
		test.log(LogStatus.PASS, "Navigating the Url : " + childProp.getProperty("amazonurl"));
		
		selectItem("amazondropbox_id","Books");
		test.log(LogStatus.INFO, "Selected the item Books By using the locator :- " + orProp.getProperty("amazondropbox_id"));
		
		type("amazonsearchtext_id","Harry potter");
		test.log(LogStatus.INFO, "Entered the Harry Potter By using locator :- " +orProp.getProperty("amazonsearchtext_id"));
				
		elementClick("amazonsearchbutton_xpath");
		test.log(LogStatus.INFO, "Clicked on SearchButton By using locator :- " + orProp.getProperty("amazonsearchbutton_xpath"));
			
		test.log(LogStatus.INFO, " ***********************   TC_003 Ended  *************************");
		
		report.endTest(test);
		report.flush();
		
		
		//driver.findElement(By.id("searchDropdownBox")).sendKeys("Books");
		
		//driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Harry potter");
		
		//driver.findElement(By.xpath("//span[@id='nav-search-submit-text']//input[@class='nav-input']")).click();

	}

	
}
