package POM_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Page {
WebDriver driver;
By user=By.id("user_login");
By pass=By.id("user_password");
By submitbutton=By.name("submit");
//By name=By.id(null);
//By email=By.id(null);
//By passwordtest=By.id(null);
//By confirmpass=By.id(null);
//By reg=By.id(null);
public Page(WebDriver driver)
{
	this.driver=driver;
}

public void login(String username1, String password1,String status)
{
	driver.findElement(user).click();
	driver.findElement(user).sendKeys(username1);
	driver.findElement(pass).click();
	driver.findElement(pass).sendKeys(password1);
	driver.findElement(submitbutton).click();
	System.out.println("Test case ="+status);
}
//public void reg()
//{
//	driver.findElement(name).click();
//	driver.findElement(name).sendKeys("Neeva sharma");
//	driver.findElement(email).click();
//	driver.findElement(email).sendKeys("abc@gmail.com");
//	driver.findElement(passwordtest).click();
//	driver.findElement(passwordtest).sendKeys("Neeva@123");
//	driver.findElement(confirmpass).click();
//	driver.findElement(confirmpass).sendKeys("Neeva@123");
//	driver.findElement(reg).click();
//	
//}

}
