package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Hooks.Hooks;
import POM_test.Page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStep {
	WebDriver driver;
	Hooks hk;
	Page p;
	@Given("login page should be open in default browser")
	public void login_page_should_be_open_in_default_browser() {
		hk=new Hooks(driver);
		hk.setup();
		 
	}

	@When("^click on username field and add valid user (.*) and (.*) (.*)$")
	public void click_on_username_field_and_add_valid_user_username1_and_password1_status(String username1,String password1, String status) {
		
		p=new Page(driver);
		p.login(username1,password1,status);
	   
	}

    @Then("login successfully and redirect to home page")
	public void login_successfully_and_redirect_to_home_page() {
	  hk.closestmt();
	}

}
//tira beauty    
//amazon
//DemoQA form Automation practice form
//Ebay
//Open cart(Titorials ninja)
// Nykaa
//Tricentis
//swag labs
//Flip cart
//
