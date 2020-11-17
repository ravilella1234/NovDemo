package exceldatadriven;

import java.util.Hashtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.SkipException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.project.SeptemberSelenium12PMMaven.BaseTest;

public class Facebook1 extends BaseTest
{
  @Test(dataProvider = "getData")
  public void f(Hashtable<String, String> data) 
  {
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\Sept Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		 if(data.get("RunMode").equals("N"))
			  throw new SkipException("Testcase is set to no...");
		
		driver.findElement(By.id("email")).sendKeys(data.get("UserName"));
		driver.findElement(By.id("pass")).sendKeys(data.get("Pasword"));
  }
  
  
  @DataProvider
  public Object[][] getData() throws Exception
  {
	  ExcelAPI e = new ExcelAPI("C:\\Users\\DELL\\Desktop\\SuiteA.xlsx");
	  sheetName = "Data";
	  testCaseName = "LoginTest";
		
	  return DataUtils.getTestData(e, sheetName, testCaseName); 
  }
}
