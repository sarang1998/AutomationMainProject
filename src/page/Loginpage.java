package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage {
	WebDriver driver;

	  By drshethss=By.xpath("//*[@id=\"shopify-section-header-toplink-menu\"]/ul/li/a");
	  By drshethemail=By.xpath("//*[@id=\"CustomerEmail\"]");
	  By drshethpass=By.xpath("//*[@id=\"CustomerPassword\"]");
	  By drshethsb= By.xpath("//*[@id=\"customer_login\"]/div[2]/div[2]/div/input");
	  
	  


	  public Loginpage(WebDriver driver) {
	    // TODO Auto-generated constructor stub
	    this.driver=driver;
	  }


	  public void click()
	  {
	    driver.findElement(drshethss).click();
	  }

	   
	  public void setvalues(String email, String pass)
	  {
	    driver.findElement(drshethemail).sendKeys(email);
	    
	    driver.findElement(drshethpass).sendKeys(pass);
	    
	  }

	    
	  public void click1()
	  {
	    driver.findElement(drshethsb).click();
	    
	  }
}
