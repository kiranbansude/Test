package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Khanacademylandingpage {
	
	@FindBy (xpath = "//a[@id='login-or-signup']") private WebElement login;
	
	public Khanacademylandingpage(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}
	public void clickOnLogin() {

	login.click ();
	 }

}
