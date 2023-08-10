package test;

import org.testng.annotations.Test;

import page.Cartpage;

public class Carttest extends Clinictest {
	@Test (priority=3)
    public void test3() throws InterruptedException 
    {
      Cartpage ob=new Cartpage(driver);
     // Thread.sleep(3000);
      ob.cart1();
      Thread.sleep(3000);
      ob.login4();
      Thread.sleep(3000);
      ob.navigate();
      Thread.sleep(3000);
      
    }
}
