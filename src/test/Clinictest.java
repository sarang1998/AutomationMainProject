package test;

import org.testng.annotations.Test;

import page.Clinicpage;

public class Clinictest extends Logintest{

	@Test(priority=2)
    public void test2() throws InterruptedException 
    {
      Clinicpage ob=new Clinicpage(driver);
      ob.clinicc();
      Thread.sleep(3000);
      ob.scrolldown();
      Thread.sleep(3000);
      
     
    } }