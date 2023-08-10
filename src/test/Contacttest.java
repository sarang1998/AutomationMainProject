package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import page.Contactpage;

public class Contacttest extends Servicestest {
	@Test (priority=5)
    public void test5() throws InterruptedException 
    {
      Contactpage ob=new  Contactpage(driver);
      ob.scrolldown3();
      Thread.sleep(3000);
      ob.home2();
      Thread.sleep(3000);
      ob.homes();
      Thread.sleep(3000);  
      ob.click3();
      Thread.sleep(3000);
      ob.search1("sunscreen");
      Thread.sleep(3000);
      ob.click();
      Thread.sleep(3000);
      ob.home2();
      Thread.sleep(3000);
      ob.singup();
      Thread.sleep(3000);
      /*ob.log();
      Thread.sleep(3000);*/
    }
	@AfterTest
	public void teardown()
	{
		driver.quit();
	}
	
}
