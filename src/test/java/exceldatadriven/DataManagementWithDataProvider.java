package exceldatadriven;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataManagementWithDataProvider 
{
	
  @Test(dataProvider = "getData")
  public void f(String obj1, String obj2,String obj3, String obj4,String obj5) 
  {
	  
  }
  
  @DataProvider
  public Object[][] getData() throws Exception
  {
	  
	  ExcelAPI e = new ExcelAPI("C:\\Users\\DELL\\Desktop\\SuiteA.xlsx");
		String sheetName = "Data";
		String testCaseName = "TestA";
		
		int testStartRowNum = 0;
		while(!e.getCellData(sheetName, 0, testStartRowNum).equals(testCaseName))
		{
			testStartRowNum++;
		}
		System.out.println("Test starts from row :- " + testStartRowNum);
		
		int colStartRowNum = testStartRowNum + 1;
		int dataStartRowNum = testStartRowNum +2;
		
		
		//calculate rows of Data
		int rows=0;
		while(!e.getCellData(sheetName, 0, dataStartRowNum+rows).equals(""))
		{
			rows++;
		}
		System.out.println("Total rows are :- " + rows);
		
		
		
		//calculate  total columns
		int cols=0;
		while(!e.getCellData(sheetName, cols, colStartRowNum).equals(""))
		{
			cols++;
		}
		System.out.println("Total columns are :- " + cols);
		
		
		
		//get the data
		int datarow=0;
		Object[][] data = new Object[rows][cols];
		for(int rNum=dataStartRowNum;rNum<dataStartRowNum+rows;rNum++)
		{
			for(int cNum=0;cNum<cols;cNum++)
			{
				//System.out.println(e.getCellData(sheetName, cNum, rNum));
				data[datarow][cNum]= e.getCellData(sheetName, cNum, rNum);
			}
		}
		return data;  
		  
  }
}
