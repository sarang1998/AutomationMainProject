package test;

import org.testng.annotations.Test;

import page.Servicespage;

public class Servicestest extends Carttest {
	@Test (priority=4)
    public void test4() throws InterruptedException 
    {
      Servicespage ob=new  Servicespage(driver);
      ob.scrolldown2();
    }
}
