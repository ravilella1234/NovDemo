package parallel;

import java.util.Arrays;

import org.testng.TestNG;

import com.project.SeptemberSelenium12PMMaven.BaseTest;

public class RunSuiteParallel extends BaseTest
{

	public static void main(String[] args)
	{
		//String[] s = new String[10];
		
		//String[] s1 = new String[] {"ravi","kiran"};
		
		TestNG t = new TestNG();
		t.setTestSuites(Arrays.asList(new String[] {projectPath + "//megasuite.xml"}));
		t.setSuiteThreadPoolSize(2);
		t.run();

	}

}
