package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class OrangeLogin {
WebDriver driver;
public OrangeLogin(WebDriver driver) {
	this.driver=driver;
}
	
	@FindBy(how=How.XPATH,using="//input[@id=\"txtUsername\"]")
	 WebElement USER_NAME_LOCATOR;
	@FindBy(how=How.XPATH,using="//input[@id=\"txtPassword\"]")
	 WebElement PASSWORD_LOCATOR;
	@FindBy(how=How.XPATH,using="//input[@id=\"btnLogin\"]")
	 WebElement SIGN_IN_LOCATOR;

public void ValidUser(String name) {
	USER_NAME_LOCATOR.sendKeys(name);
	
}
public void VaildPassword(String password) {	
	PASSWORD_LOCATOR.sendKeys(password);
	
}	
public void SignIn() {
	SIGN_IN_LOCATOR.click();
	
}

}






