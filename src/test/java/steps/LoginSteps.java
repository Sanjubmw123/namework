package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Page.OrangeLogin;
import Util.BrowserFactory;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {
WebDriver driver;
OrangeLogin login;

@Given("^I am on hr site$")
public void i_am_on_hr_site() throws Throwable {
    driver=BrowserFactory.browser();
    login=PageFactory.initElements(driver,OrangeLogin.class);
    
}

@When("^I  enter username and password$")
public void i_enter_username_and_password() throws Throwable {
	login=PageFactory.initElements(driver,OrangeLogin.class);
    login.ValidUser("Admin");
    login.VaildPassword("admin123");
}

@When("^I click on sign in button$")
public void i_click_on_sign_in_button() throws Throwable {
    login.SignIn();
    throw new PendingException();
}
}
