package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Servicespage {
	WebDriver driver;
	  By services=By.xpath("//*[@id=\"main-top-nav\"]/div/div/ul/li[3]/a/span");
	  
	  public Servicespage(WebDriver driver) {
	    // TODO Auto-generated constructor stub
	    this.driver=driver;
	  }

	  public void scrolldown2()
	  {
	    driver.findElement(services).click();
	    
	    }
}
