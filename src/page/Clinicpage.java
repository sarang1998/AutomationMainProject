package page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Clinicpage {
	WebDriver driver;
	  By clinic=By.xpath("//*[@id=\"main-top-nav\"]/div/div/ul/li[2]/a");
	  By amla=By.xpath("//*[@id=\"products-grid\"]/div[1]/div/div[2]/div[1]/a/h3");
	  
	  
	  
	  
	  public Clinicpage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		  this.driver=driver;
	}
	public void clinicc()
	  {
	    driver.findElement(clinic).click();
	  }
	  public void scrolldown()
	  {
	    //driver.navigate().back();
	    JavascriptExecutor js=(JavascriptExecutor) driver;
	    js.executeScript("window.scrollTo(0,400)");
	    driver.findElement(amla).click();

	  }
}
