package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.Loginpage;

public class Logintest {
	WebDriver driver;
    @BeforeTest
    public void setup()
    {
      driver=new ChromeDriver();
      driver.get("https://www.drsheths.com");
      driver.manage().window().maximize();     }
    @Test(priority=1)
    public void test1() throws InterruptedException 
    {
      Loginpage ob=new Loginpage(driver);
      ob.click();
      Thread.sleep(3000);
      ob.setvalues("sarang410@gmail.com", "sarang123");
      Thread.sleep(4000);
      ob.click1();
      Thread.sleep(3000);
      
      
    }
}
