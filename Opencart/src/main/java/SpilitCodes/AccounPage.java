package SpilitCodes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import AbstractComponents.resusableCode;

public class AccounPage extends resusableCode{
	
	WebDriver Driver;
	public AccounPage(WebDriver Driver) {
		super(Driver);
		this.Driver=Driver;
		PageFactory.initElements(Driver, this);
		
	}
	
	public productPage goToProductPage() throws InterruptedException {
		Thread.sleep(1000);
		WebElement des = Driver.findElement(By.xpath("//nav/div/ul/li[1]/a[1]"));
		Actions a = new Actions(Driver);
		a.moveToElement(des).build().perform();
		Driver.findElement(By.linkText("Show All Desktops")).click();
		return new productPage(Driver);
	}

}
