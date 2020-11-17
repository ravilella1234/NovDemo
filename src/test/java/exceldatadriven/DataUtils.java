package exceldatadriven;

import java.util.Hashtable;

import com.project.SeptemberSelenium12PMMaven.BaseTest;

public class DataUtils extends BaseTest
{
	
	public static Object[][] getTestData(ExcelAPI e, String sheetName, String testName) throws Exception
	{
		
		
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
		Object[][] data = new Object[rows][1];
		
		Hashtable<String, String> table = null;
		for(int rNum=dataStartRowNum;rNum<dataStartRowNum+rows;rNum++)
		{
			table = new Hashtable<String, String>();
			for(int cNum=0;cNum<cols;cNum++)
			{
				//System.out.println(e.getCellData(sheetName, cNum, rNum));
				//data[datarow][cNum]= e.getCellData(sheetName, cNum, rNum);
				String key = e.getCellData(sheetName, cNum, colStartRowNum);
				String value = e.getCellData(sheetName, cNum, rNum);
				table.put(key, value);
			}
			data[datarow][0]= table;
			datarow++;
		}
		return data;  
		
	}

}
