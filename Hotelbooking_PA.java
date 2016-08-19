

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Hotelbooking_PA {
	 
	  private String baseUrl;
	  private boolean acceptNextAlert = true;
	  private StringBuffer verificationErrors = new StringBuffer();
	  
	  public static void main(String[] args)  throws Exception {

    	WebDriver driver = new FirefoxDriver();
	    driver.get("http://52.50.87.129:3001/");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	    testHotelPreetifromIDE(driver);
	    driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	    testHotelCheckInDelete(driver);
	  }
	  
	  public static void testHotelPreetifromIDE(WebDriver driver) throws Exception {
		
	    driver.findElement(By.id("firstname")).clear();
	    driver.findElement(By.id("firstname")).sendKeys("abc");
	    driver.findElement(By.id("lastname")).clear();
	    driver.findElement(By.id("lastname")).sendKeys("abc");
	    driver.findElement(By.id("totalprice")).clear();
	    driver.findElement(By.id("totalprice")).sendKeys("10");
	    driver.findElement(By.id("checkin")).clear();
	    driver.findElement(By.id("checkin")).sendKeys("2016-08-18");
	    driver.findElement(By.id("checkout")).clear();
	    driver.findElement(By.id("checkout")).sendKeys("2016-08-01");
	    driver.findElement(By.xpath("//input[@type='button' and @value=' Save ']")).click();
	    
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.id("firstname")).clear();
	    driver.findElement(By.id("firstname")).sendKeys("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
	    driver.findElement(By.id("lastname")).clear();
	    driver.findElement(By.id("lastname")).sendKeys("b");
	    driver.findElement(By.id("totalprice")).clear();
	    driver.findElement(By.id("totalprice")).sendKeys("1000");
	    new Select(driver.findElement(By.id("depositpaid"))).selectByVisibleText("false");
	    driver.findElement(By.id("checkin")).clear();
	    driver.findElement(By.id("checkin")).sendKeys("2016-08-18");
	    driver.findElement(By.id("checkout")).clear();
	    driver.findElement(By.id("checkout")).sendKeys("2016-08-01");
	    driver.findElement(By.xpath("//input[@type='button' and @value=' Save ']")).click();
	   
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.id("firstname")).clear();
	    driver.findElement(By.id("firstname")).sendKeys("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
	    driver.findElement(By.id("lastname")).clear();
	    driver.findElement(By.id("lastname")).sendKeys("b");
	    driver.findElement(By.id("totalprice")).clear();
	    driver.findElement(By.id("totalprice")).sendKeys("1000");
	    new Select(driver.findElement(By.id("depositpaid"))).selectByVisibleText("false");
	    driver.findElement(By.id("checkin")).clear();
	    driver.findElement(By.id("checkin")).sendKeys("2016-08-18");
	    driver.findElement(By.id("checkout")).clear();
	    driver.findElement(By.id("checkout")).sendKeys("2016-08-01");
	    driver.findElement(By.xpath("//input[@type='button' and @value=' Save ']")).click();
	    
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    
	    driver.findElement(By.id("firstname")).clear();
	    driver.findElement(By.id("firstname")).sendKeys("xyz");
	    driver.findElement(By.id("lastname")).clear();
	    driver.findElement(By.id("lastname")).sendKeys("qwe");
	    driver.findElement(By.id("totalprice")).clear();
	    driver.findElement(By.id("totalprice")).sendKeys("1000");
	    new Select(driver.findElement(By.id("depositpaid"))).selectByVisibleText("false");
	    driver.findElement(By.id("checkin")).clear();
	    driver.findElement(By.id("checkin")).sendKeys("2016-08-18");
	    driver.findElement(By.id("checkout")).clear();
	    driver.findElement(By.id("checkout")).sendKeys("2016-08-01");
	   	    
	    driver.findElement(By.xpath("//input[@type='button' and @value=' Save ']")).click();
	    


}
	  
	  public static void testHotelCheckInDelete(WebDriver driver) throws Exception {
		  
		  String cssSelectorOfSameElements="input[type='button'][value='Delete']";
		  List<WebElement> buttonElements=driver.findElements(By.cssSelector(cssSelectorOfSameElements)) ;
		  if(buttonElements !=null && buttonElements.size()>0)
		  {
			  
			  for (int i =0;i<buttonElements.size();i++)
			  {
				  driver.findElement(By.xpath("//input[@type='button' and @value='Delete']")).click();
				  driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			  }
			
		  }
				 		 
		  System.exit(0);
	  }
}
	  
	  

