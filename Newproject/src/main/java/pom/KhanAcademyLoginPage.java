package pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class KhanAcademyLoginPage {
	
	
			@FindBy(xpath = "//input[@data-test-id=\"identifier-field\"]") private WebElement email;
			@FindBy(xpath = "//input[@data-test-id='password-field' ] ") private WebElement passWord;
			@FindBy(xpath = "/la[text()='Forgot password?']")private WebElement forgotPassword;
			@FindBy(xpath = "//button[@type='submit']") private WebElement submit;
			
			
			public KhanAcademyLoginPage (WebDriver driver) {
			PageFactory.initElements(driver, this);
			}
			
			public void enterEmail(String emailId, WebDriver driver) {
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofMillis(5000));
			wait.until(ExpectedConditions.invisibilityOf(email));
			email.sendKeys(emailId);
			}
			public void enterPassword(String pass) {
			passWord.sendKeys(pass);
			}
			
			public void clickOnForgot() {
			forgotPassword.click();
			}
			
			public void clickonSubmit() {
			submit.click() ;

}
}
			
			