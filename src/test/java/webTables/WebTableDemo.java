package webTables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableDemo 
{

	public static void main(String[] args) 
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\driver sources\\chromedriver_win32 (2)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		List<WebElement> tr_collection = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
		System.out.println("Number of Rows :" + tr_collection.size());
		
		for( WebElement trElement: tr_collection)
		{
			List<WebElement> td_collection = trElement.findElements(By.tagName("td"));
			for(WebElement tdElement : td_collection)
			{
				if(tdElement.getText().equals("Austria"))
				{
					System.out.println(tdElement.getText());
				}
			}
		}

	}

}
