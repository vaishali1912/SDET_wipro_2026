package Hooks;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Hooks {
	WebDriver driver;
	public Hooks(WebDriver driver)
	{
		this.driver=driver;
	}
	
  @BeforeTest
  public void setup() {
	  // create browser object
	  // set url
	  // maximize browser
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://zero.webappsecurity.com/login.html");
  }

  @AfterTest
  public void closestmt() {
	 driver.close();
  }

}
