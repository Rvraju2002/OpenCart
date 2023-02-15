package mainCode;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import AbstractComponents.resusableCode;
import BaseCode.basecode;
import SpilitCodes.LoginPage;

public class ValidateLoginPage extends basecode{
	resusableCode res;
	@Test
	public void validateLoginLinkOnHomePage() {
		
		res= new resusableCode(Driver);
		res.MyAccount();
		res.loginlink();
		String Title=Driver.getTitle();
		Assert.assertEquals(Title, "Account Login");
	}
	@Test
	public void VerifySpellingLoginPage() {
		res= new resusableCode(Driver);
		res.MyAccount();
		res.loginlink();
		LoginPage page = new LoginPage(Driver);
		String EmilSpelling=page.spellingofEmailoginPage();
		Assert.assertEquals(EmilSpelling, "E-Mail Address");
		String PasswordSpelling=page.spellingofpasswordLoginPage();
		Assert.assertEquals(PasswordSpelling, "Password");
		String forgettenPwsSpelling=page.spellingforgetpwdloginPage();
		Assert.assertEquals(forgettenPwsSpelling, "Forgotten Password");
		String loginbtnspelling=page.loginspelling();
		Assert.assertEquals(loginbtnspelling, "Login");
	}
	
	@Test
	public void  Email_Case_Insensitive_Verification() throws InterruptedException {
		res= new resusableCode(Driver);
		res.MyAccount();
		res.loginlink();
		LoginPage page = new LoginPage(Driver);
		page.LoginApplication("RaJu@gmail.com", "12345");
		String Tilte=Driver.getTitle();
		Assert.assertEquals(Tilte, "My Account");
	}
	

}
