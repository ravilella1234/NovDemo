package parallel;

import org.testng.annotations.Test;

public class TestMethod 
{
	
  @Test
  public void sampleTest1() 
  {
	  System.out.println("iam sampleTest1 : " + Thread.currentThread().getId());
  }
  
  @Test
  public void sampleTest2() 
  {
	  System.out.println("iam sampleTest2 : "+ Thread.currentThread().getId());
  }
}
