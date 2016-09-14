package firsttestngpackage;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
//import org.testng.AssertJUnit;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstTestNGFile {
	public String baseUrl = "http://52.53.188.36";
	public WebDriver driver;
	
  @Test
  public void verifyHomepageTitle() {
	  driver.get(baseUrl + "/SampleWebApp/");
	  //AssertJUnit.assertEquals(driver.findElement(By.cssSelector("h2")).getText(), "Hello Whale!!!!!");
	  //AssertJUnit.assertEquals(driver.findElement(By.cssSelector("button")).getText(), "Click this!!!");
	  //driver.findElement(By.cssSelector("button")).click();
	  //AssertJUnit.assertEquals(driver.findElement(By.id("sampletext")).getText(), "YOU CLICKED ME! I CLICKED YOU!");
  }
  
  @BeforeTest
	public void beforeTest() {	
	    driver = new FirefoxDriver();  
	}		
	@AfterTest
	public void afterTest() {
		driver.quit();			
	}
	
  
}
