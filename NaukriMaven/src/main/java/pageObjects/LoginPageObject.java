package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPageObject {
	
	

	/*@FindBy(how=How.XPATH,using="//div[text()='Login'][@class='mTxt']")
	public static WebElement loginLink;*/
	
	@FindBy(how=How.ID,using="usernameField")
	public static WebElement username;
	
	@FindBy(how=How.ID,using="passwordField")
	public static WebElement password;	
	
	@FindBy(how=How.CSS,using="button[type=submit]")
	public static WebElement loginButton;
	
	@FindBy(how=How.ID,using="usernameField_err")
	public static WebElement usernameError;
		
	@FindBy(how=How.ID,using="passwordField_err")
	public static WebElement pwdError;
	

	
	
	
	
	
}
