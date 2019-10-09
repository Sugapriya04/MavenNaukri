package Profile;

import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageObjects.LoginPageObject;

import util.BaseTest;
import util.RealExcelData;



public class NaukriLogin extends BaseTest{

	
	

	public void verifyLoginTest() throws IOException {
		RealExcelData d1=new RealExcelData();
		ArrayList data=d1.getData("Valid");
	    String username=(String) data.get(0);
	    String password=(String) data.get(1);

		
		
		
		PageFactory.initElements(driver, LoginPageObject.class);
			
		LoginPageObject.username.sendKeys(username);
		
		LoginPageObject.password.sendKeys(password);
		
		LoginPageObject.loginButton.submit();
		//here using submit() instead of click() as the button type is submit in html
}
}