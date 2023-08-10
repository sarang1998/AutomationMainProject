package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Cartpage {
	WebDriver driver;
	  
	  By cart=By.xpath("//button[@class=\"btn-cart add-to-cart bordered uppercase hs-event-static\"]");
	  
	  public Cartpage(WebDriver driver) {
	    // TODO Auto-generated constructor stub
	    this.driver=driver;
	  }
	  public void cart1()
	  {
	    //JavascriptExecutor js=(JavascriptExecutor) driver;
	      //js.executeScript("window.scrollTo(0,500)");
	    driver.findElement(cart).click();
	  }
	  public void login4()
	  {
	    driver.navigate().back();
	    
	  }
	  public void navigate()
	    {
	    driver.navigate().to("https://www.drsheths.com/");
	    }
}
