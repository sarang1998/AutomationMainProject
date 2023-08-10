package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Contactpage {
	WebDriver driver;
	  By contact =By.xpath("//*[@id=\"main-top-nav\"]/div/div/ul/li[6]/a/span");
	  By shop=By.xpath("//*[@id=\"main-top-nav\"]/div/div/ul/li[1]/a/span[1]");
	  By search=By.name("s");
	  By home1=By.xpath("/html/body/div[4]/div/header/div[1]/div[2]/div[1]/div[3]/a/img");
	  By drs1=By.xpath("/html/body/div[4]/div[1]/div[2]/div[1]/div/div[2]/div/div[2]/div[1]/div/div[1]/div/div[1]/div/div/div/select");
	  By sign=By.xpath("//*[@id=\"shopify-section-header-toplink-menu\"]/ul/li/a");
	  By logout=By.xpath("/html/body/div[5]/div/div[2]/div/div/div[2]/div/div/div/div/div[1]/h5/span/a");
	  By drshethss=By.xpath("//*[@id=\"shopify-section-header-toplink-menu\"]/ul/li/a");

	  
	  
	  public Contactpage(WebDriver driver) {
	    // TODO Auto-generated constructor stub
	    this.driver=driver;
	  }

	  public void scrolldown3()
	  {
	    driver.findElement(contact).click();
	    }
	  public void homes()
	  {
	    driver.findElement(shop).click();
	  }
	  public void search1(String s)
	  {
	    WebElement n=driver.findElement(search);
	    n.sendKeys(s);
	    
	  }
	  public void home2()
	  {
	    driver.findElement(home1).click();
	  }
	  public void click3()
	  {
	      driver.findElement(drs1).click();
	      WebElement op=driver.findElement(drs1);
	      Select s=new Select(op);
	      s.selectByIndex(4);
	  }
	  public void click()
	  {
	    driver.findElement(drshethss).click();
	  }

	   
	  public void singup()
	  {
	    driver.findElement(sign).click();

	  }
	 /* public void log()
	  {
      
	  driver.findElement(logout).click();
	  }*/
}
