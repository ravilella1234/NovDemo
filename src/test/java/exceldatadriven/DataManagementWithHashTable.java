package exceldatadriven;

import java.util.Hashtable;

import org.testng.SkipException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.project.SeptemberSelenium12PMMaven.BaseTest;

public class DataManagementWithHashTable extends BaseTest
{
	
  @Test(dataProvider = "getData")
  public void f(Hashtable<String, String> data) 
  {
	  if(data.get("RunMode").equals("N"))
		  throw new SkipException("Testcase is set to no...");
	  
	  System.out.println(data.get("UserName"));
	  System.out.println(data.get("Pasword"));
	  
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
